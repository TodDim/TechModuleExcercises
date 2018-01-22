package Exams;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 3.9.2017 г..
 */
public class Parallelepiped {
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        byte n = scanner.nextByte();
        String side="\\~~~\\";
        String otherSide="|~~~|";
        System.out.print("+");
        System.out.print(repeat("~", n-2));
        System.out.print("+");
        System.out.println(repeat(".", 2*n+1-(n-5)));
        for (int i = 0; i <=2*n ; i++) {
            System.out.print("|");
            System.out.print(repeat(".", i));
            System.out.print(side);
            System.out.println(repeat(".", 2*n-i));
        }
        for (int i = 0; i <=2*n ; i++) {
            System.out.print(repeat(".", i));
            System.out.print("\\");
            System.out.print(repeat(".", 2*n-i));
            System.out.println(otherSide);
        }
        System.out.print(repeat(".", 2*n+1-(n-5)));
        System.out.print("+");
        System.out.print(repeat("~", n-2));
        System.out.print("+");
    }
}