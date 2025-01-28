package javaPackage;

import org.junit.jupiter.api.Test;

public class MultiplyNoWithoutMultiplyOperator {

    @Test
    public void multiplyNumber(){
        // Multiply two numbers, let's say 5 and 10. And get result as 50 but do not use * operator.
        int n = 5, n1 =10;
        int mulitpliednum = 0;
        int sum =0;

        for(int i=1; i<=n1; i++){
            mulitpliednum = mulitpliednum + n;
        }
        System.out.println("Multiplied no is :" + mulitpliednum);
    }
}
