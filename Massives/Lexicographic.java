package Massives;

import java.util.Scanner;

/**
 * Created by tydimitrov on 24.7.2017 г..
 */
public class Lexicographic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vyvedete broq na elementite na masiv 1");
        int n = scanner.nextInt();
        System.out.println("vyvedete elementite na masiv 1");
        char[] massiv = new char[n];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = scanner.next().charAt(0);
        }
        System.out.println("Vyvedete broq na elementite na masiv 2");
        int m = scanner.nextInt();
        System.out.println("vyvedete elementite na masiv 2");
        char[] massiv2 = new char[m];
        for (int i = 0; i < massiv2.length; i++) {
            massiv2[i] = scanner.next().charAt(0);
        }
        boolean equal = true;
        int checkLengt=0;
        if (m>n){
            checkLengt=n;
            System.out.println("masivi1 e po kratyk");
        }
        else if(m<n){
            checkLengt=m;
            System.out.println("masivi2 e po kratyk");
        }
        else if ( m==n   ) {
            checkLengt=n;
            for (int i = 0; i < checkLengt; i++) {
                if (massiv2[i] < massiv[i]) {
                    System.out.println("masivi1 e po golqm");
                    equal = false;
                    break;
                } else if (massiv2[i] > massiv[i]) {
                    System.out.println("masiv 2 e po golqm");
                    equal = false;
                    break;
                }
            }
            if (equal == true) {
                System.out.println("masivite sa ednakvi");
        }
        }
    }
}