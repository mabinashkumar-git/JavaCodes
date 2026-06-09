package javaPackage;

public class PrimeNumber {

    // code to check if a number is prime or not
    public static void main(String[] args){
        int num = 6;
        boolean flag = true;

        if(num ==0 || num ==1){
            flag = false;
        }

        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                flag = false;
                break;
            }
        }
        if(flag == true)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

}
