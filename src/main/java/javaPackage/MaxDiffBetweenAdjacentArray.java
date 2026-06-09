package javaPackage;

import org.junit.jupiter.api.Test;

public class MaxDiffBetweenAdjacentArray {

    // code to find the maximum difference between adjacent elements in an array
    @Test
    public void maxDiffBetweenAdjacentArray(){
        int A[] = {1,4,8,17,39,5,43};
        int diff = 0;

        for(int i=0; i<A.length-1; i++){
            if(A[i+1] - A[i] > diff){
                diff = A[i+1] - A[i];
                System.out.println("Adjacent numbers and their difference are :" + A[i] + " & " + A[i+1] + " & diff -: " + diff);
            }
        }
        System.out.println(" ");
        System.out.println("Highest diff is :" + diff);
    }
}
