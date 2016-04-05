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
	 * The feature id for the '<em><b>Has Organisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_ORGANISATION = 8;

	/**
	 * The feature id for the '<em><b>Has Soft Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_SOFT_GOAL = 9;

	/**
	 * The feature id for the '<em><b>Has Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Has Attacker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_ATTACKER = 11;

	/**
	 * The feature id for the '<em><b>New EReference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NEW_EREFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Has Attack Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAS_ATTACK_METHOD = 13;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 14;

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
	 * The meta object id for the '{@link finalYearName.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.OrganisationImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 9;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.SoftGoalImpl <em>Soft Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.SoftGoalImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getSoftGoal()
	 * @generated
	 */
	int SOFT_GOAL = 10;

	/**
	 * The number of structural features of the '<em>Soft Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Soft Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.ResourceImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 11;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.AttackerImpl <em>Attacker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.AttackerImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getAttacker()
	 * @generated
	 */
	int ATTACKER = 12;

	/**
	 * The number of structural features of the '<em>Attacker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attacker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.VulnerabilityImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getVulnerability()
	 * @generated
	 */
	int VULNERABILITY = 13;

	/**
	 * The number of structural features of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link finalYearName.impl.AttackMethodImpl <em>Attack Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see finalYearName.impl.AttackMethodImpl
	 * @see finalYearName.impl.FinalYearNamePackageImpl#getAttackMethod()
	 * @generated
	 */
	int ATTACK_METHOD = 14;

	/**
	 * The number of structural features of the '<em>Attack Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_METHOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attack Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_METHOD_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasOrganisation <em>Has Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Organisation</em>'.
	 * @see finalYearName.Model#getHasOrganisation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasOrganisation();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasSoftGoal <em>Has Soft Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Soft Goal</em>'.
	 * @see finalYearName.Model#getHasSoftGoal()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasSoftGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasResource <em>Has Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource</em>'.
	 * @see finalYearName.Model#getHasResource()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasResource();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasAttacker <em>Has Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attacker</em>'.
	 * @see finalYearName.Model#getHasAttacker()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasAttacker();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getNewEReference <em>New EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New EReference</em>'.
	 * @see finalYearName.Model#getNewEReference()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_NewEReference();

	/**
	 * Returns the meta object for the containment reference list '{@link finalYearName.Model#getHasAttackMethod <em>Has Attack Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Attack Method</em>'.
	 * @see finalYearName.Model#getHasAttackMethod()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_HasAttackMethod();

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
	 * Returns the meta object for class '{@link finalYearName.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see finalYearName.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for class '{@link finalYearName.SoftGoal <em>Soft Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Goal</em>'.
	 * @see finalYearName.SoftGoal
	 * @generated
	 */
	EClass getSoftGoal();

	/**
	 * Returns the meta object for class '{@link finalYearName.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see finalYearName.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link finalYearName.Attacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacker</em>'.
	 * @see finalYearName.Attacker
	 * @generated
	 */
	EClass getAttacker();

	/**
	 * Returns the meta object for class '{@link finalYearName.Vulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability</em>'.
	 * @see finalYearName.Vulnerability
	 * @generated
	 */
	EClass getVulnerability();

	/**
	 * Returns the meta object for class '{@link finalYearName.AttackMethod <em>Attack Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack Method</em>'.
	 * @see finalYearName.AttackMethod
	 * @generated
	 */
	EClass getAttackMethod();

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
		 * The meta object literal for the '<em><b>Has Organisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_ORGANISATION = eINSTANCE.getModel_HasOrganisation();

		/**
		 * The meta object literal for the '<em><b>Has Soft Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_SOFT_GOAL = eINSTANCE.getModel_HasSoftGoal();

		/**
		 * The meta object literal for the '<em><b>Has Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_RESOURCE = eINSTANCE.getModel_HasResource();

		/**
		 * The meta object literal for the '<em><b>Has Attacker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_ATTACKER = eINSTANCE.getModel_HasAttacker();

		/**
		 * The meta object literal for the '<em><b>New EReference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__NEW_EREFERENCE = eINSTANCE.getModel_NewEReference();

		/**
		 * The meta object literal for the '<em><b>Has Attack Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAS_ATTACK_METHOD = eINSTANCE.getModel_HasAttackMethod();

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

		/**
		 * The meta object literal for the '{@link finalYearName.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.OrganisationImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.SoftGoalImpl <em>Soft Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.SoftGoalImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getSoftGoal()
		 * @generated
		 */
		EClass SOFT_GOAL = eINSTANCE.getSoftGoal();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.ResourceImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.AttackerImpl <em>Attacker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.AttackerImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getAttacker()
		 * @generated
		 */
		EClass ATTACKER = eINSTANCE.getAttacker();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.VulnerabilityImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getVulnerability()
		 * @generated
		 */
		EClass VULNERABILITY = eINSTANCE.getVulnerability();

		/**
		 * The meta object literal for the '{@link finalYearName.impl.AttackMethodImpl <em>Attack Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see finalYearName.impl.AttackMethodImpl
		 * @see finalYearName.impl.FinalYearNamePackageImpl#getAttackMethod()
		 * @generated
		 */
		EClass ATTACK_METHOD = eINSTANCE.getAttackMethod();

	}

} //FinalYearNamePackage
