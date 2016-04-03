/**
 */
package finalYearName.impl;

import finalYearName.*;

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
public class FinalYearNameFactoryImpl extends EFactoryImpl implements FinalYearNameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinalYearNameFactory init() {
		try {
			FinalYearNameFactory theFinalYearNameFactory = (FinalYearNameFactory)EPackage.Registry.INSTANCE.getEFactory(FinalYearNamePackage.eNS_URI);
			if (theFinalYearNameFactory != null) {
				return theFinalYearNameFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinalYearNameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalYearNameFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FinalYearNamePackage.MODEL: return createModel();
			case FinalYearNamePackage.ACTOR: return createActor();
			case FinalYearNamePackage.GOAL: return createGoal();
			case FinalYearNamePackage.DEPENDENCY_LINK: return createDependencyLink();
			case FinalYearNamePackage.SECURITY_OBJECTIVE: return createSecurityObjective();
			case FinalYearNamePackage.THREAT: return createThreat();
			case FinalYearNamePackage.SECURITY_CONSTRAINT: return createSecurityConstraint();
			case FinalYearNamePackage.PLAN: return createPlan();
			case FinalYearNamePackage.SECURITY_MECHANISM: return createSecurityMechanism();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyLink createDependencyLink() {
		DependencyLinkImpl dependencyLink = new DependencyLinkImpl();
		return dependencyLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityObjective createSecurityObjective() {
		SecurityObjectiveImpl securityObjective = new SecurityObjectiveImpl();
		return securityObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat createThreat() {
		ThreatImpl threat = new ThreatImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityConstraint createSecurityConstraint() {
		SecurityConstraintImpl securityConstraint = new SecurityConstraintImpl();
		return securityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan createPlan() {
		PlanImpl plan = new PlanImpl();
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityMechanism createSecurityMechanism() {
		SecurityMechanismImpl securityMechanism = new SecurityMechanismImpl();
		return securityMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalYearNamePackage getFinalYearNamePackage() {
		return (FinalYearNamePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinalYearNamePackage getPackage() {
		return FinalYearNamePackage.eINSTANCE;
	}

} //FinalYearNameFactoryImpl
