package InputOutputConsole;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class FiveNumbers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        double sum=0;
        double in;
        for (int i = 0; i < 5; i++) {
         in=scanner.nextDouble();
         sum=sum+in;
        }
        System.out.println(sum);

    }
}
