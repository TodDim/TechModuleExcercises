package CSharpFundamentals;
import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class CountTheIntegers {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNextInt()) {
            count++;
            scanner.next();
        }
        System.out.println(count);
    }
}