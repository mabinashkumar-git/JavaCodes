package javaPackage;

import org.junit.jupiter.api.Test;

public class FinalVsImmutable {

    /* final means that you can’t change the object’s reference to point to another reference or another object,
       but you can still mutate its state (using setter methods e.g).
    *  Whereas immutable means that the object’s actual value can’t be changed, but you can change its reference to another one. */
    @Test
    public void finalVsImmutable(){

        final StringBuffer sb = new StringBuffer("Hello");

        // Even though reference variable sb is final
        // We can perform any changes
        sb.append(" Append World");

        System.out.println(sb);

        // Here we will get Compile time error
        // Because reassignment is not possible for final variable
//        sb = new StringBuffer("Hello World");

        System.out.println(sb);
    }

}
