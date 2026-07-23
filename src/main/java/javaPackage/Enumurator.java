package javaPackage;

import java.util.*;
import java.lang.*;

public class Enumurator {
    public static void main(String args[]) {
        List list = new ArrayList(Arrays.asList(new String[] {"Apple", "Cat", "Dog", "Rat"}));
        Vector v = new Vector(list);
        delete(v, "Dog");
    }

    private static void delete(Vector v, String name) {
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            String s = e.nextElement().toString();
            if (s.equals(name)) {
                v.remove(name); // This causes ConcurrentModificationException in some JVMs
            }
        }

        // Display the names
        System.out.println("The names are:");
        e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
