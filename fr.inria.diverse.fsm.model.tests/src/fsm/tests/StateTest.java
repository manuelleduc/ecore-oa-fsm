/**
 */
package fsm.tests;

import fsm.FsmFactory;
import fsm.State;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateTest extends TestCase {

	/**
	 * The fixture for this State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(StateTest.class);
	}

	/**
	 * Constructs a new State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(final State fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected State getFixture() {
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
		this.setFixture(FsmFactory.eINSTANCE.createState());
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

} //StateTest
