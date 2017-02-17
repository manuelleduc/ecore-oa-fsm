/**
 */
package fsm.impl;

import fsm.FSM;
import fsm.FsmPackage;
import fsm.State;
import fsm.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsm.impl.TransitionImpl#getFsm <em>Fsm</em>}</li>
 *   <li>{@link fsm.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link fsm.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link fsm.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	protected String event = TransitionImpl.EVENT_EDEFAULT;

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
		return FsmPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FSM getFsm() {
		if (this.eContainerFeatureID() != FsmPackage.TRANSITION__FSM) {
			return null;
		}
		return (FSM)this.eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFsm(final FSM newFsm, NotificationChain msgs) {
		msgs = this.eBasicSetContainer((InternalEObject)newFsm, FsmPackage.TRANSITION__FSM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFsm(final FSM newFsm) {
		if (newFsm != this.eInternalContainer() || this.eContainerFeatureID() != FsmPackage.TRANSITION__FSM && newFsm != null) {
			if (EcoreUtil.isAncestor(this, newFsm)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
			}
			NotificationChain msgs = null;
			if (this.eInternalContainer() != null) {
				msgs = this.eBasicRemoveFromContainer(msgs);
			}
			if (newFsm != null) {
				msgs = ((InternalEObject)newFsm).eInverseAdd(this, FsmPackage.FSM__TRANSITIONS, FSM.class, msgs);
			}
			msgs = this.basicSetFsm(newFsm, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__FSM, newFsm, newFsm));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getFrom() {
		if (this.from != null && this.from.eIsProxy()) {
			final InternalEObject oldFrom = (InternalEObject)this.from;
			this.from = (State)this.eResolveProxy(oldFrom);
			if (this.from != oldFrom) {
				if (this.eNotificationRequired()) {
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRANSITION__FROM, oldFrom, this.from));
				}
			}
		}
		return this.from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFrom() {
		return this.from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(final State newFrom, NotificationChain msgs) {
		final State oldFrom = this.from;
		this.from = newFrom;
		if (this.eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__FROM, oldFrom, newFrom);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(final State newFrom) {
		if (newFrom != this.from) {
			NotificationChain msgs = null;
			if (this.from != null) {
				msgs = ((InternalEObject)this.from).eInverseRemove(this, FsmPackage.STATE__OUTGOINGTRANSITIONS, State.class, msgs);
			}
			if (newFrom != null) {
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, FsmPackage.STATE__OUTGOINGTRANSITIONS, State.class, msgs);
			}
			msgs = this.basicSetFrom(newFrom, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__FROM, newFrom, newFrom));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getTo() {
		if (this.to != null && this.to.eIsProxy()) {
			final InternalEObject oldTo = (InternalEObject)this.to;
			this.to = (State)this.eResolveProxy(oldTo);
			if (this.to != oldTo) {
				if (this.eNotificationRequired()) {
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRANSITION__TO, oldTo, this.to));
				}
			}
		}
		return this.to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTo() {
		return this.to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(final State newTo, NotificationChain msgs) {
		final State oldTo = this.to;
		this.to = newTo;
		if (this.eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__TO, oldTo, newTo);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(final State newTo) {
		if (newTo != this.to) {
			NotificationChain msgs = null;
			if (this.to != null) {
				msgs = ((InternalEObject)this.to).eInverseRemove(this, FsmPackage.STATE__INCOMMINGTRANSITIONS, State.class, msgs);
			}
			if (newTo != null) {
				msgs = ((InternalEObject)newTo).eInverseAdd(this, FsmPackage.STATE__INCOMMINGTRANSITIONS, State.class, msgs);
			}
			msgs = this.basicSetTo(newTo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__TO, newTo, newTo));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEvent() {
		return this.event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(final String newEvent) {
		final String oldEvent = this.event;
		this.event = newEvent;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__EVENT, oldEvent, this.event));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.TRANSITION__FSM:
				if (this.eInternalContainer() != null) {
					msgs = this.eBasicRemoveFromContainer(msgs);
				}
				return this.basicSetFsm((FSM)otherEnd, msgs);
			case FsmPackage.TRANSITION__FROM:
				if (this.from != null) {
					msgs = ((InternalEObject)this.from).eInverseRemove(this, FsmPackage.STATE__OUTGOINGTRANSITIONS, State.class, msgs);
				}
				return this.basicSetFrom((State)otherEnd, msgs);
			case FsmPackage.TRANSITION__TO:
				if (this.to != null) {
					msgs = ((InternalEObject)this.to).eInverseRemove(this, FsmPackage.STATE__INCOMMINGTRANSITIONS, State.class, msgs);
				}
				return this.basicSetTo((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.TRANSITION__FSM:
				return this.basicSetFsm(null, msgs);
			case FsmPackage.TRANSITION__FROM:
				return this.basicSetFrom(null, msgs);
			case FsmPackage.TRANSITION__TO:
				return this.basicSetTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
		switch (this.eContainerFeatureID()) {
			case FsmPackage.TRANSITION__FSM:
				return this.eInternalContainer().eInverseRemove(this, FsmPackage.FSM__TRANSITIONS, FSM.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case FsmPackage.TRANSITION__FSM:
				return this.getFsm();
			case FsmPackage.TRANSITION__FROM:
				if (resolve) {
					return this.getFrom();
				}
				return this.basicGetFrom();
			case FsmPackage.TRANSITION__TO:
				if (resolve) {
					return this.getTo();
				}
				return this.basicGetTo();
			case FsmPackage.TRANSITION__EVENT:
				return this.getEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
			case FsmPackage.TRANSITION__FSM:
				this.setFsm((FSM)newValue);
				return;
			case FsmPackage.TRANSITION__FROM:
				this.setFrom((State)newValue);
				return;
			case FsmPackage.TRANSITION__TO:
				this.setTo((State)newValue);
				return;
			case FsmPackage.TRANSITION__EVENT:
				this.setEvent((String)newValue);
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
	public void eUnset(final int featureID) {
		switch (featureID) {
			case FsmPackage.TRANSITION__FSM:
				this.setFsm((FSM)null);
				return;
			case FsmPackage.TRANSITION__FROM:
				this.setFrom((State)null);
				return;
			case FsmPackage.TRANSITION__TO:
				this.setTo((State)null);
				return;
			case FsmPackage.TRANSITION__EVENT:
				this.setEvent(TransitionImpl.EVENT_EDEFAULT);
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
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
			case FsmPackage.TRANSITION__FSM:
				return this.getFsm() != null;
			case FsmPackage.TRANSITION__FROM:
				return this.from != null;
			case FsmPackage.TRANSITION__TO:
				return this.to != null;
			case FsmPackage.TRANSITION__EVENT:
				return TransitionImpl.EVENT_EDEFAULT == null ? this.event != null : !TransitionImpl.EVENT_EDEFAULT.equals(this.event);
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
		if (this.eIsProxy()) {
			return super.toString();
		}

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (event: ");
		result.append(this.event);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
