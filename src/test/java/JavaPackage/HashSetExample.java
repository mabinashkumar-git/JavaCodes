package JavaPackage;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;

public class HashSetExample {
	
	
	/* List accepts duplicate values but Set do not accepts duplicated values 
	 * List follows sequential order but set do not follow sequential order */
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void hashSet() {
		
		HashSet name = new HashSet();
		name.add("Abinas");
		name.add("Kumar");
		name.add("Mallick");
		
		System.out.println(name.size());
		
		Iterator nameiterator = name.iterator();
		
		while(nameiterator.hasNext()) {
			
			System.out.println(nameiterator.next());
			
		}
		
		
		
	}
	

}
