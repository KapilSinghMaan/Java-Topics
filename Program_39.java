// Rock Paper Scissors in java

import java.util.*;

public class Program_39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String choice[] = { "rock", "paper", "scissor" };
        String again = "yes", userMove, compMove;
        int total = 0, won = 0, lose = 0, draw = 0;
        do {
            System.out.print("Enter your choice(Rock, Paper, Scissor): ");
            userMove = scanner.nextLine().toLowerCase();
            compMove = choice[random.nextInt(3)];
            System.out.println("Your move: " + userMove);
            System.out.println("Computer move: " + compMove);
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissor")) {
                System.out.println("Invalid Input!! Try Again!!");
                continue;
            } else if ((userMove.equals("rock") && compMove.equals("scissor"))
                    || (userMove.equals("paper") && compMove.equals("rock"))
                    || userMove.equals("scissor") && compMove.equals("paper")) {
                System.out.println("Congratulation!!! You Won");
                total++;
                won++;
            } else if (userMove.equals(compMove)) {
                System.out.println("Match Draw");
                total++;
                draw++;
            } else {
                System.out.println("Oops!!! You Lose");
                total++;
                lose++;
            }
            System.out.print("Wanna play again? <yes/no>: ");
            again = scanner.nextLine().toLowerCase();
        } while (again.equals("yes"));
        System.out.println("Total Round(s) played: " + total);
        System.out.println("Total Round(s) won: " + won);
        System.out.println("Total Round(s) lost: " + lose);
        System.out.println("Total Round(s) Draw: " + draw);
        scanner.close();
    }
}