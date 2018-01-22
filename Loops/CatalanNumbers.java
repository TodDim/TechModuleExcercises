package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 13.7.2017 г..
 */
public class CatalanNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter N ");
        int n=scanner.nextInt();
        int N2factorial=1;
        int Nplus1factorial=1;
        int Nfactorial=1;
        for (int i = 1; i <=2*n ; i++) {
            N2factorial*=i;
        }
        for (int i = 1; i <=n+1 ; i++) {
            Nplus1factorial*=i;
        }
        for (int i = 1; i <=n ; i++) {
            Nfactorial*=i;
        }
        int Number=N2factorial/(Nplus1factorial*Nfactorial);
        System.out.printf( "%dth catalan number is: ",n); System.out.println( Number);
    }
}
