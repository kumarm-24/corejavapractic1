package net.konic.corejava.forloopExamples;

import java.util.Scanner;

public class PositiveOrNegitive {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number:");
		int Num = sc.nextInt();
		
		if (Num > 0) {
			
			System.out.println("Your Number is Positive.");
			
		}else {
			System.out.println("Your Number is Negitive.");
		}
	}

}
