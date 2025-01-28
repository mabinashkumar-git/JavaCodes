package javaPackage;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reversing by using StringBuffer */
		StringBuffer name = new StringBuffer("Java programming is fun");
	    System.out.println(name.reverse());
	    
	    /****************** Another Way **************/
	    
	    String InputName = "Abinash Mallick";
        // convert String to character array by using toCharArray
        char Name[] = InputName.toCharArray();
 
        for (int i = Name.length - 1; i >= 0; i--)
            System.out.print(Name[i]);

	}

}
