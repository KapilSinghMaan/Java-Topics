// Random Numbers , Double , boolean in java

import java.util.*;

public class Program_8 {

    public static void main(String[] args) {
        Random random = new Random();

        // int number = random.nextInt(1, 101);
        // System.out.println(number);

        // double number = random.nextDouble();
        // System.out.println(number);

        boolean isHead = random.nextBoolean();
        if (isHead) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}