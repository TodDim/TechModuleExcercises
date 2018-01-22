package InputOutputConsole;

import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class Firm {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        String address =scanner.nextLine();
        String number =scanner.nextLine();
        String website =scanner.nextLine();
        String manager =scanner.nextLine();
        System.out.printf( "Company name: %s %nAddress: %s %nTel number: %s %nwebsite: %s %nManager: %s %n ",name,address,number,website,manager);


    }
}
