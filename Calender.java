import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Calendar
{
    public static void main(String[] args)
	{
        LocalDate currentDate = LocalDate.now();
        YearMonth currentYearMonth = YearMonth.from(currentDate);

        Scanner scanner = new Scanner(System.in);

        while (true)
		{
            printCalendar(currentYearMonth, currentDate);
            System.out.println("Current Date: " + currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            System.out.println("Current Year: " + currentDate.getYear());
            System.out.println("Current Week: " + currentDate.get(java.time.temporal.IsoFields.WEEK_OF_WEEK_BASED_YEAR));

            System.out.println("1. Go to next month");
            System.out.println("2. Go to previous month");
            System.out.println("3. Go to specific month and year");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option)
			{
                case 1:
                    currentYearMonth = currentYearMonth.plusMonths(1);
                    break;
                case 2:
                    currentYearMonth = currentYearMonth.minusMonths(1);
                    break;
                case 3:
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter month (1-12): ");
                    int month = scanner.nextInt();
                    currentYearMonth = YearMonth.of(year, month);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void printCalendar(YearMonth yearMonth, LocalDate currentDate)
	{
        System.out.println(yearMonth.getYear() + " - " + yearMonth.getMonth());
        System.out.println("Su Mo Tu We Th Fr Sa");

        int firstDayOfWeek = yearMonth.atDay(1).getDayOfWeek().getValue();
        for (int i = 1; i < firstDayOfWeek; i++)
		{
            System.out.print("   ");
        }

        for (int day = 1; day <= yearMonth.lengthOfMonth(); day++)
		{
            if (day == currentDate.getDayOfMonth() && yearMonth.getYear() == currentDate.getYear() && yearMonth.getMonth() == currentDate.getMonth())
			{
                System.out.printf("(%2d) ", day);
            }
			else
			{
                System.out.printf("%2d ", day);
            }

            if ((day + firstDayOfWeek - 1) % 7 == 0)
			{
                System.out.println();
            }
        }

        System.out.println();
    }
}
