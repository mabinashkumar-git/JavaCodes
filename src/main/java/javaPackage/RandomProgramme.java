package javaPackage;

//import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomProgramme {

    public static void main(String[] args) {
        String input = "AbinashMallick123456";

        // Extracting the name parts
        String namePart = input.replaceAll("\\d", "");               // Remove digits
        System.out.println("Name part: " + namePart);

        String firstName = namePart.substring(0, namePart.indexOf("Mallick"));        // extracts a substring from the namePart string, starting at index 0 (the beginning of the string) and ending just before the index where the substring "Mallick" starts. This effectively retrieves the first name, assuming "Mallick" is the last name in the string.
        System.out.println("First name: " + firstName);

        String lastName = namePart.substring(namePart.indexOf("Mallick"));
        System.out.println("Last name: " + lastName);

        // Extracting and summing the digits
        String digitPart = input.replaceAll("\\D", "");              // Remove non-digits
        System.out.println("Digit part: " + digitPart);
        char[] digitPartChar = digitPart.toCharArray();

        int sum = 0;
        for(int i=0; i<digitPart.length(); i++){
            sum = sum + Character.getNumericValue(digitPartChar[i]);
        }

        // Output
        System.out.println(lastName + " " + firstName);
        System.out.println("Sum of digits: " + sum);

        // Call the printDuplicateElements method
        RandomProgramme programme = new RandomProgramme();
        programme.printDuplicateElements();
    }


    public void printDuplicateElements() {
        List<String> names = Arrays.asList("Abinash", "Aakash", "Abinash", "Deepak", "Aakash");
        Map<String, Integer> nameCount = new HashMap<>();

        // Count occurrences of each name
        for (String name : names) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        // Print duplicate elements
        System.out.println(" ");
        System.out.println("*********************************");
        System.out.println(" ");
        System.out.println("Duplicate elements:");
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
