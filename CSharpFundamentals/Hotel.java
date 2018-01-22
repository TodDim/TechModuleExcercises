package CSharpFundamentals;

import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month =scanner.nextLine();
        short night=scanner.nextShort();
        byte studioPrice=0;
        byte doublePrice=0;
        byte suitPrice=0;
        switch (month){
            case"May":
            case "October":
                studioPrice=50;
                doublePrice=65;
                suitPrice=75;
                        break;
            case "June":
            case "September":
                studioPrice=60;
                doublePrice=72;
                suitPrice=82;
                break;
            case "July":
            case "August":
            case "December":
                studioPrice=68;
                doublePrice=77;
                suitPrice=89;
                break;

        }
        byte discont=0;
        float totalPrice=0;
        System.out.printf("Studio: ");
        int  minusNight=night;
        if ((night>7)&&((month.equals("May"))||(month.equals("October")))){
            discont=5;
        }
        if ((night>7)&&((month.equals("September"))||(month.equals("October")))){
            minusNight--;
        }

      totalPrice=(1-0.01f*discont)*studioPrice*minusNight;
        System.out.printf("%.2f lv.%n",totalPrice);
        discont=0;
        System.out.printf("Double: ");
        if ((night>14)&&((month.equals("June"))||(month.equals("September")))){
            discont=10;
        }

        totalPrice=(1-0.01f*discont)*doublePrice*night;
        System.out.printf("%.2f lv.%n",totalPrice);
        discont=0;
        System.out.printf("Suite: ");
        if ((night>14)&&((month.equals("July"))||(month.equals("August"))||(month.equals("December")))){
            discont=15;
        }
        totalPrice=(1-0.01f*discont)*suitPrice*night;
        System.out.printf("%.2f lv.%n",totalPrice);
    }
}