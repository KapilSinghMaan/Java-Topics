// WEIGHT CONVERTOR PROGRAM

import java.util.*;

public class Program_17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Coversion Program");
        System.out.println("Choice 1: Convert lbs to Kg");
        System.out.println("Choice 2: Convert Kg to lbs");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double weight, newWeight;

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("Weight in Kg: " + newWeight);
        } else if (choice == 2) {
            System.out.print("Enter weight in Kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("Weight in lbs: " + newWeight);
        } else {
            System.out.println("You entered wrong choice ! Try Again!!!");
        }

        scanner.close();
    }
}
