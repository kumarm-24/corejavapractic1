package net.konic.corejava.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployes {
		
		public static void main(String[] args) {
			List<String> employee = new ArrayList();

			employee.add("Kumar");
			employee.add("Haneef");
			employee.add("Sidhiq");
			employee.add("Zakeer");
			employee.add("Syed");

			System.out.println("List Of Employees : " + employee);

		}

	}

