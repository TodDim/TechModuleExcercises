package OperatorsandExpressions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */
public class thirdBit {
    public static  void main(String[] args){
        while (true) {

            Scanner scanner= new Scanner(System.in);
            short n = scanner.nextShort();
            short thirdBitNumber = 8192;
            short number = (short) (n&thirdBitNumber);
//            System.out.println( number);
            if(number!=0) {
                System.out.println(n+"s third bit is 1 ");
            }
            else{

                System.out.println(n+"s third bit is not 1 ");

            }
        }
    }
}

