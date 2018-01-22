package SoftuniExam;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 17.9.2017 г..
 */
public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractDuration = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String additionalInternet = scanner.nextLine();
        byte months = scanner.nextByte();
        double tax=0.0f;

        if (contractDuration.equals("one")) {
            switch (typeOfContract) {
                case "Small":
                    tax = 9.98;
                    break;
                case "Middle":
                    tax = 18.99;
                    break;
                case "Large":
                    tax = 25.98;
                    break;
                case "ExtraLarge":
                    tax =35.99;
                    break;
            }
        }
       else if (contractDuration.equals("two")) {
            switch (typeOfContract) {
                case "Small":
                    tax = 8.58;
                    break;
                case "Middle":
                    tax = 17.09;
                    break;
                case "Large":
                    tax = 23.59;
                    break;
                case "ExtraLarge":
                    tax =31.79;
                    break;
            }
        }
        if (additionalInternet.equals("yes")) {
            if (tax<=10.0f){
                tax=tax+5.50f;
            }
            else if ((tax>10.0f)&&(tax<=30.0f)){
                tax=tax+4.35f;
            }
            else if (tax>30.0f){
                tax=tax+3.85f;
            }
        }

        if (contractDuration.equals("two")){
            tax*=(100-3.75f)*0.01;
        }
        double all=tax*months;
        System.out.printf("%.2f lv.",all);
    }
}