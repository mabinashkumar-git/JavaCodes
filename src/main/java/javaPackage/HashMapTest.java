package javaPackage;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class HashMapTest {
	
	@Test
	public void hashMap() {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Abinash", 29);
		map.put("Kumar", 39);
		map.put("Mallick", 49);
		
		if(map.containsKey("Abinash")) {
			System.out.print(map.get("Abinash"));
		}
	}

}
