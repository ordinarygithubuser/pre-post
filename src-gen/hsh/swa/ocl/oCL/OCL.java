/**
 */
package hsh.swa.ocl.oCL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hsh.swa.ocl.oCL.OCL#getImports <em>Imports</em>}</li>
 *   <li>{@link hsh.swa.ocl.oCL.OCL#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see hsh.swa.ocl.oCL.OCLPackage#getOCL()
 * @model
 * @generated
 */
public interface OCL extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference.
   * @see #setImports(XImportSection)
   * @see hsh.swa.ocl.oCL.OCLPackage#getOCL_Imports()
   * @model containment="true"
   * @generated
   */
  XImportSection getImports();

  /**
   * Sets the value of the '{@link hsh.swa.ocl.oCL.OCL#getImports <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imports</em>' containment reference.
   * @see #getImports()
   * @generated
   */
  void setImports(XImportSection value);

  /**
   * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
   * The list contents are of type {@link hsh.swa.ocl.oCL.Context}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexts</em>' containment reference list.
   * @see hsh.swa.ocl.oCL.OCLPackage#getOCL_Contexts()
   * @model containment="true"
   * @generated
   */
  EList<Context> getContexts();

} // OCL
