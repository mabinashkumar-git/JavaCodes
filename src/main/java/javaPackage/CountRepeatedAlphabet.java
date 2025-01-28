package javaPackage;

public class CountRepeatedAlphabet {

    public  static void main(String args[]){

        String name = "abbinnash";
        char[] a = name.toCharArray();
        int n = name.length();
        char temp[] = new char[n];
        char repeatChar[] = new char[n];
        int j=0;
        int count = 0;

        for(int i=0; i<n-1; i++){
            if(a[i] != a[i+1]){
                temp[j]= a[i];
                j++;
            }
            else{
                repeatChar[count] = a[i];
                count ++;
            }
        }
        temp[j++] = a[n-1];

        for(int i=0; i<n-1; i++)
            a[i] = temp[i];

        for(int k=0; k<j; k++)
            System.out.print(a[k]);
        System.out.println("");

        System.out.print("Count of repeating char is " + count + " and char are : ");
        for(int l=0; l<count; l++){
            System.out.print(repeatChar[l] + " ");
        }
    }

}
