package net.konic.corejava.exceptions;

	public class ThrowsFinallyExample {

	    public static void main(String[] args) throws ArithmeticException {

	        try {
	            int a = 10;
	            int b = 0;
	            System.out.println(a / b);
	        } finally {
	            System.out.println("Finally block executed");
	        }
	    }
	}
