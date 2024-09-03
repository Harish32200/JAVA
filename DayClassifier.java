import java.util.Scanner;

public class DayClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().trim(); // Read the input and trim any extra spaces
        scanner.close();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It’s a weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It’s a weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
