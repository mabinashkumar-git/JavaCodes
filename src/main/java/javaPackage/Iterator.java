package javaPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.*;

public class Iterator {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Cat", "Dog", "Rat"));
        Vector<String> v = new Vector<>(list);
        delete(v, "Dog");
    }

    private static void delete(Vector<String> v, String name) {
        java.util.Iterator<String> i = v.iterator(); // Use java.util.Iterator
        while (i.hasNext()) {
            String s = i.next();
            if (s.equals(name)) {
                i.remove(); // Safe removal
            }
        }

        // Display the names
        System.out.println("The names are:");
        i = v.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
