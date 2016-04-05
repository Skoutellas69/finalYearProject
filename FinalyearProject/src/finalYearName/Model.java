/**
 */
package finalYearName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link finalYearName.Model#getHasActor <em>Has Actor</em>}</li>
 *   <li>{@link finalYearName.Model#getHasGoal <em>Has Goal</em>}</li>
 *   <li>{@link finalYearName.Model#getHasDependencyLink <em>Has Dependency Link</em>}</li>
 *   <li>{@link finalYearName.Model#getHasSecurityObjective <em>Has Security Objective</em>}</li>
 *   <li>{@link finalYearName.Model#getHasThreat <em>Has Threat</em>}</li>
 *   <li>{@link finalYearName.Model#getHasSecurityConstraint <em>Has Security Constraint</em>}</li>
 *   <li>{@link finalYearName.Model#getHasPlan <em>Has Plan</em>}</li>
 *   <li>{@link finalYearName.Model#getHasSecurityMechanism <em>Has Security Mechanism</em>}</li>
 *   <li>{@link finalYearName.Model#getHasOrganisation <em>Has Organisation</em>}</li>
 *   <li>{@link finalYearName.Model#getHasSoftGoal <em>Has Soft Goal</em>}</li>
 *   <li>{@link finalYearName.Model#getHasResource <em>Has Resource</em>}</li>
 *   <li>{@link finalYearName.Model#getHasAttacker <em>Has Attacker</em>}</li>
 *   <li>{@link finalYearName.Model#getNewEReference <em>New EReference</em>}</li>
 *   <li>{@link finalYearName.Model#getHasAttackMethod <em>Has Attack Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see finalYearName.FinalYearNamePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Actor</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Actor</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasActor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getHasActor();

	/**
	 * Returns the value of the '<em><b>Has Goal</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Goal</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasGoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getHasGoal();

	/**
	 * Returns the value of the '<em><b>Has Dependency Link</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.DependencyLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Dependency Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Dependency Link</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasDependencyLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<DependencyLink> getHasDependencyLink();

	/**
	 * Returns the value of the '<em><b>Has Security Objective</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.SecurityObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Security Objective</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Security Objective</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasSecurityObjective()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityObjective> getHasSecurityObjective();

	/**
	 * Returns the value of the '<em><b>Has Threat</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.Threat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Threat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Threat</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasThreat()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getHasThreat();

	/**
	 * Returns the value of the '<em><b>Has Security Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.SecurityConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Security Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Security Constraint</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasSecurityConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityConstraint> getHasSecurityConstraint();

	/**
	 * Returns the value of the '<em><b>Has Plan</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.Plan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Plan</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Plan</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasPlan()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plan> getHasPlan();

	/**
	 * Returns the value of the '<em><b>Has Security Mechanism</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.SecurityMechanism}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Security Mechanism</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Security Mechanism</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasSecurityMechanism()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityMechanism> getHasSecurityMechanism();

	/**
	 * Returns the value of the '<em><b>Has Organisation</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.Organisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Organisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Organisation</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasOrganisation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Organisation> getHasOrganisation();

	/**
	 * Returns the value of the '<em><b>Has Soft Goal</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.SoftGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Soft Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Soft Goal</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasSoftGoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftGoal> getHasSoftGoal();

	/**
	 * Returns the value of the '<em><b>Has Resource</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasResource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getHasResource();

	/**
	 * Returns the value of the '<em><b>Has Attacker</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.Attacker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Attacker</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attacker</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasAttacker()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attacker> getHasAttacker();

	/**
	 * Returns the value of the '<em><b>New EReference</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_NewEReference()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vulnerability> getNewEReference();

	/**
	 * Returns the value of the '<em><b>Has Attack Method</b></em>' containment reference list.
	 * The list contents are of type {@link finalYearName.AttackMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Attack Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attack Method</em>' containment reference list.
	 * @see finalYearName.FinalYearNamePackage#getModel_HasAttackMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttackMethod> getHasAttackMethod();

} // Model
