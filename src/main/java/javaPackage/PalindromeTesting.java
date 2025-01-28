package javaPackage;

import org.junit.jupiter.api.Test;

public class PalindromeTesting {

    @Test
    public void palindrome(){
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
