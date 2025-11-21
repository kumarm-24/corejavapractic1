package net.konic.corejava.operators;


	import java.util.Scanner;

	public class PositiveNegativeCheck {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // IF Condition
	        if (num > 0) {
	            System.out.println("The number is Positive");
	        } 
	        else if (num < 0) {
	            System.out.println("The number is Negative");
	        }
	        else {
	            System.out.println("The number is Zero");
	        }

	    }
	}


