package CountingSystems;
import java.util.Scanner;
//Да се напише програма, която определя (отпечатва) стойността на мантисата, знака на мантисата и стойността на експонентата за числа от тип float и double.
public class Mantissa {
    public static void main(String a[]) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        float inputNumber=scanner.nextFloat();
        int numberLong = Float.floatToIntBits(inputNumber);
        String letters=Integer.toBinaryString(numberLong);
        System.out.println(letters);

        System.out.printf("The mantissa of %f is: ",inputNumber);
        for (int i = 9; i <=31 ; i++) {
            String Letter=String.valueOf(letters.charAt(i));
            System.out.print(Letter);
        }
        System.out.println();
        System.out.printf("The sign of Mantissa of %f is: ",inputNumber);
            String Letter=String.valueOf(letters.charAt(0));
            System.out.print(Letter);

        System.out.println();
        System.out.printf("The exponent of mantissa of %f is: ",inputNumber);
        for (int i = 1; i <=8 ; i++) {
            String LettersOfExponent=String.valueOf(letters.charAt(i));
            System.out.print(LettersOfExponent);
        }
    }
}