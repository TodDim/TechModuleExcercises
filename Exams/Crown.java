package Exams;

import java.util.Scanner;
public class Crown {
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        byte n = scanner.nextByte();
        boolean con = true;
        if ((n > 50) || (n < 8)) {
            System.out.println("wrong number");
            con = false;
        }
        if (con == true) {
            for (int i = 0; i < 2 * n - 1; i++) {
                if ((i == 0) || (i == n * 2 - 2) || (i == n)) {
                    System.out.print("@");
                    System.out.print(repeat(" ", n - 2));
                }
            }
            System.out.println();
            for (int i = 0; i < 2 * n - 1; i++) {
                if ((i == 0) || (i == n * 2 - 3)) {
                    System.out.print("**");
                    System.out.print(repeat(" ", n - 3));
                }
                if (i == n) {
                    System.out.print("*");
                    System.out.print(repeat(" ", n - 3));
                }
            }
            System.out.println();
            for (int i = 0; i < n / 2; i++) {
                if (i == n / 2 - 2) {
                    System.out.print("*");
                    System.out.print(repeat(".", i + 1));
                    System.out.print("*");
                    System.out.print(repeat(".", 1 + 2 * i));
                    System.out.print("*");
                    System.out.print(repeat(".", i + 1));
                    System.out.print("*");
                    System.out.println();
                    continue;
                }
                if (i == n / 2 - 1) {
                    System.out.print("*");
                    System.out.print(repeat(".", i + 1));
                    System.out.print(repeat("*", i - 1));
                    System.out.print(".");
                    System.out.print(repeat("*", i - 1));
                    System.out.print(repeat(".", i + 1));
                    System.out.print("*");
                    System.out.println();
                    continue;
                }

                System.out.print("*");
                System.out.print(repeat(".", i + 1));
                System.out.print("*");
                System.out.print(repeat(" ", n - 5 - 2 * i));
                System.out.print("*");
                System.out.print(repeat(".", 1 + 2 * i));
                System.out.print("*");
                System.out.print(repeat(" ", n - 5 - 2 * i));
                System.out.print("*");
                System.out.print(repeat(".", i + 1));
                System.out.print("*");
                System.out.println();
            }
            System.out.println(repeat("*", n * 2 - 1));
            System.out.print(repeat("*", n * 2 - 1));
        }
    }
}