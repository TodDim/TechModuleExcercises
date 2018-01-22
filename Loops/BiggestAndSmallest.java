package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 12.7.2017 г..
 */
public class BiggestAndSmallest {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter the count of the numbers ");
        int n=scanner.nextInt();
        int smallest= Integer.MAX_VALUE;
        int biggest= Integer.MIN_VALUE;
        for (int i=1;i<=n;i++){
            System.out.print("Enter number"+i+": ");
            int number=scanner.nextInt();
            if (number<smallest){
                smallest=number;
            }
            else if ( number>biggest  ){
                biggest=number;
            }
        }
        System.out.println( "The smallest number is "+smallest);
        System.out.println( "The biggest number is "+biggest);
    }
}
