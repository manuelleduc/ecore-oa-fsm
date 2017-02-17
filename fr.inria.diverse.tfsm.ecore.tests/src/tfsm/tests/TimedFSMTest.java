/**
 */
package tfsm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tfsm.TfsmFactory;
import tfsm.TimedFSM;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timed FSM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedFSMTest extends TestCase {

	/**
	 * The fixture for this Timed FSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedFSM fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(TimedFSMTest.class);
	}

	/**
	 * Constructs a new Timed FSM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedFSMTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timed FSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(final TimedFSM fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timed FSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedFSM getFixture() {
		return this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(TfsmFactory.eINSTANCE.createTimedFSM());
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

} //TimedFSMTest
