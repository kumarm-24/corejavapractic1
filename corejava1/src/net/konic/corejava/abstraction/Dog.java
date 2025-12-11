package net.konic.corejava.abstraction;

abstract class Animal {
	abstract void sound();
	
	void sleep() {
		System.out.println("Animal is Sleeping.....");
	}

}
public class Dog extends Animal {
	 
	 void sound() {
		 System.out.println("Dog is Barking......");
	 }
	
}

