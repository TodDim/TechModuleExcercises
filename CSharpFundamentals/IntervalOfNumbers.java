package CSharpFundamentals;

import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte start = scanner.nextByte();
        byte end = scanner.nextByte();
        if (start < end) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = end; i <= start; i++) {
                System.out.println(i);
            }
        }
    }
}
