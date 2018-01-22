package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by tydimitrov on 3.10.2017 г..
 */
public class ComparingFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
     double eps=0.000001;
        double dif=second-first;
        if (Math.abs(dif) < eps) {
            System.out.println("True");
        } else System.out.println("False");
    }
}