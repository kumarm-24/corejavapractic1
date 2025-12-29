package net.konic.corejava.map;

public class Employee {
	    private int id;
	    private String name;
	    private String department;

	    public Employee(int id, String name, String department) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return id + "-" + name + "-" + department;
	    }

		public void setDepartment(String newDept) {
			
		}

		public void setDepartment1(String newDept) {
			
		}
	}

