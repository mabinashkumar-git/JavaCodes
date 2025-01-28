package javaPackage;

import org.junit.jupiter.api.Test;

public class Palindrome {

	public static void main(String[] args) {
		
		/*Reversing by using StringBuffer */
		StringBuffer name = new StringBuffer("Java programming is fun");
		StringBuffer reversename = name.reverse();
		String Realname = name.toString();
		String reverseRealName = reversename.toString();
	    
	    if(Realname.equalsIgnoreCase(reverseRealName)) {
	    	System.out.println("Palindrome");
	    }
	    else {
	    	System.out.println("Not Palindrome");
	    }
	    
	    /****************** Another Way ******************/
	    
	    String InputName = "Madam";
	    String Newname = "";

        // convert String to character array by using toCharArray
        char Name[] = InputName.toCharArray();

        for (int i = Name.length - 1; i >= 0; i--) {
        	char Reversename = Name[i];
        	System.out.println(Reversename);

        	Newname = Newname + Reversename;
        }

        System.out.println(Newname);

        if(InputName.equalsIgnoreCase(Newname)) {
        	System.out.println("Palindrome");
	    }
	    else {
	    	System.out.println("Not Palindrome");
	    }

	}
}
