/**
 */
package gfsm.tests;

import gfsm.GfsmFactory;
import gfsm.IntVarRef;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Int Var Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntVarRefTest extends IntExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntVarRefTest.class);
	}

	/**
	 * Constructs a new Int Var Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVarRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Int Var Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntVarRef getFixture() {
		return (IntVarRef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GfsmFactory.eINSTANCE.createIntVarRef());
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

} //IntVarRefTest
