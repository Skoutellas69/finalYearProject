/**
 */
package finalYearName.impl;

import finalYearName.Actor;
import finalYearName.DependencyLink;
import finalYearName.FinalYearNamePackage;
import finalYearName.Goal;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link finalYearName.impl.DependencyLinkImpl#getToGoal <em>To Goal</em>}</li>
 *   <li>{@link finalYearName.impl.DependencyLinkImpl#getFromActor <em>From Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyLinkImpl extends MinimalEObjectImpl.Container implements DependencyLink {
	/**
	 * The cached value of the '{@link #getToGoal() <em>To Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> toGoal;

	/**
	 * The cached value of the '{@link #getFromActor() <em>From Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> fromActor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalYearNamePackage.Literals.DEPENDENCY_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getToGoal() {
		if (toGoal == null) {
			toGoal = new EObjectResolvingEList<Goal>(Goal.class, this, FinalYearNamePackage.DEPENDENCY_LINK__TO_GOAL);
		}
		return toGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getFromActor() {
		if (fromActor == null) {
			fromActor = new EObjectResolvingEList<Actor>(Actor.class, this, FinalYearNamePackage.DEPENDENCY_LINK__FROM_ACTOR);
		}
		return fromActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalYearNamePackage.DEPENDENCY_LINK__TO_GOAL:
				return getToGoal();
			case FinalYearNamePackage.DEPENDENCY_LINK__FROM_ACTOR:
				return getFromActor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinalYearNamePackage.DEPENDENCY_LINK__TO_GOAL:
				getToGoal().clear();
				getToGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case FinalYearNamePackage.DEPENDENCY_LINK__FROM_ACTOR:
				getFromActor().clear();
				getFromActor().addAll((Collection<? extends Actor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FinalYearNamePackage.DEPENDENCY_LINK__TO_GOAL:
				getToGoal().clear();
				return;
			case FinalYearNamePackage.DEPENDENCY_LINK__FROM_ACTOR:
				getFromActor().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FinalYearNamePackage.DEPENDENCY_LINK__TO_GOAL:
				return toGoal != null && !toGoal.isEmpty();
			case FinalYearNamePackage.DEPENDENCY_LINK__FROM_ACTOR:
				return fromActor != null && !fromActor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DependencyLinkImpl
