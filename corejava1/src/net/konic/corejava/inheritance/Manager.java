package net.konic.corejava.inheritance;

public class Manager extends Employe {
	
	String department;
	
	public static void main(String[] args) {
		
		String name = "Kumar";
		int salary = 25000;
		String department = "IT";
		
		Manager m = new Manager();
		
		m.name= "Kumar";
		m.salary= 25000;
		m.department = "IT";
		
		System.out.println("Name :" + m.name);
		System.out.println("Salary :" + m.salary);
		System.out.println("department : " + m.department);
		 
	}

}
