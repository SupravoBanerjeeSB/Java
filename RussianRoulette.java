import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Coin Toss
        System.out.println("Welcome to Russian Roulette!");
        System.out.println("Let's do a coin toss to decide who goes first.");
        System.out.print("Choose Heads or Tails (h/t): ");
        String choice = scanner.nextLine().toLowerCase();

        boolean isHeads = random.nextBoolean(); // true = Heads, false = Tails
        boolean player1Turn;

        if ((isHeads && choice.equals("h")) || (!isHeads && choice.equals("t"))) {
            System.out.println("You won the toss! You will go first.");
            player1Turn = true;
        } else {
            System.out.println("You lost the toss! Your opponent will go first.");
            player1Turn = false;
        }

        // Spin the barrel once
        int bulletPosition = random.nextInt(6) + 1;
        int currentChamber = random.nextInt(6) + 1;

        System.out.println("\nSpinning the barrel... The game begins!");

        // Alternating Turns
        while (true) {
            System.out.println("\n" + (player1Turn ? "Your" : "Opponent's") + " turn. Press Enter to pull the trigger...");
            scanner.nextLine(); // Wait for user to press Enter

            System.out.println("Pulling the trigger...");
            if (currentChamber == bulletPosition) {
                System.out.println("BANG! " + (player1Turn ? "You lost!" : "Your opponent lost! You win!"));
                break;
            } else {
                System.out.println("Click! Safe...");
                currentChamber = (currentChamber % 6) + 1; // Move to the next chamber
                player1Turn = !player1Turn; // Switch turns
            }
        }

        System.out.println("Game over.");
        scanner.close();
    }
}
