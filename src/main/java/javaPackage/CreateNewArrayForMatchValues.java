package javaPackage;

import org.junit.jupiter.api.Test;

public class CreateNewArrayForMatchValues {

    //code to create new array for matched values from two different arrays
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

        System.out.println("");
        System.out.println("***********************************");
    }


    /* ************************************************************ */

    @Test
    public void practise1() {
        String name = "Night";
        String name1 = "SightPlayer";

        char[] ch = name.toCharArray();
        char[] ch1 = name1.toCharArray();

        char temp[] = new char[name1.length()];
        int j = 0;

        for (int i = 0; i < name.length(); i++) {
            for (int m = 0; m < name1.length(); m++) {
                if (ch[i] == ch1[m]) {
                    temp[j] = ch[i];
                    j++;
                }
            }
        }
        System.out.println("Sorted common array for 2nd type is :");
        for (int k = 0; k < j; k++) {
            System.out.print(temp[k] + "\t");
        }

        System.out.println("");
        System.out.println("***********************************");
    }

    /* ************************************************************ */

    @Test
    public void practise(){
        String name = "Night";
        String name1 = "SightPlayer";

        char[] ch = name.toCharArray();
        char[] ch1 = name1.toCharArray();

        char temp[] = new char[name1.length()];
        int j=0;

        for(int i=0; i<name.length(); i++){
            if(ch[i] == ch1[i]){
                temp[j] = ch[i];
                j++;
            }
        }
        System.out.println("Sorted common array is :");
        for(int k=0; k<j; k++){
            System.out.print(temp[k] + "\t");
        }

        System.out.println("");
        System.out.println("***********************************");
    }

}
