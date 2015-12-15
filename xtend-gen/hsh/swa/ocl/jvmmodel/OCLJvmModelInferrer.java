package hsh.swa.ocl.jvmmodel;

import com.google.inject.Inject;
import hsh.swa.ocl.oCL.Constraint;
import hsh.swa.ocl.oCL.Context;
import hsh.swa.ocl.oCL.Operation;
import hsh.swa.ocl.oCL.OperationSignature;
import hsh.swa.ocl.oCL.PostConstraint;
import hsh.swa.ocl.oCL.PreConstraint;
import java.util.Arrays;
import java.util.Vector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OCLJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private TypesFactory typesFactory;
  
  /**
   * Provides a mapping for all grammar rules to Java
   */
  protected void _infer(final Context context, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = this.getName(context);
    String _plus = ("constraints." + _name);
    String _plus_1 = (_plus + "Constraints");
    JvmGenericType _class = this._jvmTypesBuilder.toClass(context, _plus_1);
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      final JvmFormalParameter arg = this.createFirstArgument(context);
      EList<JvmMember> _members = it.getMembers();
      String _name_1 = arg.getName();
      JvmTypeReference _parameterType = arg.getParameterType();
      JvmField _field = this._jvmTypesBuilder.toField(context, _name_1, _parameterType);
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = it.getMembers();
      JvmTypeReference _parameterType_1 = arg.getParameterType();
      JvmField _field_1 = this._jvmTypesBuilder.toField(context, "prev", _parameterType_1);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
      EList<JvmMember> _members_2 = it.getMembers();
      final Procedure1<JvmConstructor> _function_1 = (JvmConstructor it_1) -> {
        EList<JvmFormalParameter> _parameters = it_1.getParameters();
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, arg);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("this.");
            String _name = arg.getName();
            _builder.append(_name, "");
            _builder.append(" = ");
            String _name_1 = arg.getName();
            _builder.append(_name_1, "");
            _builder.append("; ");
            _builder.newLineIfNotEmpty();
            _builder.append("this.prev = this.");
            String _name_2 = arg.getName();
            _builder.append(_name_2, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        };
        this._jvmTypesBuilder.setBody(it_1, _client);
      };
      JvmConstructor _constructor = this._jvmTypesBuilder.toConstructor(context, _function_1);
      this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_2, _constructor);
      EList<Operation> _operations = context.getOperations();
      for (final Operation op : _operations) {
        {
          int counterPre = 0;
          int counterPost = 0;
          final Vector<String> preMethods = new Vector<String>();
          final Vector<String> postMethods = new Vector<String>();
          EList<Constraint> _constraints = op.getConstraints();
          for (final Constraint constraint : _constraints) {
            {
              String methodName = "";
              boolean _matched = false;
              if (!_matched) {
                if (constraint instanceof PreConstraint) {
                  _matched=true;
                  OperationSignature _signature = op.getSignature();
                  String _name_2 = _signature.getName();
                  String _plus_2 = ("pre" + _name_2);
                  int _plusPlus = counterPre++;
                  String _plus_3 = (_plus_2 + Integer.valueOf(_plusPlus));
                  methodName = _plus_3;
                  preMethods.add(methodName);
                }
              }
              if (!_matched) {
                if (constraint instanceof PostConstraint) {
                  _matched=true;
                  OperationSignature _signature = op.getSignature();
                  String _name_2 = _signature.getName();
                  String _plus_2 = ("post" + _name_2);
                  int _plusPlus = counterPost++;
                  String _plus_3 = (_plus_2 + Integer.valueOf(_plusPlus));
                  methodName = _plus_3;
                  postMethods.add(methodName);
                }
              }
              EList<JvmMember> _members_3 = it.getMembers();
              JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(Boolean.class);
              final Procedure1<JvmOperation> _function_2 = (JvmOperation it_1) -> {
                OperationSignature _signature = op.getSignature();
                EList<JvmFormalParameter> _params = _signature.getParams();
                for (final JvmFormalParameter param : _params) {
                  EList<JvmFormalParameter> _parameters = it_1.getParameters();
                  String _name_2 = param.getName();
                  JvmTypeReference _parameterType_2 = param.getParameterType();
                  JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(constraint, _name_2, _parameterType_2);
                  this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                }
                it_1.setVisibility(JvmVisibility.PRIVATE);
                XExpression _body = constraint.getBody();
                this._jvmTypesBuilder.setBody(it_1, _body);
              };
              JvmOperation _method = this._jvmTypesBuilder.toMethod(constraint, methodName, _typeRef, _function_2);
              this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method);
            }
          }
          EList<JvmMember> _members_3 = it.getMembers();
          OperationSignature _signature = op.getSignature();
          String _name_2 = _signature.getName();
          OperationSignature _signature_1 = op.getSignature();
          JvmTypeReference _type = _signature_1.getType();
          final Procedure1<JvmOperation> _function_2 = (JvmOperation it_1) -> {
            OperationSignature _signature_2 = op.getSignature();
            EList<JvmFormalParameter> _params = _signature_2.getParams();
            for (final JvmFormalParameter param : _params) {
              EList<JvmFormalParameter> _parameters = it_1.getParameters();
              String _name_3 = param.getName();
              JvmTypeReference _parameterType_2 = param.getParameterType();
              JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(context, _name_3, _parameterType_2);
              this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            }
            EList<JvmTypeReference> _exceptions = it_1.getExceptions();
            JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(Exception.class);
            this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeRef);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("prev = ");
                String _name = arg.getName();
                _builder.append(_name, "");
                _builder.append(".copy();");
                _builder.newLineIfNotEmpty();
                String _methodCalls = OCLJvmModelInferrer.this.getMethodCalls(preMethods, op);
                _builder.append(_methodCalls, "");
                _builder.newLineIfNotEmpty();
                String _originalCall = OCLJvmModelInferrer.this.getOriginalCall(op, arg);
                _builder.append(_originalCall, "");
                _builder.newLineIfNotEmpty();
                String _methodCalls_1 = OCLJvmModelInferrer.this.getMethodCalls(postMethods, op);
                _builder.append(_methodCalls_1, "");
                _builder.newLineIfNotEmpty();
                String _retVal = OCLJvmModelInferrer.this.getRetVal(op);
                _builder.append(_retVal, "");
                _builder.newLineIfNotEmpty();
              }
            };
            this._jvmTypesBuilder.setBody(it_1, _client);
          };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(context, _name_2, _type, _function_2);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method);
        }
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  /**
   * Template to render the call of pre and post methods in an operation.
   */
  public String getMethodCalls(final Vector<String> methods, final Operation op) {
    String calls = "";
    for (final String method : methods) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(calls, "");
      _builder.newLineIfNotEmpty();
      _builder.append("if (!");
      _builder.append(method, "");
      _builder.append("(");
      String _parametersForCall = this.getParametersForCall(op);
      _builder.append(_parametersForCall, "");
      _builder.append(")) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("throw new Exception(\"Constraint violated: ");
      _builder.append(method, "\t");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("};");
      _builder.newLine();
      calls = _builder.toString();
    }
    return calls;
  }
  
  /**
   * Returns the call to Operation op. If the Operation has a return value,
   * the result will be saved in a local variable called retVal.
   */
  public String getOriginalCall(final Operation op, final JvmFormalParameter ref) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String _name = ref.getName();
      _builder.append(_name, "");
      _builder.append(".");
      OperationSignature _signature = op.getSignature();
      String _name_1 = _signature.getName();
      _builder.append(_name_1, "");
      _builder.append("(");
      String _parametersForCall = this.getParametersForCall(op);
      _builder.append(_parametersForCall, "");
      _builder.append(");");
      String call = _builder.toString();
      OperationSignature _signature_1 = op.getSignature();
      JvmTypeReference _type = _signature_1.getType();
      String _simpleName = _type.getSimpleName();
      boolean _equals = _simpleName.equals("void");
      boolean _not = (!_equals);
      if (_not) {
        StringConcatenation _builder_1 = new StringConcatenation();
        OperationSignature _signature_2 = op.getSignature();
        JvmTypeReference _type_1 = _signature_2.getType();
        String _simpleName_1 = _type_1.getSimpleName();
        _builder_1.append(_simpleName_1, "");
        _builder_1.append(" retVal = ");
        String _plus = (_builder_1.toString() + call);
        call = _plus;
      }
      _xblockexpression = call;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns a return statement for retVal if the return type of Operation
   * is not void, otherwise the empty String.
   */
  public String getRetVal(final Operation op) {
    OperationSignature _signature = op.getSignature();
    JvmTypeReference _type = _signature.getType();
    String _simpleName = _type.getSimpleName();
    boolean _equals = _simpleName.equals("void");
    boolean _not = (!_equals);
    if (_not) {
      return "return retVal;";
    }
    return "";
  }
  
  /**
   * Creates the first argument for the constructor. The argument's type
   * is determined by the context's class.
   */
  public JvmFormalParameter createFirstArgument(final Context context) {
    JvmFormalParameter arg = this.typesFactory.createJvmFormalParameter();
    String _name = this.getName(context);
    String _lowerCase = _name.toLowerCase();
    arg.setName(_lowerCase);
    JvmParameterizedTypeReference _type = context.getType();
    arg.setParameterType(_type);
    return arg;
  }
  
  /**
   * Template for a list of parameters in a method call.
   */
  public String getParametersForCall(final Operation op) {
    String str = "";
    OperationSignature _signature = op.getSignature();
    EList<JvmFormalParameter> _params = _signature.getParams();
    for (final JvmFormalParameter param : _params) {
      String _name = param.getName();
      String _plus = (str + _name);
      String _plus_1 = (_plus + ",");
      str = _plus_1;
    }
    int _length = str.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      int _length_1 = str.length();
      int _minus = (_length_1 - 1);
      String _substring = str.substring(0, _minus);
      str = _substring;
    }
    return str;
  }
  
  /**
   * Returns the name of the context without generic arguments.
   */
  public String getName(final Context context) {
    JvmParameterizedTypeReference _type = context.getType();
    final String name = _type.getSimpleName();
    return name.replaceAll("<.*>", "");
  }
  
  public void infer(final EObject context, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (context instanceof Context) {
      _infer((Context)context, acceptor, isPreIndexingPhase);
      return;
    } else if (context != null) {
      _infer(context, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(context, acceptor, isPreIndexingPhase).toString());
    }
  }
}
