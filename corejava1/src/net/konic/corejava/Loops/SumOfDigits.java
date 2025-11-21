package net.konic.corejava.Loops;

	import java.util.Scanner;

	public class SumOfDigits {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int sum = 0;      // to store total
	        int digit;        // to store each digit

	        while (num > 0) {
	            digit = num % 10;   // get last digit
	            sum = sum + digit;  // add to sum
	            num = num / 10;     // remove last digit
	        }

	        System.out.println("Sum of digits = " + sum);
	    }
	}


