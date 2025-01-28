package JavaPackage;

import org.testng.annotations.Test;

public class StringOperations {
	
	@Test
	public void stringoperations() {
		
		//String is a class
		String a =" Abinash";
		String b = new String(" Kumar ");
		String c = "Mallick";
		
		System.out.println("Print 1 :" + a.charAt(2));
		System.out.println("Print 4 :" + b.trim().charAt(2));
		System.out.println("Print 2 :" + a.replace("i", "I"));
		System.out.println("Print 3 :" + a.concat(b).concat(c));
		
		String split[] = a.split("n");
		System.out.println("Print 5 :" + split[0]);
		System.out.println("Print 5 :" + split[1]);
		System.out.println("Print 5 :" + split[0]+"n"+split[1]);
		
		System.out.println("Print 6 :" + c.substring(4) + "::" + c.substring(1, 4));
		
		
	}

}
