package javaPackage;

import org.junit.jupiter.api.Test;

public class ReverseIntegerArray {

    @Test
    public void reverseIntegerArray(){
        int A[] =  {10, 20, 30, 40};
        int B[] = new int[A.length];
        int j=A.length-1;

        for(int i=0; i<=A.length-1; i++){
            B[i] = A[j];
            j--;
        }
        /*printing the reversed array*/
        System.out.println("Reversed array is: ");
        for (int k=0; k<A.length; k++) {
            System.out.print(B[k] + "\t");
        }
    }

    /* Function that reverses array and stores it in another array*/
    public static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i=0; i<n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        /*printing the reversed array*/
        System.out.println("Reversed array is: ");
        for (int k=0; k<n; k++) {
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);

    }
}
