package DataTypesAndVariables;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 2.10.2017 г..
 */
public class ConvertSpeedUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = scanner.nextInt();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        float meterPerSecond = (float) meters / (hours * 3600 + minutes * 60 + seconds);
        System.out.printf("%f%n", meterPerSecond);
        float kmPerHours = ((float)meters / 1000) / ((float)hours+(float)minutes/60+(float)seconds/3600);
        System.out.printf("%f%n", kmPerHours);
        float milePerHour = ((float)meters /1609) / ((float)hours+(float)minutes/60+(float)seconds/3600); ;
        System.out.printf("%f%n", milePerHour);


    }
}