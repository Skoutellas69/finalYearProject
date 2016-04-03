/**
 */
package finalYearName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link finalYearName.DependencyLink#getToGoal <em>To Goal</em>}</li>
 *   <li>{@link finalYearName.DependencyLink#getFromActor <em>From Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see finalYearName.FinalYearNamePackage#getDependencyLink()
 * @model
 * @generated
 */
public interface DependencyLink extends EObject {
	/**
	 * Returns the value of the '<em><b>To Goal</b></em>' reference list.
	 * The list contents are of type {@link finalYearName.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Goal</em>' reference list.
	 * @see finalYearName.FinalYearNamePackage#getDependencyLink_ToGoal()
	 * @model
	 * @generated
	 */
	EList<Goal> getToGoal();

	/**
	 * Returns the value of the '<em><b>From Actor</b></em>' reference list.
	 * The list contents are of type {@link finalYearName.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Actor</em>' reference list.
	 * @see finalYearName.FinalYearNamePackage#getDependencyLink_FromActor()
	 * @model
	 * @generated
	 */
	EList<Actor> getFromActor();

} // DependencyLink
