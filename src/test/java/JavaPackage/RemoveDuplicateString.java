package JavaPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class RemoveDuplicateString {
	
	@Test
	public void removeduplicateString() {
		
		String a = new String("aabbinnash");
		char anew[] = a.toCharArray();
		int anewlength = anew.length;
		
		// Used as index in the modified string
        int index = 0;
 
        // Traverse through all characters
        for (int i = 0; i < anewlength; i++)
        {
            // Check if anew[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (anew[i] == anew[j])
                {
                	
                    break;
                }
            }
 
            // If not present, then add it to result.
            if (j == i)
            {
            	anew[index++] = anew[i];
            }
        }
         String sortedname = String.valueOf(Arrays.copyOf(anew, index));
         System.out.println(sortedname);
	}
	
	
	@Test
	public void removeduplicateString1() {
		
		Stream.of("Sipun","Abinash","Abinash","Kumar","Mallick").distinct().forEach(s->System.out.println(s));
		Stream.of("Sipun","Abinash","Abinash","Kumar","Mallick").sorted().distinct().forEach(s->System.out.println(s));
		
	}
	
	
	@Test
	public void removeduplicateString2() {
		
		String array[] = {"Sipun","Abinash","Abinash","Kumar","Mallick"};
		String array1[] = {"Abinash","Sipun","Sipun","Kumar"};
		
		List<String> arraynew = Arrays.asList(array);
		List<String> array1new = Arrays.asList(array1);
		
		arraynew.stream().distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("************** Next *****************");
		Stream.concat(arraynew.stream(), array1new.stream()).sorted().forEach(s->System.out.println(s));
		
	}

}
