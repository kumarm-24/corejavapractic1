package net.konic.corejava.inheritance;

public class Child extends Parent {
{
		
		System.out.println(	"parent class property method");
	}
	void display()
	{
		System.out.println("parent class display method");
	}

	public static void main(String[] args) {
		
		Parent p = new Parent();	
		p.display();
		p.property();
	}

}
