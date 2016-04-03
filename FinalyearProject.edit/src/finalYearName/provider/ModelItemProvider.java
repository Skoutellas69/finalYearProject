/**
 */
package finalYearName.provider;


import finalYearName.FinalYearNameFactory;
import finalYearName.FinalYearNamePackage;
import finalYearName.Model;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link finalYearName.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FinalYearNamePackage.Literals.MODEL__HAS_ACTOR);
			childrenFeatures.add(FinalYearNamePackage.Literals.MODEL__HAS_GOAL);
			childrenFeatures.add(FinalYearNamePackage.Literals.MODEL__HAS_DEPENDENCY_LINK);
			childrenFeatures.add(FinalYearNamePackage.Literals.MODEL__HAS_SECURITY_OBJECTIVE);
			childrenFeatures.add(FinalYearNamePackage.Literals.MODEL__HAS_THREAT);
			childrenFeatures.add(FinalYearNamePackage.Literals.MODEL__HAS_SECURITY_CONSTRAINT);
			childrenFeatures.add(FinalYearNamePackage.Literals.MODEL__HAS_PLAN);
			childrenFeatures.add(FinalYearNamePackage.Literals.MODEL__HAS_SECURITY_MECHANISM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Model_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Model.class)) {
			case FinalYearNamePackage.MODEL__HAS_ACTOR:
			case FinalYearNamePackage.MODEL__HAS_GOAL:
			case FinalYearNamePackage.MODEL__HAS_DEPENDENCY_LINK:
			case FinalYearNamePackage.MODEL__HAS_SECURITY_OBJECTIVE:
			case FinalYearNamePackage.MODEL__HAS_THREAT:
			case FinalYearNamePackage.MODEL__HAS_SECURITY_CONSTRAINT:
			case FinalYearNamePackage.MODEL__HAS_PLAN:
			case FinalYearNamePackage.MODEL__HAS_SECURITY_MECHANISM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FinalYearNamePackage.Literals.MODEL__HAS_ACTOR,
				 FinalYearNameFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(FinalYearNamePackage.Literals.MODEL__HAS_GOAL,
				 FinalYearNameFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(FinalYearNamePackage.Literals.MODEL__HAS_DEPENDENCY_LINK,
				 FinalYearNameFactory.eINSTANCE.createDependencyLink()));

		newChildDescriptors.add
			(createChildParameter
				(FinalYearNamePackage.Literals.MODEL__HAS_SECURITY_OBJECTIVE,
				 FinalYearNameFactory.eINSTANCE.createSecurityObjective()));

		newChildDescriptors.add
			(createChildParameter
				(FinalYearNamePackage.Literals.MODEL__HAS_THREAT,
				 FinalYearNameFactory.eINSTANCE.createThreat()));

		newChildDescriptors.add
			(createChildParameter
				(FinalYearNamePackage.Literals.MODEL__HAS_SECURITY_CONSTRAINT,
				 FinalYearNameFactory.eINSTANCE.createSecurityConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(FinalYearNamePackage.Literals.MODEL__HAS_PLAN,
				 FinalYearNameFactory.eINSTANCE.createPlan()));

		newChildDescriptors.add
			(createChildParameter
				(FinalYearNamePackage.Literals.MODEL__HAS_SECURITY_MECHANISM,
				 FinalYearNameFactory.eINSTANCE.createSecurityMechanism()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MyEditPlugin.INSTANCE;
	}

}
