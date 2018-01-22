package Loops;

import java.util.Scanner;

/**
 * Created by tydimitrov on 12.7.2017 г..
 */
public class Number1toNDivided3or7 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            if ((i%3==0)||(i%7==0))
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
