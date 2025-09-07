import java.util.Scanner;

class Banking_System {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double balance = 0.0;

		while (true) {
			System.out.println("---Bank!---");
			System.out.println("\n1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. View Money");
			System.out.println("4. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the amount of deposit: ");
				double depositAmount = scanner.nextDouble();

				balance += depositAmount;
				System.out.println("deposited " + depositAmount);

				break;

			case 2:
				System.out.println("Enter the amount of Withdraw: ");
				double  withdrawAmount = scanner.nextDouble();

				if (withdrawAmount > balance) {
					System.out.println("isufficient funds");

				} else {
					balance -= withdrawAmount;
					System.out.println("withdrew: " + withdrawAmount);
				}
				break;

			case 3:
				System.out.println("Your current balance is: " + balance);
				break;

			case 4:
				System.out.println("Thanks for using the bank!");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

