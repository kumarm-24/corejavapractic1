package net.konic.corejava.map;

import java.util.HashMap;
import java.util.Map;

public class StudentDemoMain {
	public static void main(String[] args) {
		
		StudentsDemo s = new StudentsDemo();
		s.setName("kumar");
		s.setId(1);
		
		StudentsDemo s1 = new StudentsDemo();
		s1.setName("khan");
		s1.setId(2);
		
		StudentsDemo s2 = new StudentsDemo();
		s2.setName("meera");
		s2.setId(3);
		
		Map <Integer,StudentsDemo> map = new HashMap();
		
		map.put(s.getId(), s);
		map.put(s.getId(), s1);
		map.put(s.getId(), s2);
		
		 for (Map.Entry<Integer, StudentsDemo> entry : map.entrySet()) {
	         System.out.println(s);
	         System.out.println(s1);
	         System.out.println(s2);
		
	   }
	}
}
