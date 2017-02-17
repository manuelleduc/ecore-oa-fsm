/**
 */
package expression.tests;

import expression.ExpressionFactory;
import expression.IntVarAssign;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Int Var Assign</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntVarAssignTest extends IntOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntVarAssignTest.class);
	}

	/**
	 * Constructs a new Int Var Assign test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVarAssignTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Int Var Assign test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntVarAssign getFixture() {
		return (IntVarAssign)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExpressionFactory.eINSTANCE.createIntVarAssign());
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

} //IntVarAssignTest
