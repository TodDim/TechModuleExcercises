package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class StringsAndObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hello="Hello";
        String world="World";
        Object helloWorld=hello+ " " + world;
        String third=helloWorld.toString();
        System.out.println(third);
    }
}