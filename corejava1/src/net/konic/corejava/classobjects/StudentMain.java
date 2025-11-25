package net.konic.corejava.classobjects;

public class StudentMain {
	 public static void main(String[] args) {

	        Student s = new Student();
	        s.name = "Kumar";
	        s.course = "BCA";
	        s.rollNo = 226464;

	        System.out.println("/---- STUDENT DETAILS ----/");
	        s.displayInfo();
	    }
	}


