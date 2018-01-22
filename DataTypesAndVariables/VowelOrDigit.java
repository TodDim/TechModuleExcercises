package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol =scanner.next().charAt(0);
        if (symbol=='a'||symbol=='e'||symbol=='i'||symbol=='o'||symbol=='u'){
            System.out.println("vowel");
        }
        else if ( symbol>=48&&symbol<=57  ){
            System.out.println("digit");
        }
        else System.out.println("other");
    }
}
