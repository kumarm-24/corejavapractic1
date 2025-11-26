package net.konic.corejava.methods;

public class Multiplication {
	
	int Multipliction(int x, int y) {
		int z = x*y;
		System.out.println(z);
		return z;
	}
	public static void main(String[] args) {
		
		Multiplication mul = new Multiplication();
		mul.Multipliction(2, 4);
	}

}
