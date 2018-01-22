package OperatorsandExpressions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 10.7.2017 г..
 */
public class Rectangle {
    public static  void main(String[] args){
        while (true) {

            Scanner scanner= new Scanner(System.in);
            short a = scanner.nextShort();
            short b = scanner.nextShort();
                System.out.println("area is "+ a*b);
                System.out.println("perimeter is " + (a+b)*2);
            }
        }
    }



