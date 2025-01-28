package javaPackage;

import org.junit.jupiter.api.Test;

public class DescendingOrder {

    @Test
    public void asscendingOrder(){
        int A[] = {5,3,7,2,1,9,6};
        int temp;

        for(int i=0; i<A.length; i++)
        {
            for(int j=i+1; j<A.length;j++)
            {
                if(A[i]<A[j])
                {
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        System.out.print("Array :");
        for(int k=0; k<A.length; k++)
            System.out.print(A[k] + "\t");
    }
}
