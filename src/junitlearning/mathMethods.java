package junitlearning;

/**
 *
 * @author Andras Olah (olahandras78@gmail.com)
 */
public class mathMethods {

	public static int addition(int... inputValues) {
		int result = 0;
		for (int currentValue : inputValues) {
			result += currentValue;
		}
		return result;
	}

	public static int substraction(int... inputValues) {
		int result = inputValues[0]; //start with the first value
		for (int i = 1; i < inputValues.length; i++) { //start with the second item and walk throu all
			result -= inputValues[i];
		}
		return result;
	}
}
