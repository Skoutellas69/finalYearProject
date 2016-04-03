/**
 */
package finalYearName.tests;

import finalYearName.FinalYearNameFactory;
import finalYearName.SecurityObjective;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Objective</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityObjectiveTest extends TestCase {

	/**
	 * The fixture for this Security Objective test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityObjective fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityObjectiveTest.class);
	}

	/**
	 * Constructs a new Security Objective test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityObjectiveTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Objective test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityObjective fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Objective test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityObjective getFixture() {
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
		setFixture(FinalYearNameFactory.eINSTANCE.createSecurityObjective());
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

} //SecurityObjectiveTest
