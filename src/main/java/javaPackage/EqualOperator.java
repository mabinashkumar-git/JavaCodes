package javaPackage;

import org.junit.jupiter.api.Test;

public class EqualOperator {

    /* When two variables are created with same value, then only a single objet is created i.e. for line 10 & 11, only a siingle
       object is created. So a==b is true
       But a ==s is false as there are two diff objects created */
    @Test
    public void equalOperator(){
        String a = "Abinash";
        String b = "Abinash";

        String s = new String("Abinash");

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.equals(s));
        System.out.println(a == s);
    }
}
