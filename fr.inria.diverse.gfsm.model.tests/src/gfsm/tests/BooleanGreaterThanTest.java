/**
 */
package gfsm.tests;

import gfsm.BooleanGreaterThan;
import gfsm.GfsmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Greater Than</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanGreaterThanTest extends BooleanCompareExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanGreaterThanTest.class);
	}

	/**
	 * Constructs a new Boolean Greater Than test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanGreaterThanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Greater Than test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanGreaterThan getFixture() {
		return (BooleanGreaterThan)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GfsmFactory.eINSTANCE.createBooleanGreaterThan());
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

} //BooleanGreaterThanTest
