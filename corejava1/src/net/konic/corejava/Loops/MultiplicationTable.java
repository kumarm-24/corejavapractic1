package net.konic.corejava.Loops;

	import java.util.Scanner;

	public class MultiplicationTable {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // FOR Loop for multiplication table
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }

	    }
	}


