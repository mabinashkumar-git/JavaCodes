package javaPackage;

public class PyramidFormat {
    public static void main(String args[]){

        /*Target Output :

		   1 2 3 4                         * * * *
		   5 6 7                  OR       * * *
		   8 9                             * *
		   10                              *                        */

        int k=1;
        for(int i=0; i<4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(k++ + "\t");
//                System.out.print("*" + "\t");
            }
            System.out.println("");
        }


        /* SEPARATING 2 DIFF PROGRAMME*/
        System.out.println("");
        System.out.println("************************** ANOTHER ******************************");
        System.out.println("");

        /*Target Output :

		  1                          *
		  2 3          OR            * *
		  4 5 6                      * * *
		  7 8 9 10                   * * * *

		*/

        int k1=1;
        for(int i=0; i<4; i++){
            for(int j=1; j<=1+i; j++){
                System.out.print(k1++ + "\t");
//                System.out.print("*" + "\t");
            }
            System.out.println("");
        }

    }
}
