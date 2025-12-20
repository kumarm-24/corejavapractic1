package net.konic.corejava.arrays;

public class LargeNumbers {
	    public static void main(String[] args) {
	        int[] arr = {45, 22, 89, 10};
	        int max = arr[0];

	        for (int n : arr) {
	            if (n > max) {
	                max = n;
	            }
	        }

	        System.out.println("Largest Number = " + max);
	    }
	}
