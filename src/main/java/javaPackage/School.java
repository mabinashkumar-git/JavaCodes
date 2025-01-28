package javaPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class School {
	
	public void Cal1(String FirstName, String Lastname) {
		String s1 = FirstName;
		String s2 = Lastname;
		
		if(s1 == s2) {
			System.out.println(("S1 == S2"));
		}
		else {
			System.out.println(("S1! == S2"));
		}
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println(("S1 equals S2"));
		}
		else {
			System.out.println(("S1 not equals S2"));
		}
//		for(;;) {
//			System.out.println(("Run"));
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		School s = new School();
		School s1 = new School();
		s.Cal1("Abinash", "Mallick");
		s1.Cal1("Abinash", "Abinash");
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
        Date date = new Date();
        System.out.println(formatter.format(date));

	}

}
