package OperatorsandExpressions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */
public class Trapets {
    public static  void main(String[] args){
        while (true) {

            Scanner scanner= new Scanner(System.in);
            short a = scanner.nextShort();
            short b = scanner.nextShort();
            short h = scanner.nextShort();
            System.out.println("area is "+ (a+b)/2*h);

        }
    }
}

