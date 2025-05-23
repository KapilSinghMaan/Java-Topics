// Enums = (Enumerations) A special kind of class that
//                  represents a fixed set of constants.
//                  They improve code readability and reliability.
//                  More efficient with switches than Strings.

import java.util.*;

public class Program_70_a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Program_70_b day = Program_70_b.valueOf(response);

            switch (day) {
                case MONDAY,
                        TUESDAY,
                        WEDNESDAY,
                        THURSDAY,
                        FRIDAY ->
                    System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day");
        }

        scanner.close();
    }
}