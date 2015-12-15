/**
 */
package hsh.swa.ocl.oCL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hsh.swa.ocl.oCL.OCLFactory
 * @model kind="package"
 * @generated
 */
public interface OCLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "oCL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.swa.hsh/ocl/OCL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "oCL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OCLPackage eINSTANCE = hsh.swa.ocl.oCL.impl.OCLPackageImpl.init();

  /**
   * The meta object id for the '{@link hsh.swa.ocl.oCL.impl.OCLImpl <em>OCL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hsh.swa.ocl.oCL.impl.OCLImpl
   * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getOCL()
   * @generated
   */
  int OCL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL__CONTEXTS = 1;

  /**
   * The number of structural features of the '<em>OCL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hsh.swa.ocl.oCL.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hsh.swa.ocl.oCL.impl.ContextImpl
   * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__OPERATIONS = 1;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hsh.swa.ocl.oCL.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hsh.swa.ocl.oCL.impl.OperationImpl
   * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 2;

  /**
   * The feature id for the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SIGNATURE = 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__CONSTRAINTS = 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hsh.swa.ocl.oCL.impl.OperationSignatureImpl <em>Operation Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hsh.swa.ocl.oCL.impl.OperationSignatureImpl
   * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getOperationSignature()
   * @generated
   */
  int OPERATION_SIGNATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SIGNATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SIGNATURE__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SIGNATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Operation Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_SIGNATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hsh.swa.ocl.oCL.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hsh.swa.ocl.oCL.impl.ConstraintImpl
   * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__BODY = 0;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hsh.swa.ocl.oCL.impl.PreConstraintImpl <em>Pre Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hsh.swa.ocl.oCL.impl.PreConstraintImpl
   * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getPreConstraint()
   * @generated
   */
  int PRE_CONSTRAINT = 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_CONSTRAINT__BODY = CONSTRAINT__BODY;

  /**
   * The number of structural features of the '<em>Pre Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hsh.swa.ocl.oCL.impl.PostConstraintImpl <em>Post Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hsh.swa.ocl.oCL.impl.PostConstraintImpl
   * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getPostConstraint()
   * @generated
   */
  int POST_CONSTRAINT = 6;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CONSTRAINT__BODY = CONSTRAINT__BODY;

  /**
   * The number of structural features of the '<em>Post Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link hsh.swa.ocl.oCL.OCL <em>OCL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OCL</em>'.
   * @see hsh.swa.ocl.oCL.OCL
   * @generated
   */
  EClass getOCL();

  /**
   * Returns the meta object for the containment reference '{@link hsh.swa.ocl.oCL.OCL#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see hsh.swa.ocl.oCL.OCL#getImports()
   * @see #getOCL()
   * @generated
   */
  EReference getOCL_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link hsh.swa.ocl.oCL.OCL#getContexts <em>Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexts</em>'.
   * @see hsh.swa.ocl.oCL.OCL#getContexts()
   * @see #getOCL()
   * @generated
   */
  EReference getOCL_Contexts();

  /**
   * Returns the meta object for class '{@link hsh.swa.ocl.oCL.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see hsh.swa.ocl.oCL.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the containment reference '{@link hsh.swa.ocl.oCL.Context#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hsh.swa.ocl.oCL.Context#getType()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Type();

  /**
   * Returns the meta object for the containment reference list '{@link hsh.swa.ocl.oCL.Context#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see hsh.swa.ocl.oCL.Context#getOperations()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Operations();

  /**
   * Returns the meta object for class '{@link hsh.swa.ocl.oCL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see hsh.swa.ocl.oCL.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link hsh.swa.ocl.oCL.Operation#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signature</em>'.
   * @see hsh.swa.ocl.oCL.Operation#getSignature()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Signature();

  /**
   * Returns the meta object for the containment reference list '{@link hsh.swa.ocl.oCL.Operation#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see hsh.swa.ocl.oCL.Operation#getConstraints()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Constraints();

  /**
   * Returns the meta object for class '{@link hsh.swa.ocl.oCL.OperationSignature <em>Operation Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Signature</em>'.
   * @see hsh.swa.ocl.oCL.OperationSignature
   * @generated
   */
  EClass getOperationSignature();

  /**
   * Returns the meta object for the attribute '{@link hsh.swa.ocl.oCL.OperationSignature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hsh.swa.ocl.oCL.OperationSignature#getName()
   * @see #getOperationSignature()
   * @generated
   */
  EAttribute getOperationSignature_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hsh.swa.ocl.oCL.OperationSignature#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hsh.swa.ocl.oCL.OperationSignature#getParams()
   * @see #getOperationSignature()
   * @generated
   */
  EReference getOperationSignature_Params();

  /**
   * Returns the meta object for the containment reference '{@link hsh.swa.ocl.oCL.OperationSignature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hsh.swa.ocl.oCL.OperationSignature#getType()
   * @see #getOperationSignature()
   * @generated
   */
  EReference getOperationSignature_Type();

  /**
   * Returns the meta object for class '{@link hsh.swa.ocl.oCL.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see hsh.swa.ocl.oCL.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the containment reference '{@link hsh.swa.ocl.oCL.Constraint#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see hsh.swa.ocl.oCL.Constraint#getBody()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Body();

  /**
   * Returns the meta object for class '{@link hsh.swa.ocl.oCL.PreConstraint <em>Pre Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Constraint</em>'.
   * @see hsh.swa.ocl.oCL.PreConstraint
   * @generated
   */
  EClass getPreConstraint();

  /**
   * Returns the meta object for class '{@link hsh.swa.ocl.oCL.PostConstraint <em>Post Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Constraint</em>'.
   * @see hsh.swa.ocl.oCL.PostConstraint
   * @generated
   */
  EClass getPostConstraint();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OCLFactory getOCLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hsh.swa.ocl.oCL.impl.OCLImpl <em>OCL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hsh.swa.ocl.oCL.impl.OCLImpl
     * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getOCL()
     * @generated
     */
    EClass OCL = eINSTANCE.getOCL();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL__IMPORTS = eINSTANCE.getOCL_Imports();

    /**
     * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCL__CONTEXTS = eINSTANCE.getOCL_Contexts();

    /**
     * The meta object literal for the '{@link hsh.swa.ocl.oCL.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hsh.swa.ocl.oCL.impl.ContextImpl
     * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__TYPE = eINSTANCE.getContext_Type();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__OPERATIONS = eINSTANCE.getContext_Operations();

    /**
     * The meta object literal for the '{@link hsh.swa.ocl.oCL.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hsh.swa.ocl.oCL.impl.OperationImpl
     * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SIGNATURE = eINSTANCE.getOperation_Signature();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__CONSTRAINTS = eINSTANCE.getOperation_Constraints();

    /**
     * The meta object literal for the '{@link hsh.swa.ocl.oCL.impl.OperationSignatureImpl <em>Operation Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hsh.swa.ocl.oCL.impl.OperationSignatureImpl
     * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getOperationSignature()
     * @generated
     */
    EClass OPERATION_SIGNATURE = eINSTANCE.getOperationSignature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_SIGNATURE__NAME = eINSTANCE.getOperationSignature_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_SIGNATURE__PARAMS = eINSTANCE.getOperationSignature_Params();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_SIGNATURE__TYPE = eINSTANCE.getOperationSignature_Type();

    /**
     * The meta object literal for the '{@link hsh.swa.ocl.oCL.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hsh.swa.ocl.oCL.impl.ConstraintImpl
     * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__BODY = eINSTANCE.getConstraint_Body();

    /**
     * The meta object literal for the '{@link hsh.swa.ocl.oCL.impl.PreConstraintImpl <em>Pre Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hsh.swa.ocl.oCL.impl.PreConstraintImpl
     * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getPreConstraint()
     * @generated
     */
    EClass PRE_CONSTRAINT = eINSTANCE.getPreConstraint();

    /**
     * The meta object literal for the '{@link hsh.swa.ocl.oCL.impl.PostConstraintImpl <em>Post Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hsh.swa.ocl.oCL.impl.PostConstraintImpl
     * @see hsh.swa.ocl.oCL.impl.OCLPackageImpl#getPostConstraint()
     * @generated
     */
    EClass POST_CONSTRAINT = eINSTANCE.getPostConstraint();

  }

} //OCLPackage
