package net.konic.corejava.encapsulation;

//Q7. Student Age Validation
//
//Question:
//Create a StudentProfile class with private age.
//Age must be between 5 and 100.
//
//Input:
//
//Enter Age: 3
//
//Output:
//
//Invalid age

public class StudentProfile {
	private int Age;

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		if (Age >=5 && Age<=100) {
		this.Age = Age;
		System.out.println("Age set to : " + Age);
	}
		else {
			System.out.println("Invalid Age");
			
		}
	}
	public static void main(String[] args) {
		
		StudentProfile student = new StudentProfile();
		
		student.setAge(3);
		student.setAge(44);
		
	}
}
