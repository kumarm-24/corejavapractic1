package net.konic.corejava.map;

	import java.util.HashMap;
	import java.util.Map;

	public class RemoveEmployeMaion {

	    public static Map<Integer, Employee> addEmployees() {
	        Map<Integer, Employee> empMap = new HashMap<>();

	        empMap.put(101, new Employee(101, "Ayaan", "IT"));
	        empMap.put(102, new Employee(102, "Rahim", "HR"));
	        empMap.put(103, new Employee(103, "Sara", "Finance"));

	        return empMap;
	    }

	    public static Map<Integer, Employee> removeEmployeeById(int empId) {
	        Map<Integer, Employee> empMap = addEmployees();
	        empMap.remove(empId);
	        return empMap;
	    }

	    public static void main(String[] args) {
	        int empId = 101;
	        Map<Integer, Employee> remainingEmployees = removeEmployeeById(empId);

	        System.out.println("Remaining Employees: " + remainingEmployees);
	    }
	}


