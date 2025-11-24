package net.konic.corejava.switchbreackcontinue;

class ContinueNegitiveExample {
	public static void main(String[] args) {
		
		int[] numbers = {10, -5, 8, -2, 7};
		for (int num : numbers) {
			
			if (num < 0) {
				System.out.println(num);
			}
			
		}
	}

}
