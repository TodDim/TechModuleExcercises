package OperatorsandExpressions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */
public class thirdDidigit {
    public static  void main(String[] args){
        while (true) {

            Scanner scanner= new Scanner(System.in);
            int n = scanner.nextInt();
            int n100=n/100;

            if((n100%10)==7) {
                System.out.println(n+"s third last digit is 7 ");
            }
            else{

                System.out.println(n+"s third last digit is not 7 ");

            }
        }
    }
}

