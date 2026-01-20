package net.konic.corejava.map;

import java.util.HashMap;
import java.util.Map;

public class FailFastMap {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "Kumar");
		map.put(2, "khan");
		map.put(3, "meera");
		
		for(Integer key : map.keySet()) {
			System.out.println(key + " = " + map.get(key));
			
			map.remove(3);
			
		}
		 System.out.println(map);
	}

}
