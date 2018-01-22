package ConditionalConstructions;

import java.util.Scanner;

/**
 * Created by tydimitrov on 11.7.2017 г..
 */
public class WriteNumbersOnetoNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println( "Number you entered is one");
                break;
            case 2:
                System.out.println( "Number you entered is two");
                break;
            case 3:
                System.out.println( "Number you entered is three");
                break;
            case 4:
                System.out.println( "Number you entered is four");
                break;
                default:
                    System.out.println( "no such number");
                    break;
        }


    }
}
