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

import tfsm.Clock;
import tfsm.FSM;
import tfsm.InitialState;
import tfsm.State;
import tfsm.TfsmPackage;
import tfsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tfsm.impl.FSMImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link tfsm.impl.FSMImpl#getStates <em>States</em>}</li>
 *   <li>{@link tfsm.impl.FSMImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link tfsm.impl.FSMImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link tfsm.impl.FSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link tfsm.impl.FSMImpl#getCurrentState <em>Current State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMImpl extends MinimalEObjectImpl.Container implements FSM {
	/**
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clocks;

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
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected State currentState;

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
		return TfsmPackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentEList<Clock>(Clock.class, this, TfsmPackage.FSM__CLOCKS);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, TfsmPackage.FSM__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, TfsmPackage.FSM__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitialstate() {
		if (initialstate != null && initialstate.eIsProxy()) {
			InternalEObject oldInitialstate = (InternalEObject)initialstate;
			initialstate = (InitialState)eResolveProxy(oldInitialstate);
			if (initialstate != oldInitialstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TfsmPackage.FSM__INITIALSTATE, oldInitialstate, initialstate));
			}
		}
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState basicGetInitialstate() {
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialstate(InitialState newInitialstate) {
		InitialState oldInitialstate = initialstate;
		initialstate = newInitialstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.FSM__INITIALSTATE, oldInitialstate, initialstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.FSM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCurrentState() {
		if (currentState != null && currentState.eIsProxy()) {
			InternalEObject oldCurrentState = (InternalEObject)currentState;
			currentState = (State)eResolveProxy(oldCurrentState);
			if (currentState != oldCurrentState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TfsmPackage.FSM__CURRENT_STATE, oldCurrentState, currentState));
			}
		}
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentState(State newCurrentState) {
		State oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.FSM__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmPackage.FSM__CLOCKS:
				return ((InternalEList<?>)getClocks()).basicRemove(otherEnd, msgs);
			case TfsmPackage.FSM__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case TfsmPackage.FSM__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case TfsmPackage.FSM__CLOCKS:
				return getClocks();
			case TfsmPackage.FSM__STATES:
				return getStates();
			case TfsmPackage.FSM__TRANSITIONS:
				return getTransitions();
			case TfsmPackage.FSM__INITIALSTATE:
				if (resolve) return getInitialstate();
				return basicGetInitialstate();
			case TfsmPackage.FSM__NAME:
				return getName();
			case TfsmPackage.FSM__CURRENT_STATE:
				if (resolve) return getCurrentState();
				return basicGetCurrentState();
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
			case TfsmPackage.FSM__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case TfsmPackage.FSM__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case TfsmPackage.FSM__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case TfsmPackage.FSM__INITIALSTATE:
				setInitialstate((InitialState)newValue);
				return;
			case TfsmPackage.FSM__NAME:
				setName((String)newValue);
				return;
			case TfsmPackage.FSM__CURRENT_STATE:
				setCurrentState((State)newValue);
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
			case TfsmPackage.FSM__CLOCKS:
				getClocks().clear();
				return;
			case TfsmPackage.FSM__STATES:
				getStates().clear();
				return;
			case TfsmPackage.FSM__TRANSITIONS:
				getTransitions().clear();
				return;
			case TfsmPackage.FSM__INITIALSTATE:
				setInitialstate((InitialState)null);
				return;
			case TfsmPackage.FSM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TfsmPackage.FSM__CURRENT_STATE:
				setCurrentState((State)null);
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
			case TfsmPackage.FSM__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case TfsmPackage.FSM__STATES:
				return states != null && !states.isEmpty();
			case TfsmPackage.FSM__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case TfsmPackage.FSM__INITIALSTATE:
				return initialstate != null;
			case TfsmPackage.FSM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TfsmPackage.FSM__CURRENT_STATE:
				return currentState != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FSMImpl
