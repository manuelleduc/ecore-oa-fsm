/**
 */
package expression.tests;

import expression.BooleanEqual;
import expression.ExpressionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Equal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanEqualTest extends BooleanCompareExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(BooleanEqualTest.class);
	}

	/**
	 * Constructs a new Boolean Equal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanEqualTest(final String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Equal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanEqual getFixture() {
		return (BooleanEqual)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(ExpressionFactory.eINSTANCE.createBooleanEqual());
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

} //BooleanEqualTest
