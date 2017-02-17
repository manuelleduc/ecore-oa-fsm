/**
 */
package tfsm.tests;

import junit.textui.TestRunner;

import tfsm.LowerClockConstraint;
import tfsm.TfsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lower Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowerClockConstraintTest extends ClockConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(LowerClockConstraintTest.class);
	}

	/**
	 * Constructs a new Lower Clock Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerClockConstraintTest(final String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lower Clock Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LowerClockConstraint getFixture() {
		return (LowerClockConstraint)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(TfsmFactory.eINSTANCE.createLowerClockConstraint());
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

} //LowerClockConstraintTest
