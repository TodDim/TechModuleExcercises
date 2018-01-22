package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first=scanner.next().charAt(0);
        char second=scanner.next().charAt(0);
        char third =scanner.next().charAt(0);
        System.out.printf("%s%s%s",third,second,first);
    }
}