package com.company;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        while (true){
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
       int divider=2;
       int maxDivider= (int)Math.sqrt(number);
       boolean isPrime = true;

       while (  isPrime&&(divider<=maxDivider)){
           if ( number%divider==0){
               isPrime=false;
           }
           divider++;
       }
        System.out.println( isPrime? "Prime " : "Not Prime ");
    }
}}