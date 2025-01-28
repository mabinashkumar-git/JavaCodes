package javaPackage;

import org.junit.jupiter.api.Test;

public class SwapTwoVariablesWithoutUsingThirdVariable {

    @Test
    public void swapTwoVariablesWithoutThirdVariable(){
        int a = 5;
        int b = 6;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print("a=" +a + "\t" + "b=" + b);
    }
}
