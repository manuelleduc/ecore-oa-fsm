/**
 */
package gfsm.tests;

import gfsm.GTransition;
import gfsm.GfsmFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GTransition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GTransitionTest extends TestCase {

	/**
	 * The fixture for this GTransition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTransition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(GTransitionTest.class);
	}

	/**
	 * Constructs a new GTransition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTransitionTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this GTransition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(final GTransition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this GTransition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GTransition getFixture() {
		return this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		this.setFixture(GfsmFactory.eINSTANCE.createGTransition());
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

} //GTransitionTest
