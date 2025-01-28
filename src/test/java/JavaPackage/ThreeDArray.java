package JavaPackage;

import org.testng.annotations.Test;

public class ThreeDArray {
	
	/**
	 * This method finds smallest no in all columns and row
	 */
	@Test
	public void findSmallestNo() {
		
		/* 
		   5 4 2
		   6 3 1           
		   
		 */
		
		int A[][] = new int[2][3];
		int B[][] = {{5,4,2},{6,3,1}};
		int smallestno = B[0][0];
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<3; j++) {
				
				if(B[i][j] < smallestno) {
					
					smallestno = B[i][j];
				}
				
			}
			
		}
		System.out.println(smallestno);
		
	}
	
	
	
	/**
	 * This method finds smallest no in all columns and row,
	 * Then smallest no found in that particular column is scanned and it filters the largest value in that column
	 */
	@Test
	public void findSmallestNoinRowMaxNoInThatCol() {
		
		/* 
		   5 4 2
		   6 3 6
		   7 5 1           
		   
		   Output should be 6
		 */
		
		int B[][] = {{5,4,2},{6,3,6},{7,5,1}};
		int smallestno = B[0][0];
		int smallestValueInCol = 0;
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<3; j++) {
				
				if(B[i][j] < smallestno) {
					
					smallestno = B[i][j];
					smallestValueInCol=j;
					
				}
			}
		}
//		System.out.println(smallestno);
		
		int largestValue = B[0][smallestValueInCol];
		int k=0;
		// Here 3 denoted size of row
		while(k<3) {
			
			if(B[k][smallestValueInCol] > largestValue) {
				
				largestValue = B[k][smallestValueInCol];
			}
			k++;
		}
		System.out.println(largestValue);
		
	}
	

}
