// Runtime polymorphism = When the method that gets executed is decided
//                        at runtime based on the actual type of the object.

import java.util.*;

public class Program_53_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program_53_b animal;
        System.out.print("Would you like a dog or a cat? (1=Dog and 2=Cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Program_53_c();
            animal.speak();
        } else if (choice == 2) {
            animal = new Program_53_d();
            animal.speak();
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
