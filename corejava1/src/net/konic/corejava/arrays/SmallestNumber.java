package net.konic.corejava.arrays;

public class SmallestNumber {
	    public static void main(String[] args) {
	        int[] arr = {45, 22, 89, 10};
	        int min = arr[0];

	        for (int n : arr) {
	            if (n < min) {
	                min = n;
	            }
	        }

	        System.out.println("Smallest Number = " + min);
	    }
	}
