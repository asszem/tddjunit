
package junitlearning;

/**
 * 
 * @author Andras Olah (olahandras78@gmail.com)
 */
public class divideByZeroException extends Exception{

	public divideByZeroException() {
	}
	public divideByZeroException(String message){
		System.out.println(message);
	}
}
