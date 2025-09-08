import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		/*
		 * formula1: 1 kg = 2.20462 lbs
		 * formula2: 1 lbs = 0.453592 kg
		 */

		while (true)
		{
			double FORMULA_ONE, FORMULA_TWO;

			System.out.println("1. KG to LBS");
			System.out.println("2. LBS to KG\n");
			System.out.print("Enter your choice: ");
			int CHOICE = scanner.nextInt();

			if (CHOICE == 1)
			{
				System.out.print("Enter the weight in KG: ");
				double KG = scanner.nextDouble();
				FORMULA_ONE = KG * 2.20462;
				System.out.println("LBS: " + FORMULA_ONE + "\n");
			}
			else 
			{
				System.out.print("Enter the weight in LBS: ");
				double LBS = scanner.nextDouble();
				FORMULA_TWO = LBS *  0.453592;
				System.out.println("KG: " + FORMULA_TWO + "\n");
			}
		}
	}
}
