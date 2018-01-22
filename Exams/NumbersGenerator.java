package Exams;

import java.util.Scanner;

public class NumbersGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter M");
        byte m = scanner.nextByte();
        System.out.println("Enter N");
        byte n = scanner.nextByte();
        System.out.println("Enter L");
        byte l = scanner.nextByte();
        System.out.println("Enter Special");
        byte special = scanner.nextByte();
        System.out.println("Enter control number");
        short control = scanner.nextShort();
        String mnl = "" + m + "" + n + "" + l;
        int mnlNumber = Integer.parseInt(mnl);
        for (int i = mnlNumber; i >= 111; i--) {
            if (i % 3 == 0) {
                special += 5;
                continue;
            } else if (i % 10 == 5) {
                special -= 2;
                continue;
            } else if (i % 2 == 0) {
                special *= 2;
                continue;
            }
            if (special >= control) {
                System.out.printf("Yes! Control number was reached! Current special number is %d.\n", special);
                break;
            }
        }
        if (special < control) {
            System.out.printf("No! %d is the last reached special number.\n", special);
        }
    }
}