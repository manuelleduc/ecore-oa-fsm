/**
 */
package fsm.provider;


import fsm.FsmPackage;
import fsm.State;

import gfsm.provider.GfsmEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link fsm.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider 
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
	public StateItemProvider(final AdapterFactory adapterFactory) {
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

			this.addNamePropertyDescriptor(object);
			this.addOutgoingtransitionsPropertyDescriptor(object);
			this.addIncommingtransitionsPropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
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
				 this.getString("_UI_State_name_feature"),
				 this.getString("_UI_PropertyDescriptor_description", "_UI_State_name_feature", "_UI_State_type"),
				 FsmPackage.Literals.STATE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoingtransitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingtransitionsPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add
			(this.createItemPropertyDescriptor
				(((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory(),
				 this.getResourceLocator(),
				 this.getString("_UI_State_outgoingtransitions_feature"),
				 this.getString("_UI_PropertyDescriptor_description", "_UI_State_outgoingtransitions_feature", "_UI_State_type"),
				 FsmPackage.Literals.STATE__OUTGOINGTRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incommingtransitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncommingtransitionsPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add
			(this.createItemPropertyDescriptor
				(((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory(),
				 this.getResourceLocator(),
				 this.getString("_UI_State_incommingtransitions_feature"),
				 this.getString("_UI_PropertyDescriptor_description", "_UI_State_incommingtransitions_feature", "_UI_State_type"),
				 FsmPackage.Literals.STATE__INCOMMINGTRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns State.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/State"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		final String label = ((State)object).getName();
		return label == null || label.length() == 0 ?
			this.getString("_UI_State_type") :
			this.getString("_UI_State_type") + " " + label;
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

		switch (notification.getFeatureID(State.class)) {
			case FsmPackage.STATE__NAME:
				this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
