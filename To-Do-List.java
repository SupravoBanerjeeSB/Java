import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();

		while (true) {
			System.out.println("--To-Do-List--");
			System.out.println("1. Add Task.");
			System.out.println("2. Remove Task.");
			System.out.println("3. View Tasks.");
			System.out.println("4. Exit.");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:

				System.out.println("Enter a task to add: ");
				String addTask = scanner.nextLine();
				tasks.add(addTask);

				System.out.println("Task added: " + addTask);

				break;

			case 2:

				System.out.println("Enter the task number to remove:");
				for (int i = 0; i < tasks.size(); i++) {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}
				int removeIndex = scanner.nextInt() - 1;
				scanner.nextLine(); // Consume the newline
				if (removeIndex >= 0 && removeIndex < tasks.size()) {
					String removedTask = tasks.remove(removeIndex);
					System.out.println("Removed task: " + removedTask);
				} else {
					System.out.println("Invalid task number.");
				}
				break;

			case 3:
				System.out.println("--Your Tasks--");
				if (tasks.isEmpty()) {
					System.out.println("No tasks to show.");
				} else {
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println((i + 1) + ". " + tasks.get(i));
					}
				}
				break;

			case 4:
				System.out.println("Exiting To-Do List...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}

		}
	}
}
