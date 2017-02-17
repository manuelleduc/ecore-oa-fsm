/**
 */
package fsm.impl;

import fsm.FSM;
import fsm.FsmPackage;
import fsm.InitialState;
import fsm.State;
import fsm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsm.impl.FSMImpl#getStates <em>States</em>}</li>
 *   <li>{@link fsm.impl.FSMImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fsm.impl.FSMImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link fsm.impl.FSMImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMImpl extends MinimalEObjectImpl.Container implements FSM {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialstate;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = FSMImpl.NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FsmPackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (this.states == null) {
			this.states = new EObjectContainmentWithInverseEList<State>(State.class, this, FsmPackage.FSM__STATES, FsmPackage.STATE__FSM);
		}
		return this.states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitions() {
		if (this.transitions == null) {
			this.transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, FsmPackage.FSM__TRANSITIONS, FsmPackage.TRANSITION__FSM);
		}
		return this.transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialState getInitialstate() {
		if (this.initialstate != null && this.initialstate.eIsProxy()) {
			final InternalEObject oldInitialstate = (InternalEObject)this.initialstate;
			this.initialstate = (InitialState)this.eResolveProxy(oldInitialstate);
			if (this.initialstate != oldInitialstate) {
				if (this.eNotificationRequired()) {
					this.eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.FSM__INITIALSTATE, oldInitialstate, this.initialstate));
				}
			}
		}
		return this.initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState basicGetInitialstate() {
		return this.initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialstate(final InitialState newInitialstate) {
		final InitialState oldInitialstate = this.initialstate;
		this.initialstate = newInitialstate;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__INITIALSTATE, oldInitialstate, this.initialstate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(final String newName) {
		final String oldName = this.name;
		this.name = newName;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.FSM__NAME, oldName, this.name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.FSM__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)this.getStates()).basicAdd(otherEnd, msgs);
			case FsmPackage.FSM__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)this.getTransitions()).basicAdd(otherEnd, msgs);
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
			case FsmPackage.FSM__STATES:
				return ((InternalEList<?>)this.getStates()).basicRemove(otherEnd, msgs);
			case FsmPackage.FSM__TRANSITIONS:
				return ((InternalEList<?>)this.getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case FsmPackage.FSM__STATES:
				return this.getStates();
			case FsmPackage.FSM__TRANSITIONS:
				return this.getTransitions();
			case FsmPackage.FSM__INITIALSTATE:
				if (resolve) {
					return this.getInitialstate();
				}
				return this.basicGetInitialstate();
			case FsmPackage.FSM__NAME:
				return this.getName();
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
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
			case FsmPackage.FSM__STATES:
				this.getStates().clear();
				this.getStates().addAll((Collection<? extends State>)newValue);
				return;
			case FsmPackage.FSM__TRANSITIONS:
				this.getTransitions().clear();
				this.getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case FsmPackage.FSM__INITIALSTATE:
				this.setInitialstate((InitialState)newValue);
				return;
			case FsmPackage.FSM__NAME:
				this.setName((String)newValue);
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
			case FsmPackage.FSM__STATES:
				this.getStates().clear();
				return;
			case FsmPackage.FSM__TRANSITIONS:
				this.getTransitions().clear();
				return;
			case FsmPackage.FSM__INITIALSTATE:
				this.setInitialstate((InitialState)null);
				return;
			case FsmPackage.FSM__NAME:
				this.setName(FSMImpl.NAME_EDEFAULT);
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
			case FsmPackage.FSM__STATES:
				return this.states != null && !this.states.isEmpty();
			case FsmPackage.FSM__TRANSITIONS:
				return this.transitions != null && !this.transitions.isEmpty();
			case FsmPackage.FSM__INITIALSTATE:
				return this.initialstate != null;
			case FsmPackage.FSM__NAME:
				return FSMImpl.NAME_EDEFAULT == null ? this.name != null : !FSMImpl.NAME_EDEFAULT.equals(this.name);
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
		result.append(" (name: ");
		result.append(this.name);
		result.append(')');
		return result.toString();
	}

} //FSMImpl
