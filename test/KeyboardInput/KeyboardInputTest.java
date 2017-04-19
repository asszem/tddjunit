/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeyboardInput;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author András
 */
public class KeyboardInputTest {

	public KeyboardInputTest() {
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
	 * Test works with standard english characters only
	 */
	@Test
	public void testReplacingSystemIn() throws UnsupportedEncodingException {
		System.out.println("**testReplacingSystemIn**");
		//Prepare test string
		String testCharset = Charset.defaultCharset().name();
		String testInput = "English Only - áááééőőúúóóüüööíí";
		System.out.println("The expected string: " + testInput);

		//Create a ByteArray for inputStream
		byte[] stringConvertedToByteArray = testInput.getBytes(testCharset);
		ByteArrayInputStream byteAIS = new ByteArrayInputStream(stringConvertedToByteArray); // this will be the new System in

		//replacing System.in
		System.setIn(byteAIS);

		//Get the input
		KeyboardInput testInstance = new KeyboardInput();
		testInstance.charset=testCharset;
		String actInput = testInstance.getInputWithScanner();

		//reset the SystemIN
		System.setIn(System.in);

		//Do the test
		assertEquals(testInput, actInput);
	}

	@Test
	public void testGetInputWithParameters() throws UnsupportedEncodingException, IOException {
		System.out.println("**testGetInputWithParameters**");
		//prepare test string
		String expString = "English only ÁRVÍZTŰRŐ TÜKÖRFÚRÓGÉP";
		System.out.println("The expected string: " + expString);
		//create object
		KeyboardInput instance = new KeyboardInput();

		//Prepare ByteArrayInputStream as the input parameter for InputStream
		ByteArrayInputStream testInputStream = new ByteArrayInputStream(expString.getBytes(instance.setCharset("UTF-8").charset));

		//Call the method with the mock inputstream
		String actString = instance.getInputWithParameters(testInputStream,  System.out);
		assertEquals(expString, actString);
	}
}
