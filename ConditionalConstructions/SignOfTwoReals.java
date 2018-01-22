package ConditionalConstructions;

import java.util.Scanner;

public class SignOfTwoReals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        float x = scanner.nextFloat();
        System.out.print("Enter y: ");
        float y = scanner.nextFloat();
        if ((x / y) < 0) {
            System.out.println("Sign is: -");
        }
        else{
                System.out.println("Sign is: +");

            }
        }
    }
