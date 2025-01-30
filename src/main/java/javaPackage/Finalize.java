package javaPackage;

import java.util.GregorianCalendar;


/* The Java Object finalize() method is called by the garbage collector on an object when garbage collection determines
   that there are no more references to the object. A subclass overrides the finalize method to dispose of system
   resources or to perform other cleanup */

public class Finalize extends GregorianCalendar {

    public static void main(String[] args) {
        try {
            // create a new ObjectDemo object
            Finalize cal = new Finalize();

            // print current time
            System.out.println("" + cal.getTime());

            // finalize cal
            System.out.println("Finalizing...");
            cal.finalize();
            System.out.println("Finalized.");

        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }
}
