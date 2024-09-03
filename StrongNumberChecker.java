import java.util.Scanner;

public class StrongNumberChecker {
    
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (isStrongNumber(number)) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}
