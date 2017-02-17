/**
 */
package gfsm.tests;

import gfsm.GInitialState;
import gfsm.GfsmFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GInitial State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GInitialStateTest extends GStateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(GInitialStateTest.class);
	}

	/**
	 * Constructs a new GInitial State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GInitialStateTest(final String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GInitial State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GInitialState getFixture() {
		return (GInitialState)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(GfsmFactory.eINSTANCE.createGInitialState());
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

} //GInitialStateTest
