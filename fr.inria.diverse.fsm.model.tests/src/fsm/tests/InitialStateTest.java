/**
 */
package fsm.tests;

import fsm.FsmFactory;
import fsm.InitialState;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitialStateTest extends StateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(InitialStateTest.class);
	}

	/**
	 * Constructs a new Initial State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialStateTest(final String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initial State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InitialState getFixture() {
		return (InitialState)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(FsmFactory.eINSTANCE.createInitialState());
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

} //InitialStateTest
