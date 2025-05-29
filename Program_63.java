// Hangman Game in Java

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program_63 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("hangmanWords.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not located!!");
        } catch (IOException e) {
            System.out.println("Something went wrong!!!");
        }
        String word = words.get(random.nextInt(words.size()));

        ArrayList<Character> wordState = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        int wrongGuess = 0;
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("Welcome to Hangman Game!!!");
        System.out.println("*****************");
        System.out.println("*****************\n");
        while (wrongGuess < 6) {

            if (wrongGuess > 0) {
                System.out.println(hangmanArt(wrongGuess));
            }

            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.print("\n\nEnter your guess: ");
            char guess = scanner.next().toLowerCase().charAt(0);
            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct Guess!!!");
                for (int i = 0; i < word.length(); i++) {
                    if (guess == word.charAt(i)) {
                        wordState.set(i, guess);
                    }
                }
                if (!wordState.contains('_')) {
                    System.out.println(hangmanArt(wrongGuess));
                    System.out.println("You Won");
                    System.out.println("Correct word was " + word);
                    break;
                }
            } else {
                System.out.println("Wrong Guess!!!");
                wrongGuess++;
            }
        }
        if (wrongGuess >= 6) {
            System.out.println("\n" + hangmanArt(wrongGuess));
            System.out.println("Game Over");
            System.out.println("Correct word was " + word);
        }
        scanner.close();
    }

    static String hangmanArt(int wrongGuess) {
        return switch (wrongGuess) {
            case 0 -> "\nYou Guessed in one take";
            case 1 -> """
                     o


                    """;
            case 2 -> """
                     o
                    /

                     """;
            case 3 -> """
                     o
                    /|

                     """;
            case 4 -> """
                     o
                    /|\\

                     """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default ->
                "Something went wrong!!!";
        };
    }
}