package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class ExchangeVariableNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int five=5;
        int ten=10;
        System.out.println("Before:");
        System.out.println("a = "+five);
        System.out.println("b = "+ten);
        int temp=5;
        five=ten;
        ten=temp;
        System.out.println("After:");
        System.out.println("a = "+five);
        System.out.println("b = "+ten);
    }
}