package javaPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

import org.junit.Test;

public class HashMapTest {

	// code to demonstrate the use of HashMap in Java
	@Test
	public void hashMap() {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Abinash", 29);
		map.put("Kumar", 39);
		map.put("Mallick", 49);
		
		if(map.containsKey("Abinash")) {
			System.out.print(map.get("Abinash"));
		}

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Abinash");
		map1.put(2, "Kumar");
		map1.put(3, "Mallick");
		System.out.println(map1);

		HashMap<Integer, Integer> map2 = new HashMap<>();
		map2.put(1, 29);
		map2.put(2, 39);
		map2.put(3, 49);
		System.out.println(map2);


		HashSet<String> set = new HashSet<>();
		set.add("Abinash");
		set.add("Kumar");
		set.add("Mallick");
		set.add("Abinash");
		System.out.println(set);


		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("Abinash", 29);
		table.put("Kumar", 39);
		table.put("Mallick", 49);
		System.out.println(table);
		System.out.println(table.get("Abinash"));

		Hashtable<Integer, String> table1 = new Hashtable<>();
		table1.put(1, "Abinash");
		table1.put(2, "Kumar");
		table1.put(3, "Mallick");
		System.out.println(table1);

		Hashtable<Integer, Integer> table2 = new Hashtable<>();
		table2.put(1, 29);
		table2.put(2, 39);
		table2.put(3, 49);
		System.out.println(table2);
	}

}
