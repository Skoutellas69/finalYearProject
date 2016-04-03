/**
 */
package finalYearName.tests;

import finalYearName.FinalYearNameFactory;
import finalYearName.SecurityMechanism;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityMechanismTest extends TestCase {

	/**
	 * The fixture for this Security Mechanism test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityMechanism fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityMechanismTest.class);
	}

	/**
	 * Constructs a new Security Mechanism test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityMechanismTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Mechanism test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityMechanism fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Mechanism test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityMechanism getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FinalYearNameFactory.eINSTANCE.createSecurityMechanism());
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

} //SecurityMechanismTest
