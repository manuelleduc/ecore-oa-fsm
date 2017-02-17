/**
 */
package fsm.impl;

import fsm.FSM;
import fsm.FsmPackage;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link fsm.impl.StateImpl#getFsm <em>Fsm</em>}</li>
 *   <li>{@link fsm.impl.StateImpl#getOutgoingtransitions <em>Outgoingtransitions</em>}</li>
 *   <li>{@link fsm.impl.StateImpl#getIncommingtransitions <em>Incommingtransitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	protected String name = StateImpl.NAME_EDEFAULT;

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
		return FsmPackage.Literals.STATE;
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
			this.eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__NAME, oldName, this.name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FSM getFsm() {
		if (this.eContainerFeatureID() != FsmPackage.STATE__FSM) {
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
		msgs = this.eBasicSetContainer((InternalEObject)newFsm, FsmPackage.STATE__FSM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFsm(final FSM newFsm) {
		if (newFsm != this.eInternalContainer() || this.eContainerFeatureID() != FsmPackage.STATE__FSM && newFsm != null) {
			if (EcoreUtil.isAncestor(this, newFsm)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
			}
			NotificationChain msgs = null;
			if (this.eInternalContainer() != null) {
				msgs = this.eBasicRemoveFromContainer(msgs);
			}
			if (newFsm != null) {
				msgs = ((InternalEObject)newFsm).eInverseAdd(this, FsmPackage.FSM__STATES, FSM.class, msgs);
			}
			msgs = this.basicSetFsm(newFsm, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.STATE__FSM, newFsm, newFsm));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutgoingtransitions() {
		if (this.outgoingtransitions == null) {
			this.outgoingtransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FsmPackage.STATE__OUTGOINGTRANSITIONS, FsmPackage.TRANSITION__FROM);
		}
		return this.outgoingtransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getIncommingtransitions() {
		if (this.incommingtransitions == null) {
			this.incommingtransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FsmPackage.STATE__INCOMMINGTRANSITIONS, FsmPackage.TRANSITION__TO);
		}
		return this.incommingtransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.STATE__FSM:
				if (this.eInternalContainer() != null) {
					msgs = this.eBasicRemoveFromContainer(msgs);
				}
				return this.basicSetFsm((FSM)otherEnd, msgs);
			case FsmPackage.STATE__OUTGOINGTRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)this.getOutgoingtransitions()).basicAdd(otherEnd, msgs);
			case FsmPackage.STATE__INCOMMINGTRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)this.getIncommingtransitions()).basicAdd(otherEnd, msgs);
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
			case FsmPackage.STATE__FSM:
				return this.basicSetFsm(null, msgs);
			case FsmPackage.STATE__OUTGOINGTRANSITIONS:
				return ((InternalEList<?>)this.getOutgoingtransitions()).basicRemove(otherEnd, msgs);
			case FsmPackage.STATE__INCOMMINGTRANSITIONS:
				return ((InternalEList<?>)this.getIncommingtransitions()).basicRemove(otherEnd, msgs);
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
			case FsmPackage.STATE__FSM:
				return this.eInternalContainer().eInverseRemove(this, FsmPackage.FSM__STATES, FSM.class, msgs);
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
			case FsmPackage.STATE__NAME:
				return this.getName();
			case FsmPackage.STATE__FSM:
				return this.getFsm();
			case FsmPackage.STATE__OUTGOINGTRANSITIONS:
				return this.getOutgoingtransitions();
			case FsmPackage.STATE__INCOMMINGTRANSITIONS:
				return this.getIncommingtransitions();
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
			case FsmPackage.STATE__NAME:
				this.setName((String)newValue);
				return;
			case FsmPackage.STATE__FSM:
				this.setFsm((FSM)newValue);
				return;
			case FsmPackage.STATE__OUTGOINGTRANSITIONS:
				this.getOutgoingtransitions().clear();
				this.getOutgoingtransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case FsmPackage.STATE__INCOMMINGTRANSITIONS:
				this.getIncommingtransitions().clear();
				this.getIncommingtransitions().addAll((Collection<? extends Transition>)newValue);
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
			case FsmPackage.STATE__NAME:
				this.setName(StateImpl.NAME_EDEFAULT);
				return;
			case FsmPackage.STATE__FSM:
				this.setFsm((FSM)null);
				return;
			case FsmPackage.STATE__OUTGOINGTRANSITIONS:
				this.getOutgoingtransitions().clear();
				return;
			case FsmPackage.STATE__INCOMMINGTRANSITIONS:
				this.getIncommingtransitions().clear();
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
			case FsmPackage.STATE__NAME:
				return StateImpl.NAME_EDEFAULT == null ? this.name != null : !StateImpl.NAME_EDEFAULT.equals(this.name);
			case FsmPackage.STATE__FSM:
				return this.getFsm() != null;
			case FsmPackage.STATE__OUTGOINGTRANSITIONS:
				return this.outgoingtransitions != null && !this.outgoingtransitions.isEmpty();
			case FsmPackage.STATE__INCOMMINGTRANSITIONS:
				return this.incommingtransitions != null && !this.incommingtransitions.isEmpty();
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

} //StateImpl
