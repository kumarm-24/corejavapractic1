package net.konic.corejava.exceptions;


	public class TryCatchThrowsExample {

	    static void divide(int a, int b) throws ArithmeticException {

	        try {
	            int result = a / b;
	            System.out.println("Result: " + result);

	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero");
	            throw e; 
	        }
	    }

	    public static void main(String[] args) {

	        try {
	            divide(10, 0); 

	        } catch (ArithmeticException e) {
	            System.out.println("Exception handled in main method");
	        }

	        System.out.println("Program continues normally");
	    }
	}
