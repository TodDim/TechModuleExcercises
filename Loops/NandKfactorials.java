package Loops;

import java.util.Scanner;
//N!*K!/(N-K)! за дадени N и K.
/**
 * Created by tydimitrov on 12.7.2017 г..
 */
public class NandKfactorials {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter N ");
        int n=scanner.nextInt();
        System.out.print( "Enter K ");
        int k=scanner.nextInt();
        int x=Math.abs(n-k);
        int Kfactorial=1;
        int Xfactorial=1;
        int SUM=1;
        for (int i = 1; i <=k ; i++) {
            Kfactorial*=i;
        }
        for (int i = 1; i <=x ; i++) {
            Xfactorial*=i;
        }
        int MidSum=Kfactorial*Kfactorial/Xfactorial;
        for (int i = k+1; i <=n ; i++) {
            MidSum*=i;
        }
        System.out.print( "N!*K!= "); System.out.println( MidSum);
        System.out.print("(N-K)!");

    }
}
