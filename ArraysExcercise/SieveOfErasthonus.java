package ArraysExcercise;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 12.10.2017 г..
 */
public class SieveOfErasthonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] primes = new boolean[n + 1];
        for (int i = 0; i < primes.length; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            primes[i] = true;
        }
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                System.out.print(i + " ");
                for (int j = 2; j * i < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }
    }
}



