package JavaPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMapExample {
	
/* HashMap is Non-Synchronized and not Thread safety but HashTable is synchronized and Thread safety
 * Performance of HashMap is faster than HashSet
 * HashMap allows one null Key and multiple null values but HashTable do not allows any null key or values 
 * Iterator is use to iterate the values in HashMap whereas Enumerator is use to Iterate the value in HashTable */
	
	
	@Test
	public void hashmapexample() {
		
		HashMap hashmap = new HashMap();
		
		hashmap.put("name", "Abinash");
		hashmap.put("nickname", "Sipun");
		hashmap.put("Address", "Puri");
		System.out.println(hashmap.get("name"));
		System.out.println(hashmap.size());
		
		/* Converting HashMap to Set */
		Set hashset = hashmap.entrySet();
		
		Iterator hashsetiterator = hashset.iterator();
		while(hashsetiterator.hasNext()) {
			
			System.out.println(hashsetiterator.next());
			
			/* This gives output separetly for key and value */
//			Map.Entry mapentry = (Map.Entry)hashsetiterator.next();
//			System.out.println(mapentry.getKey());
//			System.out.println(mapentry.getValue());
		}
		
		
	}

}
