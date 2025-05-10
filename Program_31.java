// Banking Program

import java.util.Scanner;

public class Program_31 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRunning = true;
        double balance = 0;
        while (isRunning) {
            System.out.println("Welcome To Jaat Bank");
            System.out.println("********************");
            System.out.println("1. Check current Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit Bank");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Wrong Choice!!! Try Again!!!");
            }

        }
        System.out.println("Thanking For Visiting!!!");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("₹%.2f\n", balance);
    }

    static double deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be Negative!!!");
            return 0;
        } else {
            System.out.println(amount + " successfully deposited to your bank account");
            return amount;
        }
    }

    static double withdraw(double balance)
    {
        System.out.print("Enter amount to withdraw: ");
        double amount=scanner.nextInt();
        if(amount<0)
        {
            System.out.println("Amount can't be Negative");
            return 0;
        }
        else if(balance<amount)
        {
            System.out.println("Insufficient Balance");
            return 0;
        }
        else
        {
            System.out.println(amount+" successfully withdrawn from your bank account");
            return amount;
        }
    }
}
