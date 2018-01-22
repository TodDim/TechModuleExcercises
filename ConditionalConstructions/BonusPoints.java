package ConditionalConstructions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter points: ");
        int points = scanner.nextInt();
        switch (   points){
            case    1:
                System.out.printf("Bonus points are "+points*10);
                break;
            case    2:
                System.out.printf("Bonus points are "+points*10);
                break;
            case    3:
                System.out.printf("Bonus points are "+points*10);
                break;
            case    4:
                System.out.printf("Bonus points are "+points*100);
                break;
            case    5:
                System.out.printf("Bonus points are "+points*100);
                break;
            case    6:
                System.out.printf("Bonus points are "+points*100);
                break;
            case    7:
                System.out.printf("Bonus points are "+points*1000);
                break;
            case    8:
                System.out.printf("Bonus points are "+points*1000);
                break;
            case    9:
                System.out.printf("Bonus points are "+points*1000);
                break;
        }
    }
}
