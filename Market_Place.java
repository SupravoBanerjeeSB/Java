import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();
        double bill = 0.0;

        System.out.println("Welcome to the Store!\n");

        while (true) {
            System.out.println("What would you like to buy?");
            System.out.println("1. Milk......₹30");
            System.out.println("2. Chocolate......₹15");
            System.out.println("3. Chips......₹10");
            System.out.println("4. Coca Cola......₹80");
            System.out.println("5. Water Bottle......₹7");
            System.out.println("6. Cookies......₹10");
            System.out.println("7. Noodles......₹45");
            System.out.println("8. Tea......₹5");
            System.out.println("9. View Cart");
            System.out.println("10. Checkout");

            System.out.print("Press the number: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cart.add("Milk");
                    bill += 30;
                    System.out.println("You have added Milk to your cart.");
                    break;
                case 2:
                    cart.add("Chocolate");
                    bill += 15;
                    System.out.println("You have added Chocolate to your cart.");
                    break;
                case 3:
                    cart.add("Chips");
                    bill += 10;
                    System.out.println("You have added Chips to your cart.");
                    break;
                case 4:
                    cart.add("Coca Cola");
                    bill += 80;
                    System.out.println("You have added Coca Cola to your cart.");
                    break;
                case 5:
                    cart.add("Water Bottle");
                    bill += 7;
                    System.out.println("You have added Water Bottle to your cart.");
                    break;
                case 6:
                    cart.add("Cookies");
                    bill += 10;
                    System.out.println("You have added Cookies to your cart.");
                    break;
                case 7:
                    cart.add("Noodles");
                    bill += 45;
                    System.out.println("You have added Noodles to your cart.");
                    break;
                case 8:
                    cart.add("Tea");
                    bill += 5;
                    System.out.println("You have added Tea to your cart.");
                    break;
                case 9:
                    System.out.println("Your Cart:");
                    for (String item : cart) {
                        System.out.println(item);
                    }
                    System.out.println("Total Bill: ₹" + bill);
                    break;
                case 10:
                    System.out.println("Your Cart:");
                    for (String item : cart) {
                        System.out.println(item);
                    }
                    System.out.println("Total Bill: ₹" + bill);
                    System.out.println("Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}