package JavaPackage;

import org.testng.annotations.Test;

public class RevrseInteger {
	
	@Test
	public void reverseInteger() {
		
		int A[] = {1,2,3,4,5};
		int lengthofA = A.length;
		
		for(int i =lengthofA-1; i>=0; i--) {
			System.out.print(A[i] + " ");
		}
		
	}
	
	
	@Test
	public void reverseIntegers() {
		
		int A[] = {1,2,3,4,5};
		int lengthofA = A.length;
		int j = lengthofA;
		
		int b[] = new int[lengthofA];
		
		for(int i =lengthofA-1; i>=0; i--) {
			System.out.println(A[i]);
			
			b[j-1] = A[i];
			j=j-1;
		}
		
		for(int k=0; k<lengthofA; k++) {
			
			System.out.println(b[k]);
		}
	}

}
