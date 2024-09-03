import java.util.Scanner;

public class AlternatingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            int start = i % 2; // Determine the starting value for this row
            for (int j = 0; j < i; j++) {
                System.out.print(start + " ");
                start = 1 - start; // Alternate between 1 and 0
            }
            System.out.println();
        }
    }
}
