/**
 */
package tfsm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tfsm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TfsmFactoryImpl extends EFactoryImpl implements TfsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TfsmFactory init() {
		try {
			TfsmFactory theTfsmFactory = (TfsmFactory)EPackage.Registry.INSTANCE.getEFactory(TfsmPackage.eNS_URI);
			if (theTfsmFactory != null) {
				return theTfsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TfsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TfsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TfsmPackage.FSM: return createFSM();
			case TfsmPackage.STATE: return createState();
			case TfsmPackage.TRANSITION: return createTransition();
			case TfsmPackage.CLOCK: return createClock();
			case TfsmPackage.CLOCK_RESET: return createClockReset();
			case TfsmPackage.LOWER_CLOCK_CONSTRAINT: return createLowerClockConstraint();
			case TfsmPackage.LOWER_EQUAL_CLOCK_CONSTRAINT: return createLowerEqualClockConstraint();
			case TfsmPackage.UPPER_CLOCK_CONSTRAINT: return createUpperClockConstraint();
			case TfsmPackage.UPPER_EQUAL_CLOCK_CONSTRAINT: return createUpperEqualClockConstraint();
			case TfsmPackage.AND_CLOCK_CONSTRAINT: return createAndClockConstraint();
			case TfsmPackage.OR_CLOCK_CONSTRAINT: return createOrClockConstraint();
			case TfsmPackage.FINAL_STATE: return createFinalState();
			case TfsmPackage.INITIAL_STATE: return createInitialState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM createFSM() {
		FSMImpl fsm = new FSMImpl();
		return fsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockReset createClockReset() {
		ClockResetImpl clockReset = new ClockResetImpl();
		return clockReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerClockConstraint createLowerClockConstraint() {
		LowerClockConstraintImpl lowerClockConstraint = new LowerClockConstraintImpl();
		return lowerClockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerEqualClockConstraint createLowerEqualClockConstraint() {
		LowerEqualClockConstraintImpl lowerEqualClockConstraint = new LowerEqualClockConstraintImpl();
		return lowerEqualClockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperClockConstraint createUpperClockConstraint() {
		UpperClockConstraintImpl upperClockConstraint = new UpperClockConstraintImpl();
		return upperClockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperEqualClockConstraint createUpperEqualClockConstraint() {
		UpperEqualClockConstraintImpl upperEqualClockConstraint = new UpperEqualClockConstraintImpl();
		return upperEqualClockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndClockConstraint createAndClockConstraint() {
		AndClockConstraintImpl andClockConstraint = new AndClockConstraintImpl();
		return andClockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrClockConstraint createOrClockConstraint() {
		OrClockConstraintImpl orClockConstraint = new OrClockConstraintImpl();
		return orClockConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TfsmPackage getTfsmPackage() {
		return (TfsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TfsmPackage getPackage() {
		return TfsmPackage.eINSTANCE;
	}

} //TfsmFactoryImpl
