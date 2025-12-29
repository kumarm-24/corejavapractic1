package net.konic.corejava.map;

public class UpdateEmployee {

	    private int id;
	    private String name;
	    private String department;

	    public void Employee(int id, String name, String department) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	    }

	    // setter to update department
	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return id + "-" + name + "-" + department;
	    }
	}

