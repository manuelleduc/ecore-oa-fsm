/**
 */
package tfsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tfsm.TfsmFactory
 * @model kind="package"
 * @generated
 */
public interface TfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://diverse.inria.fr/tfsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tfsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TfsmPackage eINSTANCE = tfsm.impl.TfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link tfsm.impl.FSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.FSMImpl
	 * @see tfsm.impl.TfsmPackageImpl#getFSM()
	 * @generated
	 */
	int FSM = 0;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__CLOCKS = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__STATES = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__INITIALSTATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__NAME = 4;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.StateImpl
	 * @see tfsm.impl.TfsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Stateguard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATEGUARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FSM = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.TransitionImpl
	 * @see tfsm.impl.TfsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Clockresets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLOCKRESETS = 0;

	/**
	 * The feature id for the '<em><b>Transitionguard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITIONGUARD = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.ClockImpl
	 * @see tfsm.impl.TfsmPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__TICK = 1;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.ClockConstraintOperationImpl <em>Clock Constraint Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.ClockConstraintOperationImpl
	 * @see tfsm.impl.TfsmPackageImpl#getClockConstraintOperation()
	 * @generated
	 */
	int CLOCK_CONSTRAINT_OPERATION = 10;

	/**
	 * The number of structural features of the '<em>Clock Constraint Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Clock Constraint Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.ClockConstraintImpl
	 * @see tfsm.impl.TfsmPackageImpl#getClockConstraint()
	 * @generated
	 */
	int CLOCK_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__THRESHOLD = CLOCK_CONSTRAINT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT__CLOCK = CLOCK_CONSTRAINT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_FEATURE_COUNT = CLOCK_CONSTRAINT_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_CONSTRAINT_OPERATION_COUNT = CLOCK_CONSTRAINT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.ClockResetImpl <em>Clock Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.ClockResetImpl
	 * @see tfsm.impl.TfsmPackageImpl#getClockReset()
	 * @generated
	 */
	int CLOCK_RESET = 5;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET__CLOCK = 0;

	/**
	 * The number of structural features of the '<em>Clock Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clock Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RESET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.LowerClockConstraintImpl <em>Lower Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.LowerClockConstraintImpl
	 * @see tfsm.impl.TfsmPackageImpl#getLowerClockConstraint()
	 * @generated
	 */
	int LOWER_CLOCK_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_CLOCK_CONSTRAINT__THRESHOLD = CLOCK_CONSTRAINT__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_CLOCK_CONSTRAINT__CLOCK = CLOCK_CONSTRAINT__CLOCK;

	/**
	 * The number of structural features of the '<em>Lower Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_CLOCK_CONSTRAINT_FEATURE_COUNT = CLOCK_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_CLOCK_CONSTRAINT_OPERATION_COUNT = CLOCK_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.LowerEqualClockConstraintImpl <em>Lower Equal Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.LowerEqualClockConstraintImpl
	 * @see tfsm.impl.TfsmPackageImpl#getLowerEqualClockConstraint()
	 * @generated
	 */
	int LOWER_EQUAL_CLOCK_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_CLOCK_CONSTRAINT__THRESHOLD = CLOCK_CONSTRAINT__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_CLOCK_CONSTRAINT__CLOCK = CLOCK_CONSTRAINT__CLOCK;

	/**
	 * The number of structural features of the '<em>Lower Equal Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_CLOCK_CONSTRAINT_FEATURE_COUNT = CLOCK_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower Equal Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_EQUAL_CLOCK_CONSTRAINT_OPERATION_COUNT = CLOCK_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.UpperClockConstraintImpl <em>Upper Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.UpperClockConstraintImpl
	 * @see tfsm.impl.TfsmPackageImpl#getUpperClockConstraint()
	 * @generated
	 */
	int UPPER_CLOCK_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_CLOCK_CONSTRAINT__THRESHOLD = CLOCK_CONSTRAINT__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_CLOCK_CONSTRAINT__CLOCK = CLOCK_CONSTRAINT__CLOCK;

	/**
	 * The number of structural features of the '<em>Upper Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_CLOCK_CONSTRAINT_FEATURE_COUNT = CLOCK_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upper Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_CLOCK_CONSTRAINT_OPERATION_COUNT = CLOCK_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.UpperEqualClockConstraintImpl <em>Upper Equal Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.UpperEqualClockConstraintImpl
	 * @see tfsm.impl.TfsmPackageImpl#getUpperEqualClockConstraint()
	 * @generated
	 */
	int UPPER_EQUAL_CLOCK_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_EQUAL_CLOCK_CONSTRAINT__THRESHOLD = CLOCK_CONSTRAINT__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_EQUAL_CLOCK_CONSTRAINT__CLOCK = CLOCK_CONSTRAINT__CLOCK;

	/**
	 * The number of structural features of the '<em>Upper Equal Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_EQUAL_CLOCK_CONSTRAINT_FEATURE_COUNT = CLOCK_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upper Equal Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_EQUAL_CLOCK_CONSTRAINT_OPERATION_COUNT = CLOCK_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.BinaryClockConstraintImpl <em>Binary Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.BinaryClockConstraintImpl
	 * @see tfsm.impl.TfsmPackageImpl#getBinaryClockConstraint()
	 * @generated
	 */
	int BINARY_CLOCK_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLOCK_CONSTRAINT__LEFT = CLOCK_CONSTRAINT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLOCK_CONSTRAINT__RIGHT = CLOCK_CONSTRAINT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLOCK_CONSTRAINT_FEATURE_COUNT = CLOCK_CONSTRAINT_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CLOCK_CONSTRAINT_OPERATION_COUNT = CLOCK_CONSTRAINT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.AndClockConstraintImpl <em>And Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.AndClockConstraintImpl
	 * @see tfsm.impl.TfsmPackageImpl#getAndClockConstraint()
	 * @generated
	 */
	int AND_CLOCK_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLOCK_CONSTRAINT__LEFT = BINARY_CLOCK_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLOCK_CONSTRAINT__RIGHT = BINARY_CLOCK_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>And Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLOCK_CONSTRAINT_FEATURE_COUNT = BINARY_CLOCK_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLOCK_CONSTRAINT_OPERATION_COUNT = BINARY_CLOCK_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.OrClockConstraintImpl <em>Or Clock Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.OrClockConstraintImpl
	 * @see tfsm.impl.TfsmPackageImpl#getOrClockConstraint()
	 * @generated
	 */
	int OR_CLOCK_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLOCK_CONSTRAINT__LEFT = BINARY_CLOCK_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLOCK_CONSTRAINT__RIGHT = BINARY_CLOCK_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Or Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLOCK_CONSTRAINT_FEATURE_COUNT = BINARY_CLOCK_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Clock Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLOCK_CONSTRAINT_OPERATION_COUNT = BINARY_CLOCK_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.FinalStateImpl
	 * @see tfsm.impl.TfsmPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 14;

	/**
	 * The feature id for the '<em><b>Stateguard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__STATEGUARD = STATE__STATEGUARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__FSM = STATE__FSM;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tfsm.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tfsm.impl.InitialStateImpl
	 * @see tfsm.impl.TfsmPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 15;

	/**
	 * The feature id for the '<em><b>Stateguard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__STATEGUARD = STATE__STATEGUARD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__FSM = STATE__FSM;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tfsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see tfsm.FSM
	 * @generated
	 */
	EClass getFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link tfsm.FSM#getClocks <em>Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clocks</em>'.
	 * @see tfsm.FSM#getClocks()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Clocks();

	/**
	 * Returns the meta object for the containment reference list '{@link tfsm.FSM#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see tfsm.FSM#getStates()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_States();

	/**
	 * Returns the meta object for the containment reference list '{@link tfsm.FSM#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see tfsm.FSM#getTransitions()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Transitions();

	/**
	 * Returns the meta object for the reference '{@link tfsm.FSM#getInitialstate <em>Initialstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialstate</em>'.
	 * @see tfsm.FSM#getInitialstate()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Initialstate();

	/**
	 * Returns the meta object for the attribute '{@link tfsm.FSM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tfsm.FSM#getName()
	 * @see #getFSM()
	 * @generated
	 */
	EAttribute getFSM_Name();

	/**
	 * Returns the meta object for class '{@link tfsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see tfsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link tfsm.State#getStateguard <em>Stateguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stateguard</em>'.
	 * @see tfsm.State#getStateguard()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Stateguard();

	/**
	 * Returns the meta object for the attribute '{@link tfsm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tfsm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the reference '{@link tfsm.State#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fsm</em>'.
	 * @see tfsm.State#getFsm()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Fsm();

	/**
	 * Returns the meta object for class '{@link tfsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see tfsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link tfsm.Transition#getClockresets <em>Clockresets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clockresets</em>'.
	 * @see tfsm.Transition#getClockresets()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Clockresets();

	/**
	 * Returns the meta object for the containment reference '{@link tfsm.Transition#getTransitionguard <em>Transitionguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transitionguard</em>'.
	 * @see tfsm.Transition#getTransitionguard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Transitionguard();

	/**
	 * Returns the meta object for the attribute '{@link tfsm.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see tfsm.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for class '{@link tfsm.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see tfsm.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link tfsm.Clock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tfsm.Clock#getName()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Name();

	/**
	 * Returns the meta object for the attribute '{@link tfsm.Clock#getTick <em>Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick</em>'.
	 * @see tfsm.Clock#getTick()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Tick();

	/**
	 * Returns the meta object for class '{@link tfsm.ClockConstraint <em>Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Constraint</em>'.
	 * @see tfsm.ClockConstraint
	 * @generated
	 */
	EClass getClockConstraint();

	/**
	 * Returns the meta object for the attribute '{@link tfsm.ClockConstraint#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see tfsm.ClockConstraint#getThreshold()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EAttribute getClockConstraint_Threshold();

	/**
	 * Returns the meta object for the reference '{@link tfsm.ClockConstraint#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see tfsm.ClockConstraint#getClock()
	 * @see #getClockConstraint()
	 * @generated
	 */
	EReference getClockConstraint_Clock();

	/**
	 * Returns the meta object for class '{@link tfsm.ClockReset <em>Clock Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Reset</em>'.
	 * @see tfsm.ClockReset
	 * @generated
	 */
	EClass getClockReset();

	/**
	 * Returns the meta object for the reference '{@link tfsm.ClockReset#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see tfsm.ClockReset#getClock()
	 * @see #getClockReset()
	 * @generated
	 */
	EReference getClockReset_Clock();

	/**
	 * Returns the meta object for class '{@link tfsm.LowerClockConstraint <em>Lower Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Clock Constraint</em>'.
	 * @see tfsm.LowerClockConstraint
	 * @generated
	 */
	EClass getLowerClockConstraint();

	/**
	 * Returns the meta object for class '{@link tfsm.LowerEqualClockConstraint <em>Lower Equal Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Equal Clock Constraint</em>'.
	 * @see tfsm.LowerEqualClockConstraint
	 * @generated
	 */
	EClass getLowerEqualClockConstraint();

	/**
	 * Returns the meta object for class '{@link tfsm.UpperClockConstraint <em>Upper Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Clock Constraint</em>'.
	 * @see tfsm.UpperClockConstraint
	 * @generated
	 */
	EClass getUpperClockConstraint();

	/**
	 * Returns the meta object for class '{@link tfsm.UpperEqualClockConstraint <em>Upper Equal Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Equal Clock Constraint</em>'.
	 * @see tfsm.UpperEqualClockConstraint
	 * @generated
	 */
	EClass getUpperEqualClockConstraint();

	/**
	 * Returns the meta object for class '{@link tfsm.ClockConstraintOperation <em>Clock Constraint Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Constraint Operation</em>'.
	 * @see tfsm.ClockConstraintOperation
	 * @generated
	 */
	EClass getClockConstraintOperation();

	/**
	 * Returns the meta object for class '{@link tfsm.AndClockConstraint <em>And Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Clock Constraint</em>'.
	 * @see tfsm.AndClockConstraint
	 * @generated
	 */
	EClass getAndClockConstraint();

	/**
	 * Returns the meta object for class '{@link tfsm.OrClockConstraint <em>Or Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Clock Constraint</em>'.
	 * @see tfsm.OrClockConstraint
	 * @generated
	 */
	EClass getOrClockConstraint();

	/**
	 * Returns the meta object for class '{@link tfsm.BinaryClockConstraint <em>Binary Clock Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Clock Constraint</em>'.
	 * @see tfsm.BinaryClockConstraint
	 * @generated
	 */
	EClass getBinaryClockConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link tfsm.BinaryClockConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see tfsm.BinaryClockConstraint#getLeft()
	 * @see #getBinaryClockConstraint()
	 * @generated
	 */
	EReference getBinaryClockConstraint_Left();

	/**
	 * Returns the meta object for the containment reference '{@link tfsm.BinaryClockConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see tfsm.BinaryClockConstraint#getRight()
	 * @see #getBinaryClockConstraint()
	 * @generated
	 */
	EReference getBinaryClockConstraint_Right();

	/**
	 * Returns the meta object for class '{@link tfsm.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see tfsm.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link tfsm.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see tfsm.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TfsmFactory getTfsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tfsm.impl.FSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.FSMImpl
		 * @see tfsm.impl.TfsmPackageImpl#getFSM()
		 * @generated
		 */
		EClass FSM = eINSTANCE.getFSM();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__CLOCKS = eINSTANCE.getFSM_Clocks();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__STATES = eINSTANCE.getFSM_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__TRANSITIONS = eINSTANCE.getFSM_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initialstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__INITIALSTATE = eINSTANCE.getFSM_Initialstate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM__NAME = eINSTANCE.getFSM_Name();

		/**
		 * The meta object literal for the '{@link tfsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.StateImpl
		 * @see tfsm.impl.TfsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Stateguard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATEGUARD = eINSTANCE.getState_Stateguard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Fsm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FSM = eINSTANCE.getState_Fsm();

		/**
		 * The meta object literal for the '{@link tfsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.TransitionImpl
		 * @see tfsm.impl.TfsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Clockresets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CLOCKRESETS = eINSTANCE.getTransition_Clockresets();

		/**
		 * The meta object literal for the '<em><b>Transitionguard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITIONGUARD = eINSTANCE.getTransition_Transitionguard();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '{@link tfsm.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.ClockImpl
		 * @see tfsm.impl.TfsmPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__NAME = eINSTANCE.getClock_Name();

		/**
		 * The meta object literal for the '<em><b>Tick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__TICK = eINSTANCE.getClock_Tick();

		/**
		 * The meta object literal for the '{@link tfsm.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.ClockConstraintImpl
		 * @see tfsm.impl.TfsmPackageImpl#getClockConstraint()
		 * @generated
		 */
		EClass CLOCK_CONSTRAINT = eINSTANCE.getClockConstraint();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_CONSTRAINT__THRESHOLD = eINSTANCE.getClockConstraint_Threshold();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_CONSTRAINT__CLOCK = eINSTANCE.getClockConstraint_Clock();

		/**
		 * The meta object literal for the '{@link tfsm.impl.ClockResetImpl <em>Clock Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.ClockResetImpl
		 * @see tfsm.impl.TfsmPackageImpl#getClockReset()
		 * @generated
		 */
		EClass CLOCK_RESET = eINSTANCE.getClockReset();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOCK_RESET__CLOCK = eINSTANCE.getClockReset_Clock();

		/**
		 * The meta object literal for the '{@link tfsm.impl.LowerClockConstraintImpl <em>Lower Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.LowerClockConstraintImpl
		 * @see tfsm.impl.TfsmPackageImpl#getLowerClockConstraint()
		 * @generated
		 */
		EClass LOWER_CLOCK_CONSTRAINT = eINSTANCE.getLowerClockConstraint();

		/**
		 * The meta object literal for the '{@link tfsm.impl.LowerEqualClockConstraintImpl <em>Lower Equal Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.LowerEqualClockConstraintImpl
		 * @see tfsm.impl.TfsmPackageImpl#getLowerEqualClockConstraint()
		 * @generated
		 */
		EClass LOWER_EQUAL_CLOCK_CONSTRAINT = eINSTANCE.getLowerEqualClockConstraint();

		/**
		 * The meta object literal for the '{@link tfsm.impl.UpperClockConstraintImpl <em>Upper Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.UpperClockConstraintImpl
		 * @see tfsm.impl.TfsmPackageImpl#getUpperClockConstraint()
		 * @generated
		 */
		EClass UPPER_CLOCK_CONSTRAINT = eINSTANCE.getUpperClockConstraint();

		/**
		 * The meta object literal for the '{@link tfsm.impl.UpperEqualClockConstraintImpl <em>Upper Equal Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.UpperEqualClockConstraintImpl
		 * @see tfsm.impl.TfsmPackageImpl#getUpperEqualClockConstraint()
		 * @generated
		 */
		EClass UPPER_EQUAL_CLOCK_CONSTRAINT = eINSTANCE.getUpperEqualClockConstraint();

		/**
		 * The meta object literal for the '{@link tfsm.impl.ClockConstraintOperationImpl <em>Clock Constraint Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.ClockConstraintOperationImpl
		 * @see tfsm.impl.TfsmPackageImpl#getClockConstraintOperation()
		 * @generated
		 */
		EClass CLOCK_CONSTRAINT_OPERATION = eINSTANCE.getClockConstraintOperation();

		/**
		 * The meta object literal for the '{@link tfsm.impl.AndClockConstraintImpl <em>And Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.AndClockConstraintImpl
		 * @see tfsm.impl.TfsmPackageImpl#getAndClockConstraint()
		 * @generated
		 */
		EClass AND_CLOCK_CONSTRAINT = eINSTANCE.getAndClockConstraint();

		/**
		 * The meta object literal for the '{@link tfsm.impl.OrClockConstraintImpl <em>Or Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.OrClockConstraintImpl
		 * @see tfsm.impl.TfsmPackageImpl#getOrClockConstraint()
		 * @generated
		 */
		EClass OR_CLOCK_CONSTRAINT = eINSTANCE.getOrClockConstraint();

		/**
		 * The meta object literal for the '{@link tfsm.impl.BinaryClockConstraintImpl <em>Binary Clock Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.BinaryClockConstraintImpl
		 * @see tfsm.impl.TfsmPackageImpl#getBinaryClockConstraint()
		 * @generated
		 */
		EClass BINARY_CLOCK_CONSTRAINT = eINSTANCE.getBinaryClockConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CLOCK_CONSTRAINT__LEFT = eINSTANCE.getBinaryClockConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CLOCK_CONSTRAINT__RIGHT = eINSTANCE.getBinaryClockConstraint_Right();

		/**
		 * The meta object literal for the '{@link tfsm.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.FinalStateImpl
		 * @see tfsm.impl.TfsmPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link tfsm.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tfsm.impl.InitialStateImpl
		 * @see tfsm.impl.TfsmPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

	}

} //TfsmPackage
