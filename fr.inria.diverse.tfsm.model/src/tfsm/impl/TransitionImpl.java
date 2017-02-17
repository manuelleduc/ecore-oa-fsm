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
import tfsm.State;
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
 *   <li>{@link tfsm.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link tfsm.impl.TransitionImpl#getTo <em>To</em>}</li>
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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected State from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected State to;

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
	public State getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (State)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TfsmPackage.TRANSITION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(State newFrom, NotificationChain msgs) {
		State oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TfsmPackage.TRANSITION__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(State newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, TfsmPackage.STATE__OUTGOINGTRANSITIONS, State.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, TfsmPackage.STATE__OUTGOINGTRANSITIONS, State.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.TRANSITION__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (State)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TfsmPackage.TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(State newTo, NotificationChain msgs) {
		State oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TfsmPackage.TRANSITION__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(State newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, TfsmPackage.STATE__INCOMMINGTRANSITIONS, State.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, TfsmPackage.STATE__INCOMMINGTRANSITIONS, State.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.TRANSITION__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmPackage.TRANSITION__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, TfsmPackage.STATE__OUTGOINGTRANSITIONS, State.class, msgs);
				return basicSetFrom((State)otherEnd, msgs);
			case TfsmPackage.TRANSITION__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, TfsmPackage.STATE__INCOMMINGTRANSITIONS, State.class, msgs);
				return basicSetTo((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case TfsmPackage.TRANSITION__FROM:
				return basicSetFrom(null, msgs);
			case TfsmPackage.TRANSITION__TO:
				return basicSetTo(null, msgs);
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
			case TfsmPackage.TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case TfsmPackage.TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case TfsmPackage.TRANSITION__FROM:
				setFrom((State)newValue);
				return;
			case TfsmPackage.TRANSITION__TO:
				setTo((State)newValue);
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
			case TfsmPackage.TRANSITION__FROM:
				setFrom((State)null);
				return;
			case TfsmPackage.TRANSITION__TO:
				setTo((State)null);
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
			case TfsmPackage.TRANSITION__FROM:
				return from != null;
			case TfsmPackage.TRANSITION__TO:
				return to != null;
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
