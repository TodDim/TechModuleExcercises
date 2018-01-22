package Loops;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter N ");
        int n=scanner.nextInt();
        int sum=1;
        int member;
        int previous=1;
        int secondprevious=0;
        for (int i = 3; i <= n; i++) {
         member=previous+secondprevious;
         sum=sum+member;
         secondprevious=previous;
         previous=member;

//            System.out.println( member);
        }
        System.out.printf("sum of first %d Fibonacci numbers is %d",n,sum);
    }
}
