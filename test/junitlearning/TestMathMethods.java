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
public class TestMathMethods {

	int testNumbers; //Generate this many test numbers for a given test object

	public TestMathMethods() {

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
	 * Test of addition method, of class MathMethods.
	 */
	@Test
	public void testAddition() {
		System.out.println("Addition test case 1");
		int[] inputValues = {1, 1, 2};
		int expResult = 4;
		int result = MathMethods.addition(inputValues);
		System.out.println("Expected result: \t" + expResult);
		System.out.println("Actual result:\t\t" + result);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
	}

	@Test
	public void testSubstraction() {
		System.out.println("Substraction test with 5 random numbers");
		TestMathMethods substractionTest = new TestMathMethods();
		substractionTest.testNumbers = 5;
		int[] inputValues = new int[substractionTest.testNumbers];
		System.out.printf("Running %d test cases%n", substractionTest.testNumbers);
		//Run testNumber test cases
		for (int testCase = 0; testCase < substractionTest.testNumbers; testCase++) {
			System.out.println("Test case " + testCase);
			//Generate testNumber random test numbers
			int expResult = 0;
			System.out.println("Test numbers:");
			for (int randomIndex = 0; randomIndex < substractionTest.testNumbers; randomIndex++) {
				inputValues[randomIndex] = (int) (1 + Math.random() * 100);
				System.out.print(inputValues[randomIndex]);
				if (randomIndex < substractionTest.testNumbers - 1) {
					System.out.print("-");
				}
				if (randomIndex == 0) {
					expResult = inputValues[randomIndex];
				} else {
					expResult -= inputValues[randomIndex];
				}
			}
			System.out.println("=\t\t" + expResult);
			System.out.println("Method results:\t\t" + MathMethods.substraction(inputValues));
			System.out.println("");
			int result = MathMethods.substraction(inputValues);
			assertEquals(expResult, result, 0.0);
		}
	}

	/**
	 * Test of division method, of class MathMethods.
	 */
	@Test
	public void testDivision() {
		System.out.println("division");
		int[] inputValues = new int[2];
		double expResult;
		double result;
		
		inputValues[0]=10;
		inputValues[1]=10;
		expResult=1.0;
		result = MathMethods.division(inputValues);
		assertEquals(expResult, result, 0.0);

		inputValues[0]=5;
		inputValues[1]=10;
		expResult=0.5;
		result = MathMethods.division(inputValues);
		assertEquals(expResult, result, 0.0);

		//TODO test division by zero
		//inputValues[0]=10;
		//inputValues[1]=0;
		//expResult=1.0;
		//result = MathMethods.division(inputValues);
		//assertEquals(expResult, result, 0.0);
	}

	/**
	 * Test of multiplication method, of class MathMethods.
	 */
	@Test
	public void testMultiplication() {
		System.out.println("multiplication");
		int[] inputValues = {5, 5};
		double expResult = 25.0;
		double result = MathMethods.multiplication(inputValues);
		assertEquals(expResult, result, 0.0);
	}

}
