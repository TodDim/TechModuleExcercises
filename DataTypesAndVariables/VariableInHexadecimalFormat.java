package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class VariableInHexadecimalFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n=scanner.nextLine();
        int m =Integer.decode(n);
        System.out.println(m);

    }
}