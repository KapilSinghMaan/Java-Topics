// Exception = An event that interrupts the normal flow of a program
//                      (Dividing by zero, file not found, mismatch input type)
//                      Surround any dangerous code with a try{} block
//                       try{}, catch{}, finally{}

import java.util.*;

public class Program_59 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("This is not number");
        } finally {
            System.out.println("This will execute surely");
        }
    }
}
