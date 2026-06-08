package javaPackage;

public class EqualOperatorAndEqualIgnoreCase {
	
	public void Cal1(String FirstName, String Lastname) {
		String s1 = FirstName;
		String s2 = Lastname;
		
		if(s1 == s2) {
			System.out.println(("S1 == S2"));
		}
		else {
			System.out.println(("S1 != S2"));
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
		EqualOperatorAndEqualIgnoreCase s = new EqualOperatorAndEqualIgnoreCase();
		s.Cal1("Abinash", "Mallick");

		System.out.println(" ");

		System.out.println("Hello World");
		EqualOperatorAndEqualIgnoreCase s1 = new EqualOperatorAndEqualIgnoreCase();
		s1.Cal1("Abinash", "Abinash");

	}

}
