/**
 */
package gfsm.tests;

import gfsm.GFSM;
import gfsm.GfsmFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GFSM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GFSMTest extends TestCase {

	/**
	 * The fixture for this GFSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFSM fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(GFSMTest.class);
	}

	/**
	 * Constructs a new GFSM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GFSMTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this GFSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(final GFSM fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this GFSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFSM getFixture() {
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
		this.setFixture(GfsmFactory.eINSTANCE.createGFSM());
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

} //GFSMTest
