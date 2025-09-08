import java.util.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double fahrenheit;

		System.out.print("Enter Temperarture In Celsius: ");
		double celsius = scanner.nextDouble();

		fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("\n" + celsius + "°C is " + fahrenheit + "°F");
	}
}
