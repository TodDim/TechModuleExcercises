package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 13.7.2017 г..
 */
public class Matrix {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter N ");
        int n=scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n+i-1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
