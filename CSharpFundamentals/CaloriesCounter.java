package CSharpFundamentals;

import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class CaloriesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        String ingredients=null;
        int calories=0;
        for (int i = 0; i <=n ; i++) {
            ingredients=scanner.nextLine();
            if (ingredients.equalsIgnoreCase("cheese")){
                calories+=500;
            }
            else if (ingredients.equalsIgnoreCase("Tomato sauce")){
                calories+=150;
            }
            else if (ingredients.equalsIgnoreCase("Pepper")){
                calories+=50;
            }
            else if (ingredients.equalsIgnoreCase("Salami")){
                calories+=600;
            }
        }
        System.out.println("Total calories: "+calories);
    }
}