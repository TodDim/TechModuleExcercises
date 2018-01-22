package InputOutputConsole;

import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class CirclePerimeterArea {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int r =scanner.nextInt();
        System.out.printf( "Perimeter is %.3f %n",2*Math.PI*r);
        System.out.printf( "Area is %.3f ",Math.PI*r*r);

    }
}

