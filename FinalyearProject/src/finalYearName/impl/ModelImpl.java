/**
 */
package finalYearName.impl;

import finalYearName.Actor;
import finalYearName.AttackMethod;
import finalYearName.Attacker;
import finalYearName.DependencyLink;
import finalYearName.FinalYearNamePackage;
import finalYearName.Goal;
import finalYearName.Model;
import finalYearName.Organisation;
import finalYearName.Plan;
import finalYearName.Resource;
import finalYearName.SecurityConstraint;
import finalYearName.SecurityMechanism;
import finalYearName.SecurityObjective;
import finalYearName.SoftGoal;
import finalYearName.Threat;
import finalYearName.Vulnerability;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasActor <em>Has Actor</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasGoal <em>Has Goal</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasDependencyLink <em>Has Dependency Link</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasSecurityObjective <em>Has Security Objective</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasThreat <em>Has Threat</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasSecurityConstraint <em>Has Security Constraint</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasPlan <em>Has Plan</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasSecurityMechanism <em>Has Security Mechanism</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasOrganisation <em>Has Organisation</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasSoftGoal <em>Has Soft Goal</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasResource <em>Has Resource</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasAttacker <em>Has Attacker</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getNewEReference <em>New EReference</em>}</li>
 *   <li>{@link finalYearName.impl.ModelImpl#getHasAttackMethod <em>Has Attack Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getHasActor() <em>Has Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> hasActor;

	/**
	 * The cached value of the '{@link #getHasGoal() <em>Has Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> hasGoal;

	/**
	 * The cached value of the '{@link #getHasDependencyLink() <em>Has Dependency Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDependencyLink()
	 * @generated
	 * @ordered
	 */
	protected EList<DependencyLink> hasDependencyLink;

	/**
	 * The cached value of the '{@link #getHasSecurityObjective() <em>Has Security Objective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSecurityObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityObjective> hasSecurityObjective;

	/**
	 * The cached value of the '{@link #getHasThreat() <em>Has Threat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasThreat()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> hasThreat;

	/**
	 * The cached value of the '{@link #getHasSecurityConstraint() <em>Has Security Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSecurityConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityConstraint> hasSecurityConstraint;

	/**
	 * The cached value of the '{@link #getHasPlan() <em>Has Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<Plan> hasPlan;

	/**
	 * The cached value of the '{@link #getHasSecurityMechanism() <em>Has Security Mechanism</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSecurityMechanism()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityMechanism> hasSecurityMechanism;

	/**
	 * The cached value of the '{@link #getHasOrganisation() <em>Has Organisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOrganisation()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> hasOrganisation;

	/**
	 * The cached value of the '{@link #getHasSoftGoal() <em>Has Soft Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSoftGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftGoal> hasSoftGoal;

	/**
	 * The cached value of the '{@link #getHasResource() <em>Has Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasResource;

	/**
	 * The cached value of the '{@link #getHasAttacker() <em>Has Attacker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAttacker()
	 * @generated
	 * @ordered
	 */
	protected EList<Attacker> hasAttacker;

	/**
	 * The cached value of the '{@link #getNewEReference() <em>New EReference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> newEReference;

	/**
	 * The cached value of the '{@link #getHasAttackMethod() <em>Has Attack Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAttackMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackMethod> hasAttackMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalYearNamePackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getHasActor() {
		if (hasActor == null) {
			hasActor = new EObjectContainmentEList<Actor>(Actor.class, this, FinalYearNamePackage.MODEL__HAS_ACTOR);
		}
		return hasActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getHasGoal() {
		if (hasGoal == null) {
			hasGoal = new EObjectContainmentEList<Goal>(Goal.class, this, FinalYearNamePackage.MODEL__HAS_GOAL);
		}
		return hasGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependencyLink> getHasDependencyLink() {
		if (hasDependencyLink == null) {
			hasDependencyLink = new EObjectContainmentEList<DependencyLink>(DependencyLink.class, this, FinalYearNamePackage.MODEL__HAS_DEPENDENCY_LINK);
		}
		return hasDependencyLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityObjective> getHasSecurityObjective() {
		if (hasSecurityObjective == null) {
			hasSecurityObjective = new EObjectContainmentEList<SecurityObjective>(SecurityObjective.class, this, FinalYearNamePackage.MODEL__HAS_SECURITY_OBJECTIVE);
		}
		return hasSecurityObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getHasThreat() {
		if (hasThreat == null) {
			hasThreat = new EObjectContainmentEList<Threat>(Threat.class, this, FinalYearNamePackage.MODEL__HAS_THREAT);
		}
		return hasThreat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityConstraint> getHasSecurityConstraint() {
		if (hasSecurityConstraint == null) {
			hasSecurityConstraint = new EObjectContainmentEList<SecurityConstraint>(SecurityConstraint.class, this, FinalYearNamePackage.MODEL__HAS_SECURITY_CONSTRAINT);
		}
		return hasSecurityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plan> getHasPlan() {
		if (hasPlan == null) {
			hasPlan = new EObjectContainmentEList<Plan>(Plan.class, this, FinalYearNamePackage.MODEL__HAS_PLAN);
		}
		return hasPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityMechanism> getHasSecurityMechanism() {
		if (hasSecurityMechanism == null) {
			hasSecurityMechanism = new EObjectContainmentEList<SecurityMechanism>(SecurityMechanism.class, this, FinalYearNamePackage.MODEL__HAS_SECURITY_MECHANISM);
		}
		return hasSecurityMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organisation> getHasOrganisation() {
		if (hasOrganisation == null) {
			hasOrganisation = new EObjectContainmentEList<Organisation>(Organisation.class, this, FinalYearNamePackage.MODEL__HAS_ORGANISATION);
		}
		return hasOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftGoal> getHasSoftGoal() {
		if (hasSoftGoal == null) {
			hasSoftGoal = new EObjectContainmentEList<SoftGoal>(SoftGoal.class, this, FinalYearNamePackage.MODEL__HAS_SOFT_GOAL);
		}
		return hasSoftGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getHasResource() {
		if (hasResource == null) {
			hasResource = new EObjectContainmentEList<Resource>(Resource.class, this, FinalYearNamePackage.MODEL__HAS_RESOURCE);
		}
		return hasResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attacker> getHasAttacker() {
		if (hasAttacker == null) {
			hasAttacker = new EObjectContainmentEList<Attacker>(Attacker.class, this, FinalYearNamePackage.MODEL__HAS_ATTACKER);
		}
		return hasAttacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vulnerability> getNewEReference() {
		if (newEReference == null) {
			newEReference = new EObjectContainmentEList<Vulnerability>(Vulnerability.class, this, FinalYearNamePackage.MODEL__NEW_EREFERENCE);
		}
		return newEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttackMethod> getHasAttackMethod() {
		if (hasAttackMethod == null) {
			hasAttackMethod = new EObjectContainmentEList<AttackMethod>(AttackMethod.class, this, FinalYearNamePackage.MODEL__HAS_ATTACK_METHOD);
		}
		return hasAttackMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalYearNamePackage.MODEL__HAS_ACTOR:
				return ((InternalEList<?>)getHasActor()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_GOAL:
				return ((InternalEList<?>)getHasGoal()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_DEPENDENCY_LINK:
				return ((InternalEList<?>)getHasDependencyLink()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_SECURITY_OBJECTIVE:
				return ((InternalEList<?>)getHasSecurityObjective()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_THREAT:
				return ((InternalEList<?>)getHasThreat()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_SECURITY_CONSTRAINT:
				return ((InternalEList<?>)getHasSecurityConstraint()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_PLAN:
				return ((InternalEList<?>)getHasPlan()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_SECURITY_MECHANISM:
				return ((InternalEList<?>)getHasSecurityMechanism()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_ORGANISATION:
				return ((InternalEList<?>)getHasOrganisation()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_SOFT_GOAL:
				return ((InternalEList<?>)getHasSoftGoal()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_RESOURCE:
				return ((InternalEList<?>)getHasResource()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_ATTACKER:
				return ((InternalEList<?>)getHasAttacker()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__NEW_EREFERENCE:
				return ((InternalEList<?>)getNewEReference()).basicRemove(otherEnd, msgs);
			case FinalYearNamePackage.MODEL__HAS_ATTACK_METHOD:
				return ((InternalEList<?>)getHasAttackMethod()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalYearNamePackage.MODEL__HAS_ACTOR:
				return getHasActor();
			case FinalYearNamePackage.MODEL__HAS_GOAL:
				return getHasGoal();
			case FinalYearNamePackage.MODEL__HAS_DEPENDENCY_LINK:
				return getHasDependencyLink();
			case FinalYearNamePackage.MODEL__HAS_SECURITY_OBJECTIVE:
				return getHasSecurityObjective();
			case FinalYearNamePackage.MODEL__HAS_THREAT:
				return getHasThreat();
			case FinalYearNamePackage.MODEL__HAS_SECURITY_CONSTRAINT:
				return getHasSecurityConstraint();
			case FinalYearNamePackage.MODEL__HAS_PLAN:
				return getHasPlan();
			case FinalYearNamePackage.MODEL__HAS_SECURITY_MECHANISM:
				return getHasSecurityMechanism();
			case FinalYearNamePackage.MODEL__HAS_ORGANISATION:
				return getHasOrganisation();
			case FinalYearNamePackage.MODEL__HAS_SOFT_GOAL:
				return getHasSoftGoal();
			case FinalYearNamePackage.MODEL__HAS_RESOURCE:
				return getHasResource();
			case FinalYearNamePackage.MODEL__HAS_ATTACKER:
				return getHasAttacker();
			case FinalYearNamePackage.MODEL__NEW_EREFERENCE:
				return getNewEReference();
			case FinalYearNamePackage.MODEL__HAS_ATTACK_METHOD:
				return getHasAttackMethod();
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
			case FinalYearNamePackage.MODEL__HAS_ACTOR:
				getHasActor().clear();
				getHasActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_GOAL:
				getHasGoal().clear();
				getHasGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_DEPENDENCY_LINK:
				getHasDependencyLink().clear();
				getHasDependencyLink().addAll((Collection<? extends DependencyLink>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_SECURITY_OBJECTIVE:
				getHasSecurityObjective().clear();
				getHasSecurityObjective().addAll((Collection<? extends SecurityObjective>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_THREAT:
				getHasThreat().clear();
				getHasThreat().addAll((Collection<? extends Threat>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_SECURITY_CONSTRAINT:
				getHasSecurityConstraint().clear();
				getHasSecurityConstraint().addAll((Collection<? extends SecurityConstraint>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_PLAN:
				getHasPlan().clear();
				getHasPlan().addAll((Collection<? extends Plan>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_SECURITY_MECHANISM:
				getHasSecurityMechanism().clear();
				getHasSecurityMechanism().addAll((Collection<? extends SecurityMechanism>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_ORGANISATION:
				getHasOrganisation().clear();
				getHasOrganisation().addAll((Collection<? extends Organisation>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_SOFT_GOAL:
				getHasSoftGoal().clear();
				getHasSoftGoal().addAll((Collection<? extends SoftGoal>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_RESOURCE:
				getHasResource().clear();
				getHasResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_ATTACKER:
				getHasAttacker().clear();
				getHasAttacker().addAll((Collection<? extends Attacker>)newValue);
				return;
			case FinalYearNamePackage.MODEL__NEW_EREFERENCE:
				getNewEReference().clear();
				getNewEReference().addAll((Collection<? extends Vulnerability>)newValue);
				return;
			case FinalYearNamePackage.MODEL__HAS_ATTACK_METHOD:
				getHasAttackMethod().clear();
				getHasAttackMethod().addAll((Collection<? extends AttackMethod>)newValue);
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
			case FinalYearNamePackage.MODEL__HAS_ACTOR:
				getHasActor().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_GOAL:
				getHasGoal().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_DEPENDENCY_LINK:
				getHasDependencyLink().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_SECURITY_OBJECTIVE:
				getHasSecurityObjective().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_THREAT:
				getHasThreat().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_SECURITY_CONSTRAINT:
				getHasSecurityConstraint().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_PLAN:
				getHasPlan().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_SECURITY_MECHANISM:
				getHasSecurityMechanism().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_ORGANISATION:
				getHasOrganisation().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_SOFT_GOAL:
				getHasSoftGoal().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_RESOURCE:
				getHasResource().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_ATTACKER:
				getHasAttacker().clear();
				return;
			case FinalYearNamePackage.MODEL__NEW_EREFERENCE:
				getNewEReference().clear();
				return;
			case FinalYearNamePackage.MODEL__HAS_ATTACK_METHOD:
				getHasAttackMethod().clear();
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
			case FinalYearNamePackage.MODEL__HAS_ACTOR:
				return hasActor != null && !hasActor.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_GOAL:
				return hasGoal != null && !hasGoal.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_DEPENDENCY_LINK:
				return hasDependencyLink != null && !hasDependencyLink.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_SECURITY_OBJECTIVE:
				return hasSecurityObjective != null && !hasSecurityObjective.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_THREAT:
				return hasThreat != null && !hasThreat.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_SECURITY_CONSTRAINT:
				return hasSecurityConstraint != null && !hasSecurityConstraint.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_PLAN:
				return hasPlan != null && !hasPlan.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_SECURITY_MECHANISM:
				return hasSecurityMechanism != null && !hasSecurityMechanism.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_ORGANISATION:
				return hasOrganisation != null && !hasOrganisation.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_SOFT_GOAL:
				return hasSoftGoal != null && !hasSoftGoal.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_RESOURCE:
				return hasResource != null && !hasResource.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_ATTACKER:
				return hasAttacker != null && !hasAttacker.isEmpty();
			case FinalYearNamePackage.MODEL__NEW_EREFERENCE:
				return newEReference != null && !newEReference.isEmpty();
			case FinalYearNamePackage.MODEL__HAS_ATTACK_METHOD:
				return hasAttackMethod != null && !hasAttackMethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
