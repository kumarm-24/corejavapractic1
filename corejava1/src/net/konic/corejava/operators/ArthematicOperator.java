package net.konic.corejava.operators;

import java.util.Scanner;

public class ArthematicOperator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of a: ");
		int a = 	sc.nextInt();
		
		System.out.println("enter the valu of b:");
		int b = sc.nextInt();
		
		System.out.println("Additon (a + b) = " + (a+b));
		System.out.println("Substaction (a - b) = " + (a-b));
		System.out.println("Multipliction (a * b) =" + (a*b));
		System.out.println("Diviosn (a / b) = " + (a/b));
		System.out.println("Modules (a % b) = " + (a%b));
		
		sc.close();
	}

}
