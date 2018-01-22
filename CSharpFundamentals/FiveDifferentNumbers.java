package CSharpFundamentals;

import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class FiveDifferentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a = scanner.nextByte();
        byte b = scanner.nextByte();
        int count = 0;
        for (int i = a; i <= b - 4; i++) {
            for (int j = a + 1; j <= b - 3; j++) {
                for (int k = a + 2; k <= b - 2; k++) {
                    for (int l = a + 3; l <= b - 1; l++) {
                        for (int m = a + 4; m <= b; m++) {
                            if ((i < j) && (j < k) && (k < l) && (l < m)) {
                                count++;
                                System.out.printf("%d %d %d %d %d%n", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }
        if (count == 0)
            System.out.println("No");
    }
}