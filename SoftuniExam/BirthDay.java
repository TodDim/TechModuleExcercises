package SoftuniExam;

import java.util.Scanner;
public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   short length=scanner.nextByte();
        short width=scanner.nextByte();
        short height=scanner.nextByte();
        float percentage=scanner.nextFloat();
        if ((width>=10)&&(height>=10)&&(length>=10)&&(percentage>0)){
            double tankVolume=length*height*width*0.001;
            double realPercentage=percentage*0.01;
            double litres=tankVolume*(1-realPercentage);
            System.out.printf("%.3f%n",litres);
        }

    }
}