// NUMBER GUESSING GAME

import java.util.*;

public class Program_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess, attempts = 0, randomNumber;

        randomNumber = random.nextInt(1, 101);

        System.out.println("Welcome to number guessing game");
        System.out.println("Guess number between 1-100");

        do {
            System.out.print("What is Your Guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomNumber)
                System.out.println("\nTOO HIGH!! Try Again");
            else if (guess < randomNumber)
                System.out.println("\nTOO LOW!! Try Again");
            else {
                System.out.println("\nYou guessesed it right... The number was " + guess);
                System.out.println("You took " + attempts + " attempts");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
