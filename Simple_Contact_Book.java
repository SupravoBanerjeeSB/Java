import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    double number;

    public Contact(String name, double number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Number: " + number;
    }
}

public class Contact_Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Contact Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Number: ");
                    double number = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    contacts.add(new Contact(name, number));
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        System.out.println("\n--- Contact List ---");
                        for (Contact contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the name of the contact to remove: ");
                    String removeName = scanner.nextLine();

                    boolean removed = false;
                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).name.equalsIgnoreCase(removeName)) {
                            contacts.remove(i);
                            removed = true;
                            System.out.println("Contact removed successfully!");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Contact Book. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
