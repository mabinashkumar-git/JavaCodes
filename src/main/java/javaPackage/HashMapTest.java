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
	
	@Test
	public void test() {
		String Name = "Abinash";
		StringBuffer stringname = new StringBuffer("Abinash");
		String actualname = stringname.toString();
		StringBuffer reversename = stringname.reverse();
		String actualreverse = reversename.toString();
		if(actualname.equalsIgnoreCase(actualreverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		System.out.println("****************************************");
		
		String newName = "";
		String anotherName = "Madam";
		char[] name = anotherName.toCharArray();
		for(int i=name.length-1; i>=0;i--) {
			char rvrname = name[i];
			newName = newName + rvrname;
		}
		if(newName.equalsIgnoreCase(anotherName)) {
			System.out.println("Palindrome 1");
		}
		else {
			System.out.println("Not Palindrome 1");
		}
	}

}
