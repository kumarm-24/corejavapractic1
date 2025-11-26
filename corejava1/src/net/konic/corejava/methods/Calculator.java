package net.konic.corejava.methods;

public class Calculator {
	
	int add(int x , int y ) {
		int z= x+y;
		System.out.println(z);
		return z;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(5, 7);
	}

}
