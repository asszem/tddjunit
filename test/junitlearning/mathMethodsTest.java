package junitlearning;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andras Olah (olahandras78@gmail.com)
 */
public class mathMethodsTest {
	
	public mathMethodsTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of addition method, of class mathMethods.
	 */
	@Test
	public void testAddition() {
		System.out.println("Teszteljük az összeadást! Csuhajja!");
		int[] inputValues = {1,1,2};
		int expResult = 4;
		int result = mathMethods.addition(inputValues);
		System.out.println("Ezt várnám: " +expResult);
		System.out.println("A függvény ezt adta válaszul: " + result);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
	}
	@Test
	public void testSubstraction(){
		System.out.println("Teszteljük a KIVONÁST!");
		int[] inputValues = {10,2,2};
		int expResult = 6;
		int result = mathMethods.substraction(inputValues);
		System.out.println("Ezt várnám: " +expResult);
		System.out.println("A függvény ezt adta válaszul: " + result);
		assertEquals(expResult, result);
//		fail("NEm stimmöl");
			
//This test case executes only if the previous one passes
		int[] inputBobe = {10,5};
		expResult = 5;
		result = mathMethods.substraction(inputBobe);
		System.out.println("Ezt várnám: " +expResult);
		System.out.println("A függvény ezt adta válaszul: " + result);
		assertEquals(expResult, result);
	}
	
}
