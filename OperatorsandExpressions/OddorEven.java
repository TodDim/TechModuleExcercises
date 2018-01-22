package OperatorsandExpressions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */

public class OddorEven {
    public static  void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    int n = scanner.nextInt();
    if(n%2==0) {
        System.out.println(n+" is even");
    }
        else{
            System.out.println(n+" is odd");
        }
    }
}
