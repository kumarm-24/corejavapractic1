package net.konic.corejava.collection;

import java.util.LinkedList;
import java.util.List;

public class ListWithoutGenericsDemo {
		 
	    public static void main(String[] args) {
	 
	    	List list=new LinkedList();
	    	list.add(1);
	    	list.add("syed");
	    	list.add(2.8);
	    	list.add("syed");
	    	list.add(null);
	    	System.out.println("data "+list);
	    	
	    	List<Integer> list2=new LinkedList();
	    	list2.add(1122);	
	      	
	    	
	    }
	}
