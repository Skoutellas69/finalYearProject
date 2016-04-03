/**
 */
package finalYearName;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see finalYearName.FinalYearNameFactory
 * @model kind="package"
 * @generated
 */
public interface FinalYearNamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finalYearName";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "finalYearURI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "finalYearPrefix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinalYearNamePackage eINSTANCE = finalYearName.impl.FinalYearNamePackageImpl.init();

	/**
	 * The meta object id for the '{@link finalYearName.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.ModelImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Has Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Has Dependency Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_DEPENDENCY_LINK = 2;

	/**
	 * The feature id for the '<em><b>Has Security Objective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_SECURITY_OBJECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Has Threat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_THREAT = 4;

	/**
	 * The feature id for the '<em><b>Has Security Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_SECURITY_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Has Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_PLAN = 6;

	/**
	 * The feature id for the '<em><b>Has Security Mechanism</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_SECURITY_MECHANISM = 7;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.ActorImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.GoalImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 2;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.DependencyLinkImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getDependencyLink()
	 * @generated
	 */
	int DEPENDENCY_LINK = 3;

	/**
	 * The feature id for the '<em><b>To Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK__TO_GOAL = 0;

	/**
	 * The feature id for the '<em><b>From Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK__FROM_ACTOR = 1;

	/**
	 * The number of structural features of the '<em>Dependency Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dependency Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.SecurityObjectiveImpl <em>Security Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.SecurityObjectiveImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getSecurityObjective()
	 * @generated
	 */
	int SECURITY_OBJECTIVE = 4;

	/**
	 * The number of structural features of the '<em>Security Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OBJECTIVE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.ThreatImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 5;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.SecurityConstraintImpl <em>Security Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.SecurityConstraintImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getSecurityConstraint()
	 * @generated
	 */
	int SECURITY_CONSTRAINT = 6;

	/**
	 * The number of structural features of the '<em>Security Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.PlanImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 7;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.SecurityMechanismImpl <em>Security Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.SecurityMechanismImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getSecurityMechanism()
	 * @generated
	 */
	int SECURITY_MECHANISM = 8;

	/**
	 * The number of structural features of the '<em>Security Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MECHANISM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Security Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MECHANISM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link finalYearName.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see finalYearName.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasActor <em>Has Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Actor</em>'.
	 * @see finalYearName.Model#getHasActor()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasActor();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasGoal <em>Has Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Goal</em>'.
	 * @see finalYearName.Model#getHasGoal()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasDependencyLink <em>Has Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Dependency Link</em>'.
	 * @see finalYearName.Model#getHasDependencyLink()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasDependencyLink();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasSecurityObjective <em>Has Security Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Security Objective</em>'.
	 * @see finalYearName.Model#getHasSecurityObjective()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasSecurityObjective();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasThreat <em>Has Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Threat</em>'.
	 * @see finalYearName.Model#getHasThreat()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasThreat();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasSecurityConstraint <em>Has Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Security Constraint</em>'.
	 * @see finalYearName.Model#getHasSecurityConstraint()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasSecurityConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasPlan <em>Has Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Plan</em>'.
	 * @see finalYearName.Model#getHasPlan()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasSecurityMechanism <em>Has Security Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Security Mechanism</em>'.
	 * @see finalYearName.Model#getHasSecurityMechanism()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasSecurityMechanism();

	/**
	 * Returns the meta object for class '{@link finalYearName.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see finalYearName.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link finalYearName.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see finalYearName.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for class '{@link finalYearName.DependencyLink <em>Dependency Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Link</em>'.
	 * @see finalYearName.DependencyLink
	 * @generated
	 */
	EClass getDependencyLink();

	/**
	 * Returns the meta object for the reference list '{@link finalYearName.DependencyLink#getToGoal <em>To Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Goal</em>'.
	 * @see finalYearName.DependencyLink#getToGoal()
	 * @see #getDependencyLink()
	 * @generated
	 */
	EReference getDependencyLink_ToGoal();

	/**
	 * Returns the meta object for the reference list '{@link finalYearName.DependencyLink#getFromActor <em>From Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Actor</em>'.
	 * @see finalYearName.DependencyLink#getFromActor()
	 * @see #getDependencyLink()
	 * @generated
	 */
	EReference getDependencyLink_FromActor();

	/**
	 * Returns the meta object for class '{@link finalYearName.SecurityObjective <em>Security Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Objective</em>'.
	 * @see finalYearName.SecurityObjective
	 * @generated
	 */
	EClass getSecurityObjective();

	/**
	 * Returns the meta object for class '{@link finalYearName.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see finalYearName.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for class '{@link finalYearName.SecurityConstraint <em>Security Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Constraint</em>'.
	 * @see finalYearName.SecurityConstraint
	 * @generated
	 */
	EClass getSecurityConstraint();

	/**
	 * Returns the meta object for class '{@link finalYearName.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see finalYearName.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for class '{@link finalYearName.SecurityMechanism <em>Security Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Mechanism</em>'.
	 * @see finalYearName.SecurityMechanism
	 * @generated
	 */
	EClass getSecurityMechanism();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FinalYearNameFactory getFinalYearNameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link finalYearName.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.ModelImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Has Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_ACTOR = eINSTANCE.getModel_HasActor();

		/**
		 * The meta object literal for the '<em><b>Has Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_GOAL = eINSTANCE.getModel_HasGoal();

		/**
		 * The meta object literal for the '<em><b>Has Dependency Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_DEPENDENCY_LINK = eINSTANCE.getModel_HasDependencyLink();

		/**
		 * The meta object literal for the '<em><b>Has Security Objective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_SECURITY_OBJECTIVE = eINSTANCE.getModel_HasSecurityObjective();

		/**
		 * The meta object literal for the '<em><b>Has Threat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_THREAT = eINSTANCE.getModel_HasThreat();

		/**
		 * The meta object literal for the '<em><b>Has Security Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_SECURITY_CONSTRAINT = eINSTANCE.getModel_HasSecurityConstraint();

		/**
		 * The meta object literal for the '<em><b>Has Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_PLAN = eINSTANCE.getModel_HasPlan();

		/**
		 * The meta object literal for the '<em><b>Has Security Mechanism</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_SECURITY_MECHANISM = eINSTANCE.getModel_HasSecurityMechanism();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.ActorImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.GoalImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.DependencyLinkImpl <em>Dependency Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.DependencyLinkImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getDependencyLink()
		 * @generated
		 */
		EClass DEPENDENCY_LINK = eINSTANCE.getDependencyLink();

		/**
		 * The meta object literal for the '<em><b>To Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_LINK__TO_GOAL = eINSTANCE.getDependencyLink_ToGoal();

		/**
		 * The meta object literal for the '<em><b>From Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY_LINK__FROM_ACTOR = eINSTANCE.getDependencyLink_FromActor();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.SecurityObjectiveImpl <em>Security Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.SecurityObjectiveImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getSecurityObjective()
		 * @generated
		 */
		EClass SECURITY_OBJECTIVE = eINSTANCE.getSecurityObjective();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.ThreatImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.SecurityConstraintImpl <em>Security Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.SecurityConstraintImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getSecurityConstraint()
		 * @generated
		 */
		EClass SECURITY_CONSTRAINT = eINSTANCE.getSecurityConstraint();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.PlanImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.SecurityMechanismImpl <em>Security Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.SecurityMechanismImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getSecurityMechanism()
		 * @generated
		 */
		EClass SECURITY_MECHANISM = eINSTANCE.getSecurityMechanism();

	}

} //FinalYearNamePackage
