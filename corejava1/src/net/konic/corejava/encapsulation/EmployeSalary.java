package net.konic.corejava.encapsulation;
//Q3. Employee Salary Protection
//
//Question:
//Create an Employee class with private salary.
//Salary must be greater than 0.
//
//Input:
//
//Enter Salary: 45000
//
//Output:
//
//Employee Salary: 45000


public class EmployeSalary {
	private int Salary;

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		if (Salary <=0 ) {
			this.Salary = salary;
			
		}
		else {
			System.out.println("Invalide Salary");
		}
	}
	public static void main(String[] args) {
		
		EmployeSalary employe = new EmployeSalary();
		
		employe.setSalary(45000);
		int Salary = employe.getSalary();
		System.out.println("Employe Salary : " + Salary);
	}
}
