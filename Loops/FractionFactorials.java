package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 13.7.2017 г..
 */
public class FractionFactorials {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter N ");
        int n=scanner.nextInt();
        System.out.print( "Enter X ");
        double x=scanner.nextInt();
        int Nfactorial=1;
        double XPow=x;
        double SUM= 1+1/x;
        for (int i = 2; i <=n ; i++) {
            Nfactorial*=i;
            XPow*=x;
            SUM=SUM+(Nfactorial/XPow);
        }
        System.out.print( "n!/x^n= "); System.out.println( SUM);
    }
}
