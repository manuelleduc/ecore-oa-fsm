/**
 */
package fsm.provider;


import fsm.FSM;
import fsm.FsmFactory;
import fsm.FsmPackage;

import gfsm.GfsmFactory;

import gfsm.provider.GfsmEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fsm.FSM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FSMItemProvider 
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
	public FSMItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
		if (this.itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			this.addInitialstatePropertyDescriptor(object);
			this.addNamePropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initialstate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialstatePropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add
			(this.createItemPropertyDescriptor
				(((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory(),
				 this.getResourceLocator(),
				 this.getString("_UI_FSM_initialstate_feature"),
				 this.getString("_UI_PropertyDescriptor_description", "_UI_FSM_initialstate_feature", "_UI_FSM_type"),
				 FsmPackage.Literals.FSM__INITIALSTATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add
			(this.createItemPropertyDescriptor
				(((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory(),
				 this.getResourceLocator(),
				 this.getString("_UI_FSM_name_feature"),
				 this.getString("_UI_PropertyDescriptor_description", "_UI_FSM_name_feature", "_UI_FSM_type"),
				 FsmPackage.Literals.FSM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
		if (this.childrenFeatures == null) {
			super.getChildrenFeatures(object);
			this.childrenFeatures.add(FsmPackage.Literals.FSM__STATES);
			this.childrenFeatures.add(FsmPackage.Literals.FSM__TRANSITIONS);
		}
		return this.childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(final Object object, final Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FSM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/FSM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		final String label = ((FSM)object).getName();
		return label == null || label.length() == 0 ?
			this.getString("_UI_FSM_type") :
			this.getString("_UI_FSM_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		this.updateChildren(notification);

		switch (notification.getFeatureID(FSM.class)) {
			case FsmPackage.FSM__NAME:
				this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FsmPackage.FSM__STATES:
			case FsmPackage.FSM__TRANSITIONS:
				this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(this.createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 FsmFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(this.createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 FsmFactory.eINSTANCE.createInitialState()));

		newChildDescriptors.add
			(this.createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 FsmFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(this.createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 GfsmFactory.eINSTANCE.createGState()));

		newChildDescriptors.add
			(this.createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 GfsmFactory.eINSTANCE.createGInitialState()));

		newChildDescriptors.add
			(this.createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 GfsmFactory.eINSTANCE.createGFinalState()));

		newChildDescriptors.add
			(this.createChildParameter
				(FsmPackage.Literals.FSM__TRANSITIONS,
				 FsmFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(this.createChildParameter
				(FsmPackage.Literals.FSM__TRANSITIONS,
				 GfsmFactory.eINSTANCE.createGTransition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GfsmEditPlugin.INSTANCE;
	}

}
