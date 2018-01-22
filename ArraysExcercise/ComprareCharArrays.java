package ArraysExcercise;


import java.util.Arrays;
import java.util.Scanner;


public class ComprareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars1 =  scanner.nextLine().replaceAll(" ", "").toCharArray();
        char[] chars2 =  scanner.nextLine().replaceAll(" ", "").toCharArray();
        boolean equal = true;
        int checkLengt=0;
        if (chars2.length>chars1.length){
            checkLengt=chars1.length;
        }
        else if(chars2.length<=chars1.length){
            checkLengt=chars2.length;
        }
        for (int i = 0; i <checkLengt ; i++) {
            if (chars1[i]==chars2[i]){
                continue;
            }
            else if (chars1[i]<chars2[i]){
                PrintArray(chars1);
                PrintArray(chars2);
                return;
            }
            else {
                PrintArray(chars2);
                PrintArray(chars1);
                return;
            }
        }
        if (chars1.length<=chars2.length){
            PrintArray(chars1);
            PrintArray(chars2);
            return;
        }
        else if (chars1.length>chars2.length){
            PrintArray(chars2);
            PrintArray(chars1);
            return;
        }

    }
    public static void PrintArray(char[] chars){
        for (char x:chars
             ) {
            System.out.print(x);
        }
        System.out.println();
    }
}