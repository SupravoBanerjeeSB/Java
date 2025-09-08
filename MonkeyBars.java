import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		 Random random = new Random();
       Scanner scanner = new Scanner(System.in);
		
		System.out.println("9 player will be eliminate and 1 will survive.");
		
		while (true)
		{
			int playerNum;
            String UserInput;
			
			System.out.println("\nEnter Any Key To Elimiate One Player: ");
			UserInput = scanner.nextLine();
			playerNum = random.nextInt(10) + 1;
			System.out.println("\n\nPlayer " + playerNum + " Eliminated!");
		}
	}
}
