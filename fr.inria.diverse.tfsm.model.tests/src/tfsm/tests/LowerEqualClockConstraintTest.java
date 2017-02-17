/**
 */
package tfsm.tests;

import junit.textui.TestRunner;

import tfsm.LowerEqualClockConstraint;
import tfsm.TfsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lower Equal Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowerEqualClockConstraintTest extends ClockConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LowerEqualClockConstraintTest.class);
	}

	/**
	 * Constructs a new Lower Equal Clock Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerEqualClockConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lower Equal Clock Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LowerEqualClockConstraint getFixture() {
		return (LowerEqualClockConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TfsmFactory.eINSTANCE.createLowerEqualClockConstraint());
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

} //LowerEqualClockConstraintTest
