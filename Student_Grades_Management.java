import java.util.Scanner;

class Marks_Management {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numStudents;
		System.out.println("Enter the number of students: ");
		numStudents = scanner.nextInt();

		for (int i = 1; i <= numStudents; i++) {
			System.out.println("\nProcessing Student " + i);

			double Bengali, Math, English, result;

			System.out.println("Enter the marks of Bengali: ");
			Bengali = scanner.nextDouble();
			System.out.println("Enter the marks of English: ");
			English = scanner.nextDouble();
			System.out.println("Enter the marks of Math: ");
			Math = scanner.nextDouble();

			result = (Bengali + Math + English) / 3;
			System.out.println("Your average result is: " + result);

			if (Bengali > Math && Bengali > English) {
				System.out.println("You got highest on Bengali, Marks: " + Bengali);
			} else if (Math > English && Math > Bengali) {
				System.out.println("You got highest on Math, Marks: " + Math);
			} else if (English > Bengali && English > Math) {
				System.out.println("You got highest on English, Marks: " + English);
			} else {
				System.out.println("Same Marks!");
			}
			System.out.println("And you are");
			if (result >= 35.0) {
				System.out.println("PASS!");
			} else {
				System.out.println("FAIL!");
			}
		}

		System.out.println("\nAll students processed.");
	}

}
