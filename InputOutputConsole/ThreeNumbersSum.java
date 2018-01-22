package InputOutputConsole;

import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class ThreeNumbersSum {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y= scanner.nextInt();
        int z=scanner.nextInt();
        System.out.printf( "%d + %d+ %d = %d",x,y,z,x+y+z);

    }
}
