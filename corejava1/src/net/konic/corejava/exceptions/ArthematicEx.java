package net.konic.corejava.exceptions;

public class ArthematicEx {
	public static void main(String[] args) {
		
		int a = 20;
		int b = 6;
		
		try {
			int results = a/b;
			System.out.println("Results : " + results);
			
		} catch (ArithmeticException e) {
			 System.out.println("Error : cannot be devided");
		}
		System.out.println("Program continues Normally");
 
	}

}
