/**
 */
package tfsm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tfsm.TfsmFactory;
import tfsm.TimedState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timed State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedStateTest extends TestCase {

	/**
	 * The fixture for this Timed State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedState fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(TimedStateTest.class);
	}

	/**
	 * Constructs a new Timed State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStateTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Timed State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(final TimedState fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Timed State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedState getFixture() {
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
		this.setFixture(TfsmFactory.eINSTANCE.createTimedState());
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

} //TimedStateTest
