package OperatorsandExpressions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */

public class fiveOrSeven {
    public static  void main(String[] args){
        while (true) {

        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        boolean fiveOrSeven= true;
        if((n%5==0)&&(n%7==0)) {
            System.out.println(n+" is "+fiveOrSeven);
        }
        else{
            fiveOrSeven=false;
            System.out.println(n+" is "+fiveOrSeven);

        }
    }
}
}