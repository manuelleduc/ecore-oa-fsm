/**
 */
package tfsm.tests;

import junit.textui.TestRunner;

import tfsm.TfsmFactory;
import tfsm.TimedInitialState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timed Initial State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedInitialStateTest extends TimedStateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(TimedInitialStateTest.class);
	}

	/**
	 * Constructs a new Timed Initial State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedInitialStateTest(final String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timed Initial State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimedInitialState getFixture() {
		return (TimedInitialState)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(TfsmFactory.eINSTANCE.createTimedInitialState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		this.setFixture(null);
	}

} //TimedInitialStateTest
