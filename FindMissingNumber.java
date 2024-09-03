import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N - 1];
        
        int actualSum = 0;
        for (int i = 0; i < N - 1; i++) {
            arr[i] = scanner.nextInt();
            actualSum += arr[i];
        }
        
        scanner.close();
        
        int expectedSum = N * (N + 1) / 2;
        int missingNumber = expectedSum - actualSum;
        
        System.out.println(missingNumber);
    }
}
