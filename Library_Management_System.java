import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("Welcome to Library Management System.");
        System.out.println("************************************");

        while (true) {
            System.out.println("\n1. Add Books");
            System.out.println("2. Remove Books");
            System.out.println("3. View Books");
            System.out.println("4. Exit\n");
            System.out.print("Enter your Option: ");
            int Option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (Option) {
                case 1:
                    System.out.print("Enter the name of the Book: ");
                    String bookName = scanner.nextLine();
                    System.out.println(bookName + " is successfully added.");
                    book.add(bookName);
                    break;
                case 2:
                    if (book.isEmpty()) {
                        System.out.println("No books available to remove.");
                        break;
                    }
                    System.out.print("Enter the book name to remove: ");
                    String booknameRemove = scanner.nextLine();
                    if (book.contains(booknameRemove)) {
                        book.remove(booknameRemove);
                        System.out.println(booknameRemove + " was removed successfully.");
                    } else {
                        System.out.println(booknameRemove + " not found in the library.");
                    }
                    break;
                case 3:
                    if (book.isEmpty()) {
                        System.out.println("No books available.");
                        break;
                    }
                    System.out.println("List of all the books -->");
                    for (String b : book) {
                        System.out.println(b);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}