package javaPackage;

import org.junit.jupiter.api.Test;

public class CreateNewArrayForMatchValues {


    @Test
    public void arrayForMatchedValues(){
        int A[] = {1,4,8,5,17,19};
        int B[] = {2,4,9,5,1,19};

        int temp[] = new int[A.length];
        int j=0;

        for(int i=0; i<A.length; i++){
            for(int m=0; m<B.length; m++){
                if(A[i] == B[m]){
                    temp[j] = A[i];
                    j++;
                }
            }
        }
        System.out.println("Sorted array for " + j + " no of matched values is :");
        for(int k=0; k<j; k++){
            System.out.print(temp[k] + "\t");
        }
    }


    /* ************************************************************ */

    @Test
    public void practise(){
        int A[] = {1,4,8,5,17,19};
        int B[] = {2,4,9,5,18,19};

        int temp[] = new int[A.length];
        int j=0;

        for(int i=0; i<A.length; i++){
            if(A[i] == B[i]){
                temp[j] = A[i];
                j++;
            }
        }
        System.out.println("Sorted array is :");
        for(int k=0; k<j; k++){
            System.out.print(temp[k] + "\t");
        }
        System.out.println("");
    }



}
