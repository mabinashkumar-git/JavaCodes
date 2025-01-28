package javaPackage;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RmoveDuplicateElement {

    @Test

    public void removeDuplicatesInArray(){

        int A[] = {10,20,20,30,40,40,50,60,60,70,80,90,90};
        int n1 = A.length;
        System.out.println("Original size :" + n1);

        int temp[] = new int[n1];
        int j=0;

        if(n1 != 0 || n1 != 1) {
            for(int i=0; i<n1-1; i++){
                if(A[i] != A[i+1]){
                    temp[j] = A[i];
                    j++;
                    System.out.println("value of initial j :" + j);
                }
            }
            temp[j++] = A[n1-1];                           // Assigns the last value i.e temp[9] = A[12]
            System.out.println("value of j after :" + j);

            for(int k=0; k<n1-1; k++)
                A[k] = temp[k];

            for (int i = 0; i < j; i++)
                System.out.print(A[i] + " ");
        }

    }
	
	public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        //Creating another array for only storing the unique elements
        int temp[] = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
//                temp[j++] = a[i];
                temp[j] = a[i];
                j++;
                System.out.println("value of initial j :" + j);
            }
        }

        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < n-1; i++) {
//        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        return j;
    }

	public static void main(String[] args) {
		
		int a[] = { 10,20,20,30,40,40,50,60,60,70,80,90,90};
        int n = a.length;
        System.out.println(n);
 
        n = removeduplicates(a, n);
 
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

	}

}
