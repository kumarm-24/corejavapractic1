package net.konic.corejava.map;

	import java.util.HashMap;
	import java.util.Map;

	public class UpdateEmployeMain {

	    public static Map<Integer, Employee> addEmployees() {

	        Map<Integer, Employee> empMap = new HashMap<>();

	        empMap.put(101, new Employee(101, "Ayaan", "IT"));
	        empMap.put(102, new Employee(102, "Rahim", "HR"));
	        empMap.put(103, new Employee(103, "Sara", "Finance"));

	        return empMap;
	    }

	    public static Employee updateDepartment(
	            Map<Integer, Employee> map, int id, String newDept) {

	        Employee emp = map.get(id);

	        if (emp != null) {
	            emp.setDepartment(newDept);
	        }
	        return emp;
	    }

	    public static void main(String[] args) {

	        Map<Integer, Employee> employees = addEmployees();

	        int empId = 103;
	        String newDepartment = "Admin";

	        Employee updatedEmp = updateDepartment(employees, empId, newDepartment);

	        if (updatedEmp != null) {
	            System.out.println("Updated Employee: " + updatedEmp);
	        } else {
	            System.out.println("Employee Not Found");
	        }
	    }
	}


