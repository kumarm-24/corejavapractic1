package net.konic.corejava.methods;

	import java.util.Scanner;

	class Calculators {

	    static int add(int a, int b ) {
	        return a + b;
	    }

	    static int subtract(int a, int b) {
	        return a - b;
	    }

	    static int multiply(int a, int b) {
	        return a * b;
	    }

	    static double divide(int a, int b) {
	        return (double) a / b;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number A B: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number A C: ");
	        int num2 = sc.nextInt();
	        
	        System.out.print("Enter third number B C: ");
	        int num3 = sc.nextInt();

	        // A B operations
	        System.out.println("=== A & B Operations ===");
	        System.out.println("Addition: " + add(num1, num2));
	        System.out.println("Subtraction: " + subtract(num1, num2));
	        System.out.println("Multiplication: " + multiply(num1, num2));
	        if (num2 != 0)
	            System.out.println("Division: " + divide(num1, num2));

	        // A C operations
	        System.out.println("\n=== A & C Operations ===");
	        System.out.println("Addition: " + add(num1, num3));
	        System.out.println("Subtraction: " + subtract(num1, num3));
	        System.out.println("Multiplication: " + multiply(num1, num3));
	        if (num3 != 0)
	            System.out.println("Division: " + divide(num1, num3));

	        // B C operations
	        System.out.println("\n=== B & C Operations ===");
	        System.out.println("Addition: " + add(num2, num3));
	        System.out.println("Subtraction: " + subtract(num2, num3));
	        System.out.println("Multiplication: " + multiply(num2, num3));
	        if (num3 != 0)
	            System.out.println("Division: " + divide(num2, num3));

	        sc.close();
	    }
	}



