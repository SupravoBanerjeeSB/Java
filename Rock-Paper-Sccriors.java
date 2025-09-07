import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] rps = {"r", "p", "s"};
		String computerMove = rps[new Random().nextInt(rps.length)];

		Scanner scanner = new Scanner(System.in);
		String playerMove = "";

		while (true) {
			System.out.println("Enter your move (r for rock, p for paper, s for scissors): ");
			playerMove = scanner.nextLine();

			if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
				break;
			}

			System.out.println(playerMove + " is not valid!");
		}
		if (playerMove.equals(computerMove)) {
			System.out.println("It is a tie!");
		} else if (playerMove.equals("r")) {
			if (computerMove.equals("p")) {
				System.out.println("You lose! Paper beats rock.");
			} else {
				System.out.println("You win! Rock beats scissors.");
			}
		} else if (playerMove.equals("p")) {
			if (computerMove.equals("s")) {
				System.out.println("You lose! Scissors beat paper.");
			} else {
				System.out.println("You win! Paper beats rock.");
			}
		} else if (playerMove.equals("s")) {
			if (computerMove.equals("r")) {
				System.out.println("You lose! Rock beats scissors.");
			} else {
				System.out.println("You win! Scissors beat paper.");
			}
		}
	}
}
