package net.konic.corejava.arrays;

public class ArraysAvrage {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40};
	        int sum = 0;

	        for (int n : arr) {
	            sum += n;
	        }

	        int average = sum / arr.length;
	        System.out.println("Average = " + average);
	    }
	}

