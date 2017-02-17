/**
 */
package tfsm.tests;

import junit.textui.TestRunner;

import tfsm.AndClockConstraint;
import tfsm.TfsmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>And Clock Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndClockConstraintTest extends BinaryClockConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(AndClockConstraintTest.class);
	}

	/**
	 * Constructs a new And Clock Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndClockConstraintTest(final String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this And Clock Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AndClockConstraint getFixture() {
		return (AndClockConstraint)this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(TfsmFactory.eINSTANCE.createAndClockConstraint());
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

} //AndClockConstraintTest
