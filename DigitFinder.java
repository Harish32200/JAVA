import java.util.Scanner;

public class DigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int minDigit = 9;
        int maxDigit = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n /= 10;
        }

        System.out.println(minDigit + " " + maxDigit);
    }
}
