package javaPackage;

public class WrapperClass {

    public static void main(String[] args) {
        // Wrapper class is used to convert primitive data types into objects and vice versa.
        // It provides a way to use primitive data types as objects, which can be useful in certain situations, such as when working with collections or when using generics.
        // Java collections (ArrayList, HashMap, etc.) store only objects, not primitives.
        // Wrapper objects allow primitives to be used in object-oriented features like methods, synchronization, and serialization
        // Objects support null values, while primitives do not.
        // Wrapper classes provide utility methods such as compareTo(), equals(), and toString()


        // Example of wrapper class
        int a = 10;
        Integer b = Integer.valueOf(a); // converting int to Integer object
        System.out.println("Value of b: " + b);

        Integer c = new Integer(20); // creating Integer object
        int d = c.intValue(); // converting Integer object to int
        System.out.println("Value of d: " + d);
    }
}
