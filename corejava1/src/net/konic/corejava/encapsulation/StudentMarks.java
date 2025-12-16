package net.konic.corejava.encapsulation;

public class StudentMarks {
		private int Marks;

		public int getMarks() {
			return Marks;
		}

		public void setMarks(int marks) {
			if (Marks >=100) {
				Marks = marks;
			}
			else {
				System.out.println("Invalid Marks");
			}
		}
		
		public static void main(String[] args) {
			
			StudentMarks student = new StudentMarks();
			
			student.setMarks(120);
			int Marks = student.getMarks();
			System.out.println("Student Marks : " + Marks);
		}
		
	}

	

