import java.util.Scanner;

public class ButtonExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double a, b, result = 0; // Initialize result to avoid compilation error
		char ch;

		while (true) {
			System.out.println("Enter first number: ");
			a = scanner.nextDouble();

			System.out.println("Enter operator (+, -, *, /): ");
			ch = scanner.next().charAt(0); // Fix: Use `next().charAt(0)` to read a character

			System.out.println("Enter second number: ");
			b = scanner.nextDouble();

			// Fix: Proper switch syntax and logic
			switch (ch) {
			case '+':
				result = a + b;
				break;

			case '-':
				result = a - b;
				break;

			case '*':
				result = a * b;
				break;

			case '/':
				if (b != 0) { // Check for division by zero
					result = a / b;
				} else {
					System.out.println("Error: Division by zero is not allowed.");
					return; // Exit program if division by zero
				}
				break;

			default:
				System.out.println("Error: Invalid operator");
				return; // Exit program for invalid operator
			}

			System.out.println("Result: " + result); // Correct output
		}
	}
}
