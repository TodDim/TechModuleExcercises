package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class IntegerToHexBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        String hex = Integer.toHexString(number);
        String binary = Integer.toBinaryString(number);
        System.out.println(hex.toUpperCase());
        System.out.println(binary);
    }
}