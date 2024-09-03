import java.util.Scanner;

public class Zero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int lastNonZeroIndex = 0;
        
        for (int i = 0; i < N; i++) {
            if (arr[i] != 0) {
                arr[lastNonZeroIndex] = arr[i];
                lastNonZeroIndex++;
            }
        }
        
        for (int i = lastNonZeroIndex; i < N; i++) {
            arr[i] = 0;
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
