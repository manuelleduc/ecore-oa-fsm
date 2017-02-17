/**
 */
package tfsm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tfsm.ClockReset;
import tfsm.TfsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clock Reset</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClockResetTest extends TestCase {

	/**
	 * The fixture for this Clock Reset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockReset fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClockResetTest.class);
	}

	/**
	 * Constructs a new Clock Reset test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockResetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Clock Reset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ClockReset fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Clock Reset test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockReset getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TfsmFactory.eINSTANCE.createClockReset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ClockResetTest
