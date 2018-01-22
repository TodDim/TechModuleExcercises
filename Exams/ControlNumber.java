package Exams;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 3.9.2017 г..
 */
public class ControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        byte n = scanner.nextByte();
        System.out.println("Enter M");
        byte m = scanner.nextByte();
        System.out.println("Enter control");
        int control = scanner.nextInt();
        int current = 0;
        int combinations = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = m; j > 0; j--) {
                    current += i * 2 + j * 3;
                    combinations++;
                    if (current>=control)
                        break;
                }
            }

        if (current >= control) {
            System.out.printf("%d moves%n", combinations);
            System.out.printf("Score: %d >= %d%n", current, control);
        } else {
            System.out.printf("%d moves", combinations);
        }
    }
}