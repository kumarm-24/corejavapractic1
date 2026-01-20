package net.konic.corejava.exceptions;

public class FinallyBlockEx2 {
	public static void main(String[] args) {
		
		int a= 15;
		int b= 0;
		
		try {
			int result = a/b;
			System.out.println("Result : " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("Error : connot be divided");
			
		}finally {
			System.out.println("Exit");
			
		}
	}

}
