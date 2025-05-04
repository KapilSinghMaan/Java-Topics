// Normal Shopping Cart

import java.util.*;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What item you would like to buy?: ");
        String item = sc.nextLine();
        System.out.print("What is the price for each?: ");
        double price = sc.nextDouble();
        System.out.print("How many would you like?: ");
        int quatity = sc.nextInt();

        double total = price * quatity;
        System.out.println("\nYou have bought " + quatity + " "+ item + "/s");
        System.out.println("Your total is Rs. " + total);

        sc.close();
    }
}
