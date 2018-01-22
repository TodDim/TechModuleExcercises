package InputOutputConsole;

import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class BiggestOfFiveNumbers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        double in;
        double biggest = 0;
        for (int i = 0; i < 5; i++) {
            in=scanner.nextDouble();
          if (  in>biggest){
              biggest=in;
          }
        }
        System.out.println(biggest);

    }
}
