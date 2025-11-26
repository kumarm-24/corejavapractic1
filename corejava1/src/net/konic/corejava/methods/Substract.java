package net.konic.corejava.methods;

public class Substract {
	
	int substract(int x, int y) {
		int z= x-y;
		System.out.println(z);
		return z;
		
	}
	public static void main(String[] args) {
		Substract sub = new Substract();
		sub.substract(22, 12); 
	}

}
