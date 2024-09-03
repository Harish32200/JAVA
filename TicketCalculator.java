import java.util.Scanner;

public class TicketCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ticket type (Regular, VIP, Premium): ");
        String ticketType = scanner.nextLine().trim();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = getValidInt(scanner);

        double totalCost = calculateTotalCost(ticketType, numberOfTickets);


        if (totalCost < 0) {
            System.out.println("Invalid ticket type entered.");
        } else {
            System.out.printf("Total cost: $%.2f%n", totalCost);
        }

        scanner.close();
    }


    private static int getValidInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= 0) {
                    return value;
                } else {
                    System.out.print("Invalid input. Please enter a non-negative integer: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a valid integer: ");
                scanner.next();
            }
        }
    }

    private static double calculateTotalCost(String ticketType, int numberOfTickets) {
        double ticketPrice;
        double discount = 0;

        switch (ticketType.toLowerCase()) {
            case "regular":
                ticketPrice = 50;
                if (numberOfTickets > 10) {
                    discount = 0.10; 
                }
                break;
            case "vip":
                ticketPrice = 100;
                if (numberOfTickets > 5) {
                    discount = 0.15; 
                }
                break;
            case "premium":
                ticketPrice = 150;
                if (numberOfTickets > 3) {
                    discount = 0.20; 
                }
                break;
            default:
                return -1; 
        }

        double totalCost = numberOfTickets * ticketPrice;

        totalCost -= totalCost * discount;

        if (totalCost < 200) {
            totalCost += 20; 
        }

        return totalCost;
    }
}