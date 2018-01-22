package Exams;
import java.util.Scanner;

/**
 * Created by TYDimitrov on 3.9.2017 г..
 */
public class Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float budget = scanner.nextFloat();
        float houseArea = scanner.nextFloat();
        byte windows = scanner.nextByte();
        float areaOFStyroporInPackage = scanner.nextFloat();
        float styroporPrice = scanner.nextFloat();
        byte packagesNeeeded = (byte) Math.ceil((houseArea - windows * 2.4) * 1.1 / areaOFStyroporInPackage);
        float spent =  packagesNeeeded * styroporPrice;
        if (spent < budget) {
            System.out.printf("Spent: %.2f%n", spent);
            System.out.printf("Left: %.2f%n", budget - spent);
        } else {
            System.out.printf("Need more: %.2f", spent - budget);
        }
    }
}

