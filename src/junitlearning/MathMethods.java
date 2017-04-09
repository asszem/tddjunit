package junitlearning;

/**
 *
 * @author Andras Olah (olahandras78@gmail.com)
 */
public class MathMethods {

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

	public static double division(int... inputValues) throws divideByZeroException {
		double result = (double) inputValues[0];
		for (int i = 1; i < inputValues.length; i++) {
			if (inputValues[i] == 0) {
				throw new divideByZeroException("Error! Divided by zero!");
			}
			result /= inputValues[i];
		}
		return result;
	}

	public static double divisionNoException(int... inputValues) {
		double result = (double) inputValues[0];
		try {
			for (int i = 1; i < inputValues.length; i++) {
				if (inputValues[i] == 0) {
					throw new divideByZeroException("Error! Divided by zero!");
				}
				result /= inputValues[i];
			}
		} catch (divideByZeroException e) {
			return (double) inputValues[0];
		}
		return result;
	}

	public static double multiplication(int... inputValues) {
		double result = (double) inputValues[0];
		for (int i = 1; i < inputValues.length; i++) {
			result *= inputValues[i];
		}
		return result;
	}
}
