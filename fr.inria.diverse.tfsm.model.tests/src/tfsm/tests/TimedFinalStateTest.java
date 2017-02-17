/**
 */
package tfsm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tfsm.TfsmFactory;
import tfsm.TimedFinalState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timed Final State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedFinalStateTest extends TestCase {

	/**
	 * The fixture for this Timed Final State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedFinalState fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(TimedFinalStateTest.class);
	}

	/**
	 * Constructs a new Timed Final State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedFinalStateTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timed Final State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(final TimedFinalState fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timed Final State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedFinalState getFixture() {
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
		this.setFixture(TfsmFactory.eINSTANCE.createTimedFinalState());
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

} //TimedFinalStateTest
