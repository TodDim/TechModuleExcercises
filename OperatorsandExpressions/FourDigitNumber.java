package OperatorsandExpressions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */
public class FourDigitNumber {
    public static  void main(String[] args){
        while (true) {
            Scanner scanner= new Scanner(System.in);
            short abcd = scanner.nextShort();
            short a= (short) (abcd/1000);
            short ab= (short) (abcd/100);
            short b= (short) (ab%10);
            short abc= (short) (abcd/10);
            short c= (short) (abc%10);
            short d= (short) (abcd%10);
            System.out.println( a);
            System.out.println( b);
            System.out.println( c);
            System.out.println( d);
            System.out.print(d);
            System.out.print(c);
            System.out.print(b);
            System.out.print(a);

//            if((n100%10)==7) {
//                System.out.println(n+"s third last digit is 7 ");
//            }
//            else{
//
//                System.out.println(n+"s third last digit is not 7 ");
//
//            }
        }
    }
}

