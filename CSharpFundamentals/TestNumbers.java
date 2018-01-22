package CSharpFundamentals;

import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class TestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        int maxSumBoundary = scanner.nextInt();
        int count = 0;
        int totalSum = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= m; j++) {
                if (totalSum >= maxSumBoundary) {
                    break;
                }
                totalSum += 3 * (i * j);
                count++;
            }
        }
        System.out.printf("%d combinations%n", count);
        if (totalSum <= maxSumBoundary) {
            System.out.printf("Sum: %d%n", totalSum, maxSumBoundary);
        }
        else{
            System.out.printf("Sum: %d >= %d%n", totalSum, maxSumBoundary);
        }
    }
}