package net.konic.corejava.exceptions;

public class ArthematicEx1 {
	public static void main(String[] args) {
		
		int a = 25;
		int b = 5;
		
		try {
			int result = a/b;
			System.out.println("Results : " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("Error : cannont be divided");
			
		}
		System.out.println("program continues normally");
		
	}

}
