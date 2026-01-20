package net.konic.corejava.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class ListOfLaptop {
	
		Set<ListOfLaptop> addLaptopDetails() {

			ListOfLaptop obj = new ListOfLaptop();
			obj.setBrandName("HP");
			obj.setBrandName(null);
			obj.setBrandName(null);
			obj.setBrandName("HP");
			obj.setPrice(20000);

			ListOfLaptop obj1 = new ListOfLaptop();
			obj1.setBrandName("DELL");
			obj1.setPrice(30000);

			ListOfLaptop obj2 = new ListOfLaptop();
			obj2.setBrandName("Apple");
			obj2.setPrice(90000);

			Set set = new LinkedHashSet();
			set.add(obj);
			set.add(obj1);
			set.add(obj2);

			return set;

		}

		private void setPrice(int i) {
			
		}

		private void setBrandName(String string) {
			
		}

		public static void main(String[] args) {

			ListOfLaptop lp = new ListOfLaptop();
			lp.addLaptopDetails();
			System.out.println("List Of Laptop Details : " + lp.addLaptopDetails());
		}

	}


