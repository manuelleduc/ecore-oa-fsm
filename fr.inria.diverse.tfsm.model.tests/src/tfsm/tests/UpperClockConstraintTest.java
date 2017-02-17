/**
 */
package tfsm.tests;

import junit.textui.TestRunner;

import tfsm.TfsmFactory;
import tfsm.UpperClockConstraint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Upper Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpperClockConstraintTest extends ClockConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpperClockConstraintTest.class);
	}

	/**
	 * Constructs a new Upper Clock Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperClockConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Upper Clock Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UpperClockConstraint getFixture() {
		return (UpperClockConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TfsmFactory.eINSTANCE.createUpperClockConstraint());
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

} //UpperClockConstraintTest
