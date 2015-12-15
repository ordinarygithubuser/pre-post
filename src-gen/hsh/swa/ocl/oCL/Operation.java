/**
 */
package hsh.swa.ocl.oCL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hsh.swa.ocl.oCL.Operation#getSignature <em>Signature</em>}</li>
 *   <li>{@link hsh.swa.ocl.oCL.Operation#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see hsh.swa.ocl.oCL.OCLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(OperationSignature)
   * @see hsh.swa.ocl.oCL.OCLPackage#getOperation_Signature()
   * @model containment="true"
   * @generated
   */
  OperationSignature getSignature();

  /**
   * Sets the value of the '{@link hsh.swa.ocl.oCL.Operation#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(OperationSignature value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link hsh.swa.ocl.oCL.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see hsh.swa.ocl.oCL.OCLPackage#getOperation_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // Operation
