package hsh.swa.ocl.scoping

import hsh.swa.ocl.oCL.Operation
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import javax.xml.stream.events.EntityReference
import org.eclipse.xtext.scoping.Scopes

class OCLScopeProvider extends AbstractDeclarativeScopeProvider {

	def IScope scope_Constraint_body (Operation op, EntityReference ref) {
		return Scopes.scopeFor(op.signature.params)
	}

}