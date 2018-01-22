package Objects;

import java.util.Scanner;

public class Hypothenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vyvedi a");
        double a = scanner.nextDouble();
        System.out.println("Vyvedi b");
        double b = scanner.nextDouble();
        System.out.println("Hypo is "+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
    }
}