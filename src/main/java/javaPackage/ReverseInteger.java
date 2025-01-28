package javaPackage;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 123456789, reverse = 0;
        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {
            int remainder = num % 10;              // get last digit from num
            reverse = reverse * 10 + remainder;
            num = num/10;                          // remove the last digit from num
        }
        System.out.println("Reversed Number: " + reverse);

	}

}
