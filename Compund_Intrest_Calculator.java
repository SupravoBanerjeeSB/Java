import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		
		// Compound intrest calculator
		
		Scanner scanner = new Scanner(System.in);

		double principal;
		double rate;
		int timesCompund;
		int years;
		double amount;

		System.out.print("Enter the principal: ");
		principal = scanner.nextDouble();

		System.out.print("Enter the rate (in %): ");
		rate = scanner.nextDouble() / 100;
		
		System.out.print("Enter the number of compunded per year: ");
		timesCompund = scanner.nextInt();
		
		System.out.print("Enter the number of years: ");
		years = scanner.nextInt();
		
		amount = principal * Math.pow(1 + rate / timesCompund, timesCompund + years);
		
		System.out.printf("The amount after %d years is ₹%.2f", years, amount);

		scanner.close();
	}
}
