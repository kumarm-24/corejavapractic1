package net.konic.corejava.abstraction;

public class Mainvechile {
	public static void main(String[] args) {
				
		System.out.println(                               );
		System.out.println( "---- Fortunare Vechile Info-----");
		System.out.println(                               );
		
		Car car = new Car();
		
		car.VechileName();
		car.VechileNumber();
		car.VechileColur();
		
		System.out.println(                               );
		System.out.println( "---- BMW Vechile Info-----");
		System.out.println(                               );

		
		BMW bmw = new BMW();
		
		bmw.VechileName();
		bmw.VechileNumber();
		bmw.tyreInfo();
		
		System.out.println(                               );
		System.out.println("---- Suzuki Vechile Info-----");
		System.out.println(                               );
		
		Suzuki suzuki = new Suzuki();
		
		suzuki.VechileName();
		suzuki.VechileNumber();
		suzuki.tyreInfo();
	}

}
