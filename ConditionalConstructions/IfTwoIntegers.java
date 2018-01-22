package ConditionalConstructions;

import java.util.Scanner;

public class IfTwoIntegers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Enter x:");
        int x=scanner.nextInt();
        System.out.print( "Enter y:");
        int y= scanner.nextInt();
        int biggerNimber=x;
        if (x>y){
            x=y;
            y=biggerNimber;
        }
        System.out.println( "x: "+x);
        System.out.println( "y: "+y);

    }
}