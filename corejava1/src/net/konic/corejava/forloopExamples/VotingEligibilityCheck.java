package net.konic.corejava.forloopExamples;

import java.util.Scanner;

public class VotingEligibilityCheck {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your age:");
	int age = sc.nextInt();
		
   if (age <18 ) {
	   System.out.println("Your age is eligible vote");
	   
   }else {
	   System.out.println("Your age is not eligibel vote");
   }
}

}