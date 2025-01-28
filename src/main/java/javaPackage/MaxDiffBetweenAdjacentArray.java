package javaPackage;

import org.junit.jupiter.api.Test;

public class MaxDiffBetweenAdjacentArray {

    @Test
    public void maxDiffBetweenAdjacentArray(){
        int A[] = {1,4,8,5,17,19};
        int diff=0;

        for(int i=0; i<A.length-1; i++){
            if(A[i+1] - A[i] > diff){
                diff = A[i+1] - A[i];
            }
        }
        System.out.println("Highest diff is :" + diff);
    }
}
