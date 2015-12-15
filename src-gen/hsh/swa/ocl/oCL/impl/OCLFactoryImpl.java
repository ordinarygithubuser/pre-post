/**
 */
package hsh.swa.ocl.oCL.impl;

import hsh.swa.ocl.oCL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OCLFactoryImpl extends EFactoryImpl implements OCLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OCLFactory init()
  {
    try
    {
      OCLFactory theOCLFactory = (OCLFactory)EPackage.Registry.INSTANCE.getEFactory(OCLPackage.eNS_URI);
      if (theOCLFactory != null)
      {
        return theOCLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OCLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OCLPackage.OCL: return createOCL();
      case OCLPackage.CONTEXT: return createContext();
      case OCLPackage.OPERATION: return createOperation();
      case OCLPackage.OPERATION_SIGNATURE: return createOperationSignature();
      case OCLPackage.CONSTRAINT: return createConstraint();
      case OCLPackage.PRE_CONSTRAINT: return createPreConstraint();
      case OCLPackage.POST_CONSTRAINT: return createPostConstraint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCL createOCL()
  {
    OCLImpl ocl = new OCLImpl();
    return ocl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationSignature createOperationSignature()
  {
    OperationSignatureImpl operationSignature = new OperationSignatureImpl();
    return operationSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PreConstraint createPreConstraint()
  {
    PreConstraintImpl preConstraint = new PreConstraintImpl();
    return preConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostConstraint createPostConstraint()
  {
    PostConstraintImpl postConstraint = new PostConstraintImpl();
    return postConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLPackage getOCLPackage()
  {
    return (OCLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OCLPackage getPackage()
  {
    return OCLPackage.eINSTANCE;
  }

} //OCLFactoryImpl
