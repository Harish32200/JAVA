
import java.util.Scanner;
public class EmployeeSalaryCalculator {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hourly wage: ");
        double hourlyWage = getValidDouble(scanner);
        System.out.print("Enter hours worked per week: ");
        double hoursWorkedPerWeek = getValidDouble(scanner);
        System.out.print("Enter number of weeks worked: ");
        int numberOfWeeks = getValidInt(scanner);
        double totalSalary = calculateTotalSalary(hourlyWage, hoursWorkedPerWeek, numberOfWeeks);
        System.out.printf("Total salary: $%.2f%n", totalSalary);
        scanner.close();
    }
    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid number: ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        return value >= 0 ? value : getValidDouble(scanner);
    }
    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        return value >= 0 ? value : getValidInt(scanner);
    }
    private static double calculateTotalSalary(double hourlyWage, double hoursWorkedPerWeek, int numberOfWeeks) {
        if (hoursWorkedPerWeek < 0) hoursWorkedPerWeek = 0;

        double regularHours = Math.min(hoursWorkedPerWeek, 40);
        double overtimeHours = Math.max(hoursWorkedPerWeek - 40, 0);

        double weeklySalary = (regularHours * hourlyWage) + (overtimeHours * hourlyWage * 1.5);
        if (hoursWorkedPerWeek < 20) weeklySalary *= 0.9;
        return weeklySalary * numberOfWeeks;
    }
}

                                                                                                                                                                                                                                              
