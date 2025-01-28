package JavaPackage;

import org.testng.annotations.Test;

public class ReverseString {
	
	@Test
	public void reverseString() {
		
		String name = "Abinash";
		char newname[] = name.toCharArray();
		int charlen = newname.length;
		
		for(int i=charlen-1; i>=0; i-- ) {
			System.out.print(newname[i] + " ");
		}
	}
	
	
	@Test
	public void reverseStringByStringBuffer() {
		
		StringBuffer name = new StringBuffer("Abinash");
		System.out.println(name.reverse());
		
	}

}
