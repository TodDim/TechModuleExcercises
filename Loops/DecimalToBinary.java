package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 14.7.2017 г..
 */
public class DecimalToBinary {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter N ");
        int n=scanner.nextInt();
        String reversednumber="";
        while(n>0){
            if (    n%2==1){
                reversednumber=reversednumber+1;
                n/=2;
            }
            else {
                reversednumber=reversednumber+0;
                n/=2;
            }
        }
            String number= new StringBuffer(reversednumber).reverse().toString();
            System.out.println( number);

    }
}
