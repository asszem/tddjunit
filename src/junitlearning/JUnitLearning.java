package junitlearning;
public class JUnitLearning {
    public static void main(String[] args) throws divideByZeroException{
		System.out.println("Production testing");
		System.out.println("5+5=" + MathMethods.addition(5,5));        
		System.out.println("5-5=" + MathMethods.substraction(5,5));        
//		System.out.println("5/0=" + MathMethods.division(5,0));        
		System.out.println("5/0=" + MathMethods.divisionNoException(5,0));        
		System.out.println("5*5=" + MathMethods.multiplication(5,5));        
    }

}
