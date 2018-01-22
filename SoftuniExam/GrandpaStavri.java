package SoftuniExam;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 17.9.2017 г..
 */
public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short days=scanner.nextShort();
        double   quantityRakia;
        double gradusRakia;
        double da=0.0f;
        double allRakia=0;
        for (int i = 0; i <days ; i++) {
            quantityRakia=scanner.nextDouble();
            allRakia=allRakia+quantityRakia;
            gradusRakia=scanner.nextDouble();
            da=da+quantityRakia*gradusRakia;
        }
double degrees=da/allRakia;
        System.out.printf("Liter: %.2f%n",allRakia);
        System.out.printf("Degrees: %.2f%n",degrees);
        if (degrees<38.0f){
            System.out.println("Not good, you should baking!");
        }
        else if ((degrees>=38.0f)&&(degrees<=42.0f)){
            System.out.println("Super!");
        }
        else if(degrees>42.0f){
            System.out.println("Dilution with distilled water!");
        }
    }
}

