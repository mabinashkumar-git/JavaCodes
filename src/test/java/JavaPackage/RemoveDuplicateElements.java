package JavaPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class RemoveDuplicateElements {
	
	@Test
	public void removeduplicateelements() {
		
		int A[] = {1,2,3,3,4,5,5,6,7,7};
		int lengthofA = A.length;
		
		//Creating another array for only storing the unique elements
        int temp[] = new int[lengthofA];
        int j = 0;
		
		for(int i=0; i<lengthofA-1; i++) {
			
			if (A[i] != A[i + 1]) {
                temp[j++] = A[i];
                
            }
		}
		
		 temp[j++] = A[lengthofA - 1];
		 
	        // Changing the original array
	        for (int i = 0; i < j; i++) {
	            A[i] = temp[i];
	        }
	 
	     // Printing The array elements
	        for (int i = 0; i < j; i++)
	            System.out.print(A[i] + " ");
		
	}
	
	
	
	@Test
	public void printUniqueElements() {
		
		/* Steps :
		   * Create an empty array
		   * Check if the elements in array which is to be pushed to empty ArrayList is present or not
		   * If present increase the count and if not add it to the empty ArrayList*/
		
		
		int A[] = {1,1,2,3,4,4,5,6,6,7,8,9,9};
		int k=0;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i=0; i<A.length; i++) {
			
			// Scanning if element is present in created empty ArrayList, If not the adding it
			if(! numbers.contains(A[i])) {
				
				numbers.add(A[i]);
				k++ ;
				
				/* Starting a for loop from index[1] of array A i.e. comparing A[0] with A[1], then increasing the "j" 
				   value and comparing the rest elements to 1st element in array, if found matching then increasing "k"
				   vale which will give the count of no of time the element is repeated */ 
				for(int j=i+1; j<A.length; j++) {
					
					if(A[i]==A[j]) {
						
						k++ ;
					}
				}
				System.out.println("Unique Elements : " + A[i]);
				System.out.println("No of times element '" + A[i] +"' repeated : " + k);
				
			}
			
		}
		
	}
	
	
	

}
