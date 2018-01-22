package DataTypesAndVariables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by tydimitrov on 3.10.2017 г..
 */
public class DifferentIntegersSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sizeOfInteger(scanner.nextLine());
    }

    public static void sizeOfInteger(String m) {

        try {
          long n=  Long.parseLong(m);

            System.out.println(n + " can fit in:");
            if (n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE) {
                System.out.printf("* byte%n* short%n* int%n* long");
            } else if (n <= Short.MAX_VALUE && n >= Short.MIN_VALUE) {
                System.out.printf("* short%n* int%n* long");
            } else if (n <= Integer.MAX_VALUE && n >= Integer.MIN_VALUE) {
                System.out.printf("* int%n* long%n");
            } else if (n <= Long.MAX_VALUE && n >= Long.MIN_VALUE) {
                System.out.printf("* long%n");
            }
        } catch (IndexOutOfBoundsException exc) {
            System.out.println(m+" can't fit in any type");
        }

    }

}

