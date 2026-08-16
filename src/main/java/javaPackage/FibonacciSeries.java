package javaPackage;

public class FibonacciSeries {

    // code to print Fibonacci series up to 10 numbers
    public  static void main(String[] args){
        int a=0, b=1;
        System.out.print( " Fibonacci series is :\t" + a + "\t" + b);
        for(int i=2; i<10; i++){
            int c = a+b;
            System.out.print("\t" + c);
            a=b;
            b=c;
        }
    }
}
