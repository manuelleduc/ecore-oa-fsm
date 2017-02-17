/**
 */
package tfsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tfsm.Transition#getClockresets <em>Clockresets</em>}</li>
 *   <li>{@link tfsm.Transition#getTransitionguard <em>Transitionguard</em>}</li>
 *   <li>{@link tfsm.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link tfsm.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link tfsm.Transition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see tfsm.TfsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Clockresets</b></em>' containment reference list.
	 * The list contents are of type {@link tfsm.ClockReset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clockresets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clockresets</em>' containment reference list.
	 * @see tfsm.TfsmPackage#getTransition_Clockresets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClockReset> getClockresets();

	/**
	 * Returns the value of the '<em><b>Transitionguard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitionguard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitionguard</em>' containment reference.
	 * @see #setTransitionguard(ClockConstraintOperation)
	 * @see tfsm.TfsmPackage#getTransition_Transitionguard()
	 * @model containment="true"
	 * @generated
	 */
	ClockConstraintOperation getTransitionguard();

	/**
	 * Sets the value of the '{@link tfsm.Transition#getTransitionguard <em>Transitionguard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitionguard</em>' containment reference.
	 * @see #getTransitionguard()
	 * @generated
	 */
	void setTransitionguard(ClockConstraintOperation value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see tfsm.TfsmPackage#getTransition_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link tfsm.Transition#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tfsm.State#getOutgoingtransitions <em>Outgoingtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see tfsm.TfsmPackage#getTransition_From()
	 * @see tfsm.State#getOutgoingtransitions
	 * @model opposite="outgoingtransitions" required="true"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link tfsm.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tfsm.State#getIncommingtransitions <em>Incommingtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see tfsm.TfsmPackage#getTransition_To()
	 * @see tfsm.State#getIncommingtransitions
	 * @model opposite="incommingtransitions" required="true"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link tfsm.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

} // Transition
