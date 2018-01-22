package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by tydimitrov on 3.10.2017 г..
 */
public class PrintPartOfTheAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startCharIndex=scanner.nextInt();
        int endCharIndex=scanner.nextInt();
        for (char i = (char)startCharIndex; i <=(char)endCharIndex ; i++) {
            System.out.print(i+" ");
        }
    }
}