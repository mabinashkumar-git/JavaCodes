package JavaPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountRepeatingAlphabets {
	
	
	@Test
	public void countrepeatingcharacter() {
		
		String string1 = "Abinash";  
        int count=1;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
         
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
//        	count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }
            
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }
        System.out.println("Count :" + count);
	}
	
	
	@Test
	public void countrepeatingstring() {
		
		String name = "abinash";
		int count=0;
		
		char namechar[] = name.toCharArray();
		List<String> namelist = Arrays.asList(name);
		int namelistsize = namelist.size();
		System.out.println(namelistsize);
		
		for(int i=0; i<namelistsize; i++) {
			if(namelist.get(i).equalsIgnoreCase("abinash")) {
				count ++ ;
			}
			
		}
		System.out.println(count);
	}

}
