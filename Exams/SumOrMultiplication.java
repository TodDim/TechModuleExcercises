package Exams;

import java.util.Scanner;

public class SumOrMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter  number");
        int number = scanner.nextInt();
        int count = 0;
        for (int a = 1; a <= 28; a++) {
            for (int b = a + 1; b <= 29; b++) {
                for (int c = b + 1; c <= 30; c++) {
                    int sum = a + b + c;
                    if (sum == number) {
                        System.out.printf("%d + %d + %d = %d\n", a, b, c, number);
                        count++;
                    }
                }
            }
        }
        for (int a = 3; a <= 30; a++) {
            for (int b = 2; b < a; b++) {
                for (int c = 1; c < b; c++) {
                    int multiple = a * b * c;
                    if (multiple == number) {
                        System.out.printf("%d * %d * %d = %d\n", a, b, c, number);
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No!");
        }
    }
}
