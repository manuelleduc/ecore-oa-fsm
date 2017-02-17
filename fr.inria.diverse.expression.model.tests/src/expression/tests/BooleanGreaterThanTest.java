/**
 */
package expression.tests;

import expression.BooleanGreaterThan;
import expression.ExpressionFactory;

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
	public static void main(final String[] args) {
		TestRunner.run(BooleanGreaterThanTest.class);
	}

	/**
	 * Constructs a new Boolean Greater Than test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanGreaterThanTest(final String name) {
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
		return (BooleanGreaterThan)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(ExpressionFactory.eINSTANCE.createBooleanGreaterThan());
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

} //BooleanGreaterThanTest
