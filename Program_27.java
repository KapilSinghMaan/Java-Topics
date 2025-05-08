// nested loop = A loop inside another loop
//               Used often with matrices or DS&A

import java.util.Scanner;

public class Program_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the Symbol you want to print: ");
        char symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(symbol + " ");
            System.out.println();
        }

        scanner.close();
    }
}
