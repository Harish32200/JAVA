import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        Set<Integer> nums = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        
        int original = scanner.nextInt();
        scanner.close();
        
        while (nums.contains(original)) {
            original *= 2;
        }
        
        System.out.println(original);
    }
}
