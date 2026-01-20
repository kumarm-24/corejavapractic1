package net.konic.corejava.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListWithGenaricsDemo {
		 
	    public static void main(String[] args) {
	 
	        List<String> list = new ArrayList<>();
	 
	        list.add("kumar");
	        list.add("meera");
	       
	 
	        System.out.println("List with generics: " + list);
	 
	     
	        String name = list.get(0);
	        System.out.println("First name: " + name);
	    }
	}

