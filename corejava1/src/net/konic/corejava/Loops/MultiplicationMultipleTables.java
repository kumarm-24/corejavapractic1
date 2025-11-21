package net.konic.corejava.Loops;

	import java.util.Scanner;

	public class MultiplicationMultipleTables {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("ENTER TABLE NUMBER 1 : ");
	        int num1 = sc.nextInt();
	        
	        System.out.println("ENTER TABLE NUMBER 2 :");
	        int num2 = sc.nextInt();
	        
	        System.out.println("ENTER TABLE NUMBER 3 : ");
	        int num3 = sc.nextInt();
	        
	        for (int i=1; i<=10; i++) {
	            System.out.println(num1 + " x " + i + " = " + (num1 * i));
	        }
	        
	        for (int i=1; i<=10; i++) {
	            System.out.println(num2 + " x " + i + " = " + (num2 * i));
	        }

	        for (int i=1; i<=10; i++) {      
	            System.out.println(num3 + " x " + i + " = " + (num3 * i));
	        }
	    }
	}


