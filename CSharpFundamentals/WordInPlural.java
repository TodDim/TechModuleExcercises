package CSharpFundamentals;

import java.util.Scanner;

/**
 * Created by tydimitrov on 27.9.2017 г..
 */
public class WordInPlural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
       if (noun.endsWith("y")){
           noun=noun.substring(0,noun.length()-1);
//           noun=noun.replace("y", "");
//           noun=noun.replace("y", "");
           System.out.println(noun+"ies");
        }
        else if(noun.endsWith("o")||noun.endsWith("ch")||noun.endsWith("s")||noun.endsWith("sh")||noun.endsWith("x")||noun.endsWith("z")){

           System.out.println(noun+"es");
       }
       else
           System.out.println(noun+"s");
    }
}