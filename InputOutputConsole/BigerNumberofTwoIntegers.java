package InputOutputConsole;

import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class BigerNumberofTwoIntegers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter first number");
        int x=scanner.nextInt();
        System.out.println( "Enter first number");
        int y= scanner.nextInt();
        int biggerNimber=x;
        if (y>x){
            biggerNimber=y;
        }
        System.out.println( "Bigger number is "+biggerNimber);

    }
}
