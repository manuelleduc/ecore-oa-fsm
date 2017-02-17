/**
 */
package tfsm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tfsm.ClockConstraintOperation;
import tfsm.ClockReset;
import tfsm.TfsmPackage;
import tfsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tfsm.impl.TransitionImpl#getClockresets <em>Clockresets</em>}</li>
 *   <li>{@link tfsm.impl.TransitionImpl#getTransitionguard <em>Transitionguard</em>}</li>
 *   <li>{@link tfsm.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getClockresets() <em>Clockresets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockresets()
	 * @generated
	 * @ordered
	 */
	protected EList<ClockReset> clockresets;

	/**
	 * The cached value of the '{@link #getTransitionguard() <em>Transitionguard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionguard()
	 * @generated
	 * @ordered
	 */
	protected ClockConstraintOperation transitionguard;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TfsmPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClockReset> getClockresets() {
		if (clockresets == null) {
			clockresets = new EObjectContainmentEList<ClockReset>(ClockReset.class, this, TfsmPackage.TRANSITION__CLOCKRESETS);
		}
		return clockresets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraintOperation getTransitionguard() {
		return transitionguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionguard(ClockConstraintOperation newTransitionguard, NotificationChain msgs) {
		ClockConstraintOperation oldTransitionguard = transitionguard;
		transitionguard = newTransitionguard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TfsmPackage.TRANSITION__TRANSITIONGUARD, oldTransitionguard, newTransitionguard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionguard(ClockConstraintOperation newTransitionguard) {
		if (newTransitionguard != transitionguard) {
			NotificationChain msgs = null;
			if (transitionguard != null)
				msgs = ((InternalEObject)transitionguard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TfsmPackage.TRANSITION__TRANSITIONGUARD, null, msgs);
			if (newTransitionguard != null)
				msgs = ((InternalEObject)newTransitionguard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TfsmPackage.TRANSITION__TRANSITIONGUARD, null, msgs);
			msgs = basicSetTransitionguard(newTransitionguard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.TRANSITION__TRANSITIONGUARD, newTransitionguard, newTransitionguard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.TRANSITION__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmPackage.TRANSITION__CLOCKRESETS:
				return ((InternalEList<?>)getClockresets()).basicRemove(otherEnd, msgs);
			case TfsmPackage.TRANSITION__TRANSITIONGUARD:
				return basicSetTransitionguard(null, msgs);
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
			case TfsmPackage.TRANSITION__CLOCKRESETS:
				return getClockresets();
			case TfsmPackage.TRANSITION__TRANSITIONGUARD:
				return getTransitionguard();
			case TfsmPackage.TRANSITION__EVENT:
				return getEvent();
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
			case TfsmPackage.TRANSITION__CLOCKRESETS:
				getClockresets().clear();
				getClockresets().addAll((Collection<? extends ClockReset>)newValue);
				return;
			case TfsmPackage.TRANSITION__TRANSITIONGUARD:
				setTransitionguard((ClockConstraintOperation)newValue);
				return;
			case TfsmPackage.TRANSITION__EVENT:
				setEvent((String)newValue);
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
			case TfsmPackage.TRANSITION__CLOCKRESETS:
				getClockresets().clear();
				return;
			case TfsmPackage.TRANSITION__TRANSITIONGUARD:
				setTransitionguard((ClockConstraintOperation)null);
				return;
			case TfsmPackage.TRANSITION__EVENT:
				setEvent(EVENT_EDEFAULT);
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
			case TfsmPackage.TRANSITION__CLOCKRESETS:
				return clockresets != null && !clockresets.isEmpty();
			case TfsmPackage.TRANSITION__TRANSITIONGUARD:
				return transitionguard != null;
			case TfsmPackage.TRANSITION__EVENT:
				return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
