package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 13.7.2017 г..
 */
public class FactorialZeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        while (true) {
            System.out.print("Enter N ");
            int n = scanner.nextInt();
            long nFactorial = 1;
            for (int i = 1; i <= n; i++) {
                nFactorial *= i;
            }
            System.out.println(nFactorial);
            int countZeros=0;
          while (   nFactorial%10==0){
              countZeros++;
              nFactorial/=10;
          }
        System.out.println(countZeros);
        }
    }
//}
