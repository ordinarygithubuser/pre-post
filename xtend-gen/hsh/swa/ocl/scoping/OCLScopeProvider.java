package hsh.swa.ocl.scoping;

import hsh.swa.ocl.oCL.Operation;
import hsh.swa.ocl.oCL.OperationSignature;
import javax.xml.stream.events.EntityReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

@SuppressWarnings("all")
public class OCLScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_Constraint_body(final Operation op, final EntityReference ref) {
    OperationSignature _signature = op.getSignature();
    EList<JvmFormalParameter> _params = _signature.getParams();
    return Scopes.scopeFor(_params);
  }
}
