/**
 */
package tfsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tfsm.State#getStateguard <em>Stateguard</em>}</li>
 *   <li>{@link tfsm.State#getName <em>Name</em>}</li>
 *   <li>{@link tfsm.State#getFsm <em>Fsm</em>}</li>
 * </ul>
 *
 * @see tfsm.TfsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Stateguard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stateguard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateguard</em>' containment reference.
	 * @see #setStateguard(ClockConstraintOperation)
	 * @see tfsm.TfsmPackage#getState_Stateguard()
	 * @model containment="true"
	 * @generated
	 */
	ClockConstraintOperation getStateguard();

	/**
	 * Sets the value of the '{@link tfsm.State#getStateguard <em>Stateguard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateguard</em>' containment reference.
	 * @see #getStateguard()
	 * @generated
	 */
	void setStateguard(ClockConstraintOperation value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tfsm.TfsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tfsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fsm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm</em>' reference.
	 * @see #setFsm(FSM)
	 * @see tfsm.TfsmPackage#getState_Fsm()
	 * @model required="true"
	 * @generated
	 */
	FSM getFsm();

	/**
	 * Sets the value of the '{@link tfsm.State#getFsm <em>Fsm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fsm</em>' reference.
	 * @see #getFsm()
	 * @generated
	 */
	void setFsm(FSM value);

} // State
