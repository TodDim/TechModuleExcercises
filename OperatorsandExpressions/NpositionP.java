package OperatorsandExpressions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */
public class NpositionP {
    public static  void main(String[] args){
        while (true) {
            Scanner scanner= new Scanner(System.in);
            short n = scanner.nextShort();
            short p = scanner.nextShort();
            short newNumber= (short) (n>>p);
//            System.out.println( newNumber);
//            System.out.println( number);

            if((newNumber&1)==1) {
                System.out.println(p+" bit is 1 ");
            }
            else{

                System.out.println(p+" bit is 0 ");

            }
        }
    }
}

