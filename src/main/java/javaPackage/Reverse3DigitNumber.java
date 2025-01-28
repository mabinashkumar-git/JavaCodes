package javaPackage;

public class Reverse3DigitNumber {

    public static void main(String args[]){
        int number = 537;

        int a = number %10;
        int b = number /10;
        int c = b % 10 ;
        int d = b / 10;

        System.out.println("Reversed no is :" + a + c + d);
    }

}
