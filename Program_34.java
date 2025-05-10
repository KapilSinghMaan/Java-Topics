// Input in Arrays

import java.util.*;

public class Program_34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter # of food items: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        String foods[] = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}