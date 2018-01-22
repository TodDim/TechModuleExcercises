package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 12.7.2017 г..
 */
public class PrintNumbers1toN {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while ( i<=n){
            System.out.println( i);
            i++;
        }
    }
}
