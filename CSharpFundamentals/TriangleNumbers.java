package CSharpFundamentals;

import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class TriangleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n =scanner.nextByte();
        if ((n<=20)&&(n>=1)){
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}