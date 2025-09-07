import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int upperBound = 100;
		int lowerBound = 1;
		int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
		int attempts = 0;
		int maxAttempts = 10;

		System.out.println("********************");
		System.out.println("Number-Guessing-Game");
		System.out.println("********************");

		System.out.println("I have guessed a number between 1 to 100 try\nto guess it in 10 attempts. (Press 0 to exit.)");

		while (attempts < maxAttempts)
		{
			System.out.print("Enter your guess: ");
			int guess = scanner.nextInt();
			attempts++;

			if (guess == secretNumber)
			{
				System.out.println("Congratulations! You have find the number in " + attempts + " attempts");
			}
			else if (guess < secretNumber)
			{
				System.out.println("Too Low! Try again.");
			}
			else
			{
				System.out.println("Too High! Try again");
			}

			if (attempts == maxAttempts)
			{
				System.out.print("Sorry, you ran out of attempts! The secret number was: " + secretNumber);
			}
		}
	}
}
