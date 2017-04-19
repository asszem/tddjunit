/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeyboardInput;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Scanner;

/**
 *
 * @author András
 */
public class KeyboardInput {

	String charset = Charset.defaultCharset().toString();

	/**
	 * Using a Scanner to get input using the charset field of the object
	 *
	 * @return a string
	 */
	public String getInputWithScanner() {
		System.out.println("getInputWithScanner. Charset: " + charset);
		System.out.print("Enter something:");
		Scanner sc = new Scanner(System.in, charset);
		String inputString = sc.nextLine();
		System.out.println("The input was:" + inputString);
		return inputString;
	}

	//method to set Charset. Returns a reference to itself so it can be chained
	public KeyboardInput setCharset(String newCharset) {
		this.charset = newCharset;
		return this;
	}

	/**
	 * Reads a line from the provided InputStream
	 * 
	 * @param inputStream System.in for console input, ByteArrayInputStream for Junit mock input
	 * @param outputStream System.out for console
	 * @return a String that was provided to the inputStream
	 */
	public String getInputWithParameters(InputStream inputStream, OutputStream outputStream) {
		System.out.println("getInputWithParameters. Charset: " + charset);
		System.out.print("Enter something:");
		Scanner sc = new Scanner(inputStream, charset);
		String result = sc.nextLine();
		//cast the outputStream to a PrintStream so that it can be displayed to the console
		PrintStream printStream=(PrintStream) outputStream;
		printStream.println("The input was:" + result); //use the provided output instead of System.out
		return result;
	}

	public static void main(String[] args) {
		KeyboardInput instance = new KeyboardInput();
		instance.getInputWithParameters(System.in, System.out);
//		instance.getInputWithScanner();
//		instance.setCharset("Windows-1250").getInputWithScanner();
//		instance.setCharset("ISO8859_1").getInputWithScanner();
//		instance.setCharset("latin1").getInputWithScanner();

	}
}
