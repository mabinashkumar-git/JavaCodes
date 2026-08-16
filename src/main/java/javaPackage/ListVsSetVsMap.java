package javaPackage;

import java.util.*;

public class ListVsSetVsMap {
    /**
     * List: An ordered collection that allows duplicate elements. Elements can be accessed by their index.
     * Set: An unordered collection that does not allow duplicate elements. It is used to store unique elements.
     * Map: A collection that maps keys to values. Each key is unique, and each key maps to exactly one value.
     */

    public static void main(String[] args) {
        // Example usage of List, Set, and Map
        List<String> list = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicate allowed
        System.out.println("List: " + list);

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // Duplicate not allowed
        System.out.println("Set: " + set);

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Apple", 3); // Key is unique, value will be updated
        System.out.println("Map: " + map);

    }
}
