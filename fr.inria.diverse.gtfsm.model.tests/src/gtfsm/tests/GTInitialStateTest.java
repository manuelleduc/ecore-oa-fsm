/**
 */
package gtfsm.tests;

import gtfsm.GTInitialState;
import gtfsm.GtfsmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GT Initial State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GTInitialStateTest extends GTStateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GTInitialStateTest.class);
	}

	/**
	 * Constructs a new GT Initial State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTInitialStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GT Initial State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GTInitialState getFixture() {
		return (GTInitialState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GtfsmFactory.eINSTANCE.createGTInitialState());
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

} //GTInitialStateTest
