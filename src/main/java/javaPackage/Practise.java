package javaPackage;

import org.junit.jupiter.api.Test;

public class Practise {

    @Test
    public void practiseJava() {

        String name = "madam";
        char[] nameArray = name.toCharArray();
        char[] temp = new char[nameArray.length];
        char j = 0;
        
        for(int i = nameArray.length - 1; i >= 0; i--){
           temp[j] = nameArray[i];
              j++;
        }

        if(name.equals(String.valueOf(temp))){
            System.out.println("\nThe name is a palindrome");
        } else {
            System.out.println("\nThe name is not a palindrome");
        }


    }
}
