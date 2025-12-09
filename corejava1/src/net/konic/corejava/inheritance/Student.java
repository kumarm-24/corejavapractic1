package net.konic.corejava.inheritance;

public class Student extends Person {
	int rollnum;
	
	void det(int z) {
		System.out.println("rollnum: "+z);
	}
	
public static void main(String[] args) {  
		
	Student student = new Student();	
		student.display("Rahul");
		student.display(20);
		student.det(101);

	

  }
}