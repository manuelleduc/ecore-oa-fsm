/**
 */
package tfsm.tests;

import junit.textui.TestRunner;

import tfsm.TfsmFactory;
import tfsm.UpperEqualClockConstraint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Upper Equal Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpperEqualClockConstraintTest extends ClockConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(UpperEqualClockConstraintTest.class);
	}

	/**
	 * Constructs a new Upper Equal Clock Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperEqualClockConstraintTest(final String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Upper Equal Clock Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UpperEqualClockConstraint getFixture() {
		return (UpperEqualClockConstraint)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(TfsmFactory.eINSTANCE.createUpperEqualClockConstraint());
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

} //UpperEqualClockConstraintTest
