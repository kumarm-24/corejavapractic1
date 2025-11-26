package net.konic.corejava.methods;

public class Calculator1 {
	
	int add(int a, int b) {
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	public static void main(String[] args) {
		Calculator1 calcu = new Calculator1();
		calcu.add(33, 55);
		
		
	}

}
