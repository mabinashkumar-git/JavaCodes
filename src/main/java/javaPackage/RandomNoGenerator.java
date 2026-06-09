package javaPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomNoGenerator {

    // code to generate random no between 0 to 1000
    public static void main(String[] args){

        Random random = new Random();
        int randomNo1 = random.nextInt(1000);
        System.out.println("Random no :"+randomNo1);
    }
}
