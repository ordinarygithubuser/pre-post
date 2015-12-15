package hsh.swa.ocl.jvmmodel

import com.google.inject.Inject
import hsh.swa.ocl.oCL.Context
import hsh.swa.ocl.oCL.Operation
import hsh.swa.ocl.oCL.PostConstraint
import hsh.swa.ocl.oCL.PreConstraint
import java.util.Vector
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class OCLJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension TypesFactory typesFactory
	
	/**
	 * Provides a mapping for all grammar rules to Java
	 */
   	def dispatch void infer(Context context, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
   		acceptor.accept(context.toClass("constraints." + context.getName + "Constraints")) [
   			val arg = context.createFirstArgument

			// Create instance variables for the actual constrained object and a
			// an object with the same signature called "prev". prev is the version
			// of the actual instance prior to the last mutation. If no mutation is
			// applied, prev is the same as the instance variable.
   			members += context.toField(arg.name, arg.parameterType)	
   			members += context.toField("prev", arg.parameterType)
   			
   			// Create a constructor that expects the instance variable as parameter.
   			members += context.toConstructor [
   				parameters += arg
   				body = ''' 
   					this.«arg.name» = «arg.name»; 
   					this.prev = this.«arg.name»;
   				'''
   			]
   			
   			// Loop over all defined operations and create their Java pendants.
   			// Creates all post and pre methods of the operation.
   			for (op: context.operations) {				
    			var counterPre = 0						// One counter would be enough
    			var counterPost = 0						// But this is easier to trace
    			val	preMethods = new Vector<String>();	// Store methods by condition type 
    			val postMethods = new Vector<String>(); // to call them in the correct order
    			
    			// Now create the the pre and post methods
   				for (constraint: op.constraints) {
	   				var methodName = ""
	   				
	   				switch constraint {
			   			PreConstraint: {
				   			methodName = "pre" + op.signature.name + (counterPre++) // lol
		   					preMethods.add(methodName)	
			   			}
			   			PostConstraint: {
			   				methodName = "post" + op.signature.name + (counterPost++) 
	   						postMethods.add(methodName)	
			   			}
			   		}
	   					   				
	   				members += constraint.toMethod(methodName, typeRef(Boolean)) [
	   					// Important: Copy the operation parameters to this scope
						for (param: op.signature.params) {
		   					parameters += constraint.toParameter(param.name, param.parameterType)	
		   				}
	   					visibility = JvmVisibility.PRIVATE
	   					body = constraint.body
	   				]
	   			}	
   				
   				// Create the operation. First a copy of the instance variable is saved
   				// in prev, then all pre methods get called. Next the original method on
   				// the instance variable is called and last the post methods. If the
   				// result is not void, it will be returned.
   				members += context.toMethod(op.signature.name, op.signature.type) [
	   				for (param: op.signature.params) {
	   					parameters += context.toParameter(param.name, param.parameterType)	
	   				}
	   				exceptions += Exception.typeRef; 
	   				 				
	   				body = '''
	   					prev = «arg.name».copy();
	   					«preMethods.getMethodCalls(op)»
	   					«op.getOriginalCall(arg)»
	   					«postMethods.getMethodCalls(op)»
	   					«op.getRetVal»
	   				'''		
	   			]
   			}   			
   		]
   	}
   	
   	/**
   	 * Template to render the call of pre and post methods in an operation.
   	 */
   	def getMethodCalls (Vector<String> methods, Operation op) {
   		var calls = ""
   		for (method: methods) {
   			calls = '''
   				«calls»
   				if (!«method»(«op.getParametersForCall»)) {
   					throw new Exception("Constraint violated: «method»");
   				};
   			'''
   		}
   		return calls
   	}
   	
   	/**
   	 * Returns the call to Operation op. If the Operation has a return value,
   	 * the result will be saved in a local variable called retVal.
   	 */
   	def getOriginalCall (Operation op, JvmFormalParameter ref) {
   		var call =  '''«ref.name».«op.signature.name»(«op.getParametersForCall»);'''
   		if (!op.signature.type.simpleName.equals("void")) {
			call =  '''«op.signature.type.simpleName» retVal = ''' + call
		}
   		call			
   	}
   	
   	/**
   	 * Returns a return statement for retVal if the return type of Operation
   	 * is not void, otherwise the empty String.
   	 */
   	def getRetVal (Operation op) {
   		if (!op.signature.type.simpleName.equals("void")) {
   			return "return retVal;"
   		}
   		return ""
   	}
   	
   	/**
   	 * Creates the first argument for the constructor. The argument's type
   	 * is determined by the context's class.
   	 */
   	def createFirstArgument (Context context) {
   		var arg = typesFactory.createJvmFormalParameter
   		arg.name = context.getName.toLowerCase
   		arg.parameterType = context.type
   		return arg
   	}
   	
   	/**
   	 * Template for a list of parameters in a method call.
   	 */
   	def getParametersForCall (Operation op) {
   		var str = ""
	   	for (param : op.signature.params) {
			str = str + param.name + ','
		}
		if (str.length > 0) {
			str = str.substring(0, str.length - 1)
		}
		return str
   	}
   	
   	/**
   	 * Returns the name of the context without generic arguments.
   	 */
   	def getName (Context context) {
   		val name = context.type.simpleName
   		return name.replaceAll("<.*>", "")
   	}
}