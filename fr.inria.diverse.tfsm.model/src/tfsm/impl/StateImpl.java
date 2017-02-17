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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tfsm.ClockConstraintOperation;
import tfsm.FSM;
import tfsm.State;
import tfsm.TfsmPackage;
import tfsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tfsm.impl.StateImpl#getStateguard <em>Stateguard</em>}</li>
 *   <li>{@link tfsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link tfsm.impl.StateImpl#getFsm <em>Fsm</em>}</li>
 *   <li>{@link tfsm.impl.StateImpl#getOutgoingtransitions <em>Outgoingtransitions</em>}</li>
 *   <li>{@link tfsm.impl.StateImpl#getIncommingtransitions <em>Incommingtransitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getStateguard() <em>Stateguard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateguard()
	 * @generated
	 * @ordered
	 */
	protected ClockConstraintOperation stateguard;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getFsm() <em>Fsm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm()
	 * @generated
	 * @ordered
	 */
	protected FSM fsm;

	/**
	 * The cached value of the '{@link #getOutgoingtransitions() <em>Outgoingtransitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingtransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingtransitions;

	/**
	 * The cached value of the '{@link #getIncommingtransitions() <em>Incommingtransitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncommingtransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incommingtransitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TfsmPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockConstraintOperation getStateguard() {
		return stateguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateguard(ClockConstraintOperation newStateguard, NotificationChain msgs) {
		ClockConstraintOperation oldStateguard = stateguard;
		stateguard = newStateguard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TfsmPackage.STATE__STATEGUARD, oldStateguard, newStateguard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateguard(ClockConstraintOperation newStateguard) {
		if (newStateguard != stateguard) {
			NotificationChain msgs = null;
			if (stateguard != null)
				msgs = ((InternalEObject)stateguard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TfsmPackage.STATE__STATEGUARD, null, msgs);
			if (newStateguard != null)
				msgs = ((InternalEObject)newStateguard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TfsmPackage.STATE__STATEGUARD, null, msgs);
			msgs = basicSetStateguard(newStateguard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.STATE__STATEGUARD, newStateguard, newStateguard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getFsm() {
		if (fsm != null && fsm.eIsProxy()) {
			InternalEObject oldFsm = (InternalEObject)fsm;
			fsm = (FSM)eResolveProxy(oldFsm);
			if (fsm != oldFsm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TfsmPackage.STATE__FSM, oldFsm, fsm));
			}
		}
		return fsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM basicGetFsm() {
		return fsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFsm(FSM newFsm) {
		FSM oldFsm = fsm;
		fsm = newFsm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TfsmPackage.STATE__FSM, oldFsm, fsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingtransitions() {
		if (outgoingtransitions == null) {
			outgoingtransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, TfsmPackage.STATE__OUTGOINGTRANSITIONS, TfsmPackage.TRANSITION__FROM);
		}
		return outgoingtransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncommingtransitions() {
		if (incommingtransitions == null) {
			incommingtransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, TfsmPackage.STATE__INCOMMINGTRANSITIONS, TfsmPackage.TRANSITION__TO);
		}
		return incommingtransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TfsmPackage.STATE__OUTGOINGTRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingtransitions()).basicAdd(otherEnd, msgs);
			case TfsmPackage.STATE__INCOMMINGTRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncommingtransitions()).basicAdd(otherEnd, msgs);
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
			case TfsmPackage.STATE__STATEGUARD:
				return basicSetStateguard(null, msgs);
			case TfsmPackage.STATE__OUTGOINGTRANSITIONS:
				return ((InternalEList<?>)getOutgoingtransitions()).basicRemove(otherEnd, msgs);
			case TfsmPackage.STATE__INCOMMINGTRANSITIONS:
				return ((InternalEList<?>)getIncommingtransitions()).basicRemove(otherEnd, msgs);
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
			case TfsmPackage.STATE__STATEGUARD:
				return getStateguard();
			case TfsmPackage.STATE__NAME:
				return getName();
			case TfsmPackage.STATE__FSM:
				if (resolve) return getFsm();
				return basicGetFsm();
			case TfsmPackage.STATE__OUTGOINGTRANSITIONS:
				return getOutgoingtransitions();
			case TfsmPackage.STATE__INCOMMINGTRANSITIONS:
				return getIncommingtransitions();
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
			case TfsmPackage.STATE__STATEGUARD:
				setStateguard((ClockConstraintOperation)newValue);
				return;
			case TfsmPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case TfsmPackage.STATE__FSM:
				setFsm((FSM)newValue);
				return;
			case TfsmPackage.STATE__OUTGOINGTRANSITIONS:
				getOutgoingtransitions().clear();
				getOutgoingtransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case TfsmPackage.STATE__INCOMMINGTRANSITIONS:
				getIncommingtransitions().clear();
				getIncommingtransitions().addAll((Collection<? extends Transition>)newValue);
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
			case TfsmPackage.STATE__STATEGUARD:
				setStateguard((ClockConstraintOperation)null);
				return;
			case TfsmPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TfsmPackage.STATE__FSM:
				setFsm((FSM)null);
				return;
			case TfsmPackage.STATE__OUTGOINGTRANSITIONS:
				getOutgoingtransitions().clear();
				return;
			case TfsmPackage.STATE__INCOMMINGTRANSITIONS:
				getIncommingtransitions().clear();
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
			case TfsmPackage.STATE__STATEGUARD:
				return stateguard != null;
			case TfsmPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TfsmPackage.STATE__FSM:
				return fsm != null;
			case TfsmPackage.STATE__OUTGOINGTRANSITIONS:
				return outgoingtransitions != null && !outgoingtransitions.isEmpty();
			case TfsmPackage.STATE__INCOMMINGTRANSITIONS:
				return incommingtransitions != null && !incommingtransitions.isEmpty();
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

} //StateImpl
