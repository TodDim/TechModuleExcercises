package Massives;

import java.util.Scanner;
public class IndexAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            int index= (int) word.charAt(i);
            System.out.print(index+", ");
        }
    }
}
