package CSharpFundamentals;

import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class CakeIngredients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command=null;
        int count=0;
        boolean bake=false;
        while (bake==false){
             command =scanner.nextLine();
             if (command.equals("Bake!"))
             {
                 break;
             }
             count++;
            System.out.println("Adding ingredient "+command+".");
        }
        System.out.println("Preparing cake with "+ count + " ingredients.");
    }
}