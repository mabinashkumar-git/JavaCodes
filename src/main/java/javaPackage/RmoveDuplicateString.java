package javaPackage;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RmoveDuplicateString {

    // code to remove duplicate string from a given string
    @Test
    public void removeDuplicateString(){
        String name = "abbcdddefgghii";
        char name1[] = name.toCharArray();
        int n1 = name.length();
        char temp[] = new char[n1];
        int j=0;

        for(int i=0; i<n1-1; i++){
            if(name1[i] != name1[i+1]){
                temp[j] = name1[i];
                j++;
//                System.out.println("value of initial j :" + j);
            }
        }
        temp[j++] = name1[n1-1];                  // Assigns the last value i.e temp[9] = A[12].
        System.out.println("value of j after :" + j);

        for(int i=0; i<j; i++) {
            System.out.print(temp[i]);
        }
    }


    /* *************************** Another way ************************************* */

	
	public static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;
 
        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            // If not present, then add it to result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

	public static void main(String[] args) {
		
		char str[] = "ababbcdeeef".toCharArray();
        int n = str.length;
        System.out.println("Length of String is :"+n);
        System.out.println(removeDuplicate(str, n));
	}

}
