/**
 */
package gfsm.tests;

import gfsm.GFinalState;
import gfsm.GfsmFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GFinal State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GFinalStateTest extends GStateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(GFinalStateTest.class);
	}

	/**
	 * Constructs a new GFinal State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GFinalStateTest(final String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GFinal State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GFinalState getFixture() {
		return (GFinalState)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(GfsmFactory.eINSTANCE.createGFinalState());
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

} //GFinalStateTest
