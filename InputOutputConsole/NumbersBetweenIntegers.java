package InputOutputConsole;

import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class NumbersBetweenIntegers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y= scanner.nextInt();
        int number=0;
        for (int i = x; i <=y ; i++) {
            if ( i%5==0){
                number++;
            }
        }
        System.out.println( "Number of integers who divide by 5 is "+number);

    }
}

