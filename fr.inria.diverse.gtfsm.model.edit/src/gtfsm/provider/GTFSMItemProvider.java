/**
 */
package gtfsm.provider;


import fsm.FsmPackage;

import gfsm.GfsmFactory;

import gtfsm.GTFSM;
import gtfsm.GtfsmFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import tfsm.provider.TimedFSMItemProvider;

/**
 * This is the item provider adapter for a {@link gtfsm.GTFSM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GTFSMItemProvider extends TimedFSMItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTFSMItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns GTFSM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GTFSM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GTFSM)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GTFSM_type") :
			getString("_UI_GTFSM_type") + " " + label;
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
				(FsmPackage.Literals.FSM__STATES,
				 GtfsmFactory.eINSTANCE.createGTState()));

		newChildDescriptors.add
			(createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 GtfsmFactory.eINSTANCE.createGTInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 GtfsmFactory.eINSTANCE.createGTFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 GfsmFactory.eINSTANCE.createGState()));

		newChildDescriptors.add
			(createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 GfsmFactory.eINSTANCE.createGInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(FsmPackage.Literals.FSM__STATES,
				 GfsmFactory.eINSTANCE.createGFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(FsmPackage.Literals.FSM__TRANSITIONS,
				 GtfsmFactory.eINSTANCE.createGTTransition()));

		newChildDescriptors.add
			(createChildParameter
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
		return GtfsmEditPlugin.INSTANCE;
	}

}
