// ArrayList = A resizeable array that stores objects (autoboxing)
//             Arrays are fixed in size, but ArrayLists can change

import java.util.*;

public class Program_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter number of food items: ");
        int numOfFoods = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numOfFoods; i++) {
            System.out.print("Enter the #" + i + " food: ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        scanner.close();
    }
}
