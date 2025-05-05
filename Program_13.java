// Compound Interest Calculator

import java.util.*;

public class Program_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal amount : ");
        double principal = scanner.nextDouble();
        System.out.print("Enter interest rate (in %) : ");
        double rate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of times compounded : ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of year : ");
        int t = scanner.nextInt();

        double amount = principal * Math.pow((1 + (rate / n)), (n * t));
        double CI = amount + principal;
        System.out.println("Amount is " + amount);
        System.out.println("Compound Interest is " + CI);
        scanner.close();
    }
}