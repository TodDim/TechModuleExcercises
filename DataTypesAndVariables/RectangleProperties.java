package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width=scanner.nextDouble();
        double height=scanner.nextDouble();
        double perimeter=2*width+2*height;
        System.out.println(perimeter);
        double area=width*height;
        System.out.println(area);
        double diagonal =Math.sqrt(width*width+height*height);
        System.out.println(diagonal);
    }
}