// JAVA QUIZ GAME

import java.util.Scanner;

public class Program_38 {
    public static void main(String[] args) {

        String[] questions = { "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?" };

        String[][] options = {
                { "1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords" },
                { "1. CPU", "2. Hard Drive", "3. RAM", "4. GPU" },
                { "1. 2000", "2. 2004", "3. 2006", "4. 2008" },
                { "1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage" },
                { "1. COBOL", "2. C", "3. Fortran", "4. Assembly" } };

        int[] answers = { 3, 1, 2, 4, 3 };
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Quiz Game\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter Your Guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("**************");
                System.out.println("Correct!!");
                System.out.println("**************\n");
                score++;
            } else {
                System.out.println("**************");
                System.out.println("Wrong!!");
                System.out.println("**************\n");
            }
        }
        System.out.println("Your final score is " + score + " out of " + questions.length);
        scanner.close();
    }
}
