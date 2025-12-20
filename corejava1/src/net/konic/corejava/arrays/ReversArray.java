package net.konic.corejava.arrays;

public class ReversArray {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4};

	        System.out.print("Reversed Array: ");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}
