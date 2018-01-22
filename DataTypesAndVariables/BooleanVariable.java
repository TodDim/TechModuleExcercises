package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean bvar = Boolean.parseBoolean(word);
        if (bvar == true) {
            System.out.println("Yes");
        } else if (bvar == false) System.out.println("No");
    }
}