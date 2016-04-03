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

} // Model
