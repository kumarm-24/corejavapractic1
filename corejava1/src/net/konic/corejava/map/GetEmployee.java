package net.konic.corejava.map;

public class GetEmployee {

	    private int id;
	    private String name;
	    private String department;

	    public GetEmployee(int id, String name, String department) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return id + "-" + name + "-" + department;
	    }
	}

