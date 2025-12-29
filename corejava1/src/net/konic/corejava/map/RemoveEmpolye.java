package net.konic.corejava.map;

public class RemoveEmpolye {
	    int id;
	    String name;
	    String dept;

	    public RemoveEmpolye(int id, String name, String dept) {
	        this.id = id;
	        this.name = name;
	        this.dept = dept;
	    }

	    @Override
	    public String toString() {
	        return id + "-" + name + "-" + dept;
	    }
	}


