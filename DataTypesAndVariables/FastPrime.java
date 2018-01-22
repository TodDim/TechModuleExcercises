package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class FastPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int start = 2; start<= number; start++)
        { boolean isPrime = true;
            for (int divide = 2; divide<= Math.sqrt(start); divide++)
            {
                if (start % divide == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n",start,isPrime);

        }

    }
}