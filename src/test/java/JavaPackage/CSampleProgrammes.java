package JavaPackage;

import org.testng.annotations.Test;

public class CSampleProgrammes {
	
	@Test
	public void printOutputInPyramidFormat() {
		
		/*Target Output :
		  
		   1 2 3 4                         * * * *
		   5 6 7                  OR       * * *
		   8 9                             * *
		   10                              *                        */
		
		
		int k =1;
		//loop for rows
		for(int i=0; i<4; i++) {
			//loop for columns
			for(int j=1; j<=4-i; j++) {
//				System.out.print(k++ + "\t");
				System.out.print("*" + "\t");
			}
			System.out.println("");
		}
	}
	
	
	@Test
	public void printInvertedOutputInPyramidFormat() {
		
		/*Target Output :
		
		  1                          *
		  2 3          OR            * *
		  4 5 6                      * * *
		  7 8 9 10                   * * * *                                   
		  
		*/ 
		
		int k=1;
		//loop for rows
		for(int i=0; i<4; i++) {
			//loop for columns
			for(int j=1; j<=1+i; j++) {
				System.out.print(k++ + "\t");
//				System.out.print("*" + "\t");
			}
			System.out.println("");
		}
	}

}
