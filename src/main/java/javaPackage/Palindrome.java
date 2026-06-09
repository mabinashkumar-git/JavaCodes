package javaPackage;

import org.junit.jupiter.api.Test;

public class Palindrome {

	// code to check whether the given string is palindrome or not
	public static void main(String[] args) {
		
		/*Reversing by using StringBuffer */
		StringBuffer name = new StringBuffer("Abinash");
		StringBuffer reversename = name.reverse();
		String Realname = name.toString();
		String reverseRealName = reversename.toString();
	    
	    if(Realname.equalsIgnoreCase(reverseRealName)) {
	    	System.out.println("Palindrome");
	    }
	    else {
	    	System.out.println("Not Palindrome");
	    }


		/****************** Another Way - REFER THIS ******************/

		System.out.println("****************** Another Way ******************");

		String InputName1 = "Nitin";
		// convert String to character array by using toCharArray
		char Name1[] = InputName1.toCharArray();
		char[] temp = new char[Name1.length];
		int j=0;

		for (int i=Name1.length-1; i>=0; i--) {
			temp[j] = Name1[i];
			j++;
		}
		String Newname1 = String.valueOf(temp);
		System.out.println("Newname1 -:" + Newname1);

		if(Newname1.equalsIgnoreCase(InputName1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}





	    /****************** Another Way ******************/
		System.out.println("****************** Another Way ******************");

	    String InputName = "Madam";
	    String Newname = "";

        // convert String to character array by using toCharArray
        char Name[] = InputName.toCharArray();

        for (int i=Name.length-1; i>= 0; i--) {
        	char Reversename = Name[i];
//        	System.out.println("Reversename -:" + Reversename);

        	Newname = Newname + Reversename;
        }

        System.out.println("Newname -:" + Newname);

        if(InputName.equalsIgnoreCase(Newname)) {
        	System.out.println("Palindrome");
	    }
	    else {
	    	System.out.println("Not Palindrome");
	    }


	}
}
