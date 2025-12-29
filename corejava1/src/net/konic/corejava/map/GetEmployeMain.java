package net.konic.corejava.map;

	import java.util.HashMap;
	import java.util.Map;

	public class GetEmployeMain {

	    public static Map<Integer, Employee> addEmployees() {

	        Map<Integer, Employee> empMap = new HashMap<>();

	        empMap.put(101, new Employee(101, "Ayaan", "IT"));
	        empMap.put(102, new Employee(102, "Rahim", "HR"));
	        empMap.put(103, new Employee(103, "Sara", "Finance"));

	        return empMap;
	    }

	    public static Employee getEmployeeById(Map<Integer, Employee> map, int id) {
	        return map.get(id);
	    }

	    public static void main(String[] args) {

	        Map<Integer, Employee> employees = addEmployees();

	        int searchId = 102;

	        Employee emp = getEmployeeById(employees, searchId);

	        if (emp != null) {
	            System.out.println("Employee Found: " + emp);
	        } else {
	            System.out.println("Employee Not Found");
	        }
	    }
	}

