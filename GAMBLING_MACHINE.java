import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double balance = 100;

        System.out.println("****************************************");
        System.out.println("Hello, This is a GAMBLING MACHINE!");
        System.out.println("You can put your amount and it might get doubled!");
        System.out.println("You have 50% chance to lose and 50% to win!");
        System.out.println("Press 'e' to exit and 'v' to see your final money.");
        System.out.println("****************************************");

        while (true) {
            System.out.println("\nYour current balance: $" + balance);
            System.out.print("Enter Amount To Gamble (or 'e' to exit, 'v' to view balance): ");
            
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("e")) {
                System.out.println("Exiting the Gambling Machine...");
                break;
            } else if (userInput.equalsIgnoreCase("v")) {
                System.out.println("Your final balance: $" + balance);
                continue;
            }

            double inputAmount;

            try {
                inputAmount = Double.parseDouble(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (inputAmount <= 0) {
                System.out.println("Please enter a positive amount.");
                continue;
            }

            if (inputAmount > balance) {
                System.out.println("Insufficient balance!");
                continue;
            }

            boolean isWin = random.nextBoolean();

            if (isWin) {
                balance += inputAmount;
                System.out.println("Congratulations! You won $" + inputAmount + ". New balance: $" + balance);
            } else {
                balance -= inputAmount;
                System.out.println("Oops! You lost $" + inputAmount + ". New balance: $" + balance);
            }

            if (balance <= 0) {
                System.out.println("You have run out of money. Game Over!");
                break;
            }
        }

        scanner.close();
    }
}
