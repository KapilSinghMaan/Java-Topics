import java.util.Scanner;

public class Program_74 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int temp = num;
        int digit = (int) Math.floor(Math.log10(num)) + 1;
        int newnum = 0;
        while (num != 0) {
            int a = num % 10;
            newnum += Math.pow(a, digit);
            num /= 10;
        }
        if (newnum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
        scanner.close();
    }
}
