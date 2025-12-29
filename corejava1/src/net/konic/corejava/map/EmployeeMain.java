package net.konic.corejava.map;

import java.util.HashMap;
	import java.util.Map;

	public class EmployeeMain {

	    public static Map<Integer, Employee> addEmployees() {

	        Map<Integer, Employee> empMap = new HashMap<>();

	        empMap.put(101, new Employee(101, "Ayaan", "IT"));
	        empMap.put(102, new Employee(102, "Rahim", "HR"));
	        empMap.put(103, new Employee(103, "Sara", "Finance"));

	        return empMap;
	    }

	    public static void main(String[] args) {

	        Map<Integer, Employee> employees = addEmployees();
	        System.out.println(employees);
	    }
	}

