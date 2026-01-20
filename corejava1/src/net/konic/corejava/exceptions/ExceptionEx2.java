package net.konic.corejava.exceptions;

public class ExceptionEx2 {
	public static void main(String[] args) {
		
		int a = 11 ;
		int b = 0;
		
		try {
			int result = a/b;
			System.out.println("Result : " + result);
			
		}catch(ArithmeticException e) {
			System.out.println("Error : cannont be divided");
		}finally {
			System.out.println("Finaly block Excuted");
		}
		System.out.println("program continues normally");
	}

}
