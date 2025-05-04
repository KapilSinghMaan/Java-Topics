// Taking user input in java

import java.util.*;

public class Program_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = sc.nextDouble();

        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);
        if (isStudent)
            System.out.println("You are enrolled as a student");
        else
            System.out.println("You are not enrolled");

        sc.close();
    }
}