package javaPackage;

public class PrimeNumber {

    public static void main(String args[]){
        int num = 6;
        boolean flag = false;

        if(num ==0 || num ==1){
            flag = true;
        }

        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                flag = true;
                break;
            }
        }
        if(flag == false)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
