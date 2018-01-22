package SoftuniExam;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 17.9.2017 г..
 */
public class Sheriff {
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        for (int i = 0; i <=2 ; i++) {
            if (i==0){
                    System.out.print(repeat(".", 3*n/2));
                    System.out.print("x");
                    System.out.print(repeat(".", 3*n/2));
                    System.out.println();
            }
            if (i==1){
                System.out.print(repeat(".", 3*n/2-1));
                System.out.print("/");
                System.out.print("x");
                System.out.print("\\");
                System.out.print(repeat(".", 3*n/2-1));
                System.out.println();
            }
            if (i==2){
                System.out.print(repeat(".", 3*n/2-1));
                System.out.print("x");
                System.out.print("|");
                System.out.print("x");
                System.out.print(repeat(".", 3*n/2-1));
                System.out.println();
            }
        }
        for (int i = 0; i <n/2 ; i++) {
            System.out.print(repeat(".", n/2-i));
            System.out.print(repeat("x", n+i));
            System.out.print("|");
            System.out.print(repeat("x", n+i));
            System.out.print(repeat(".", n/2-i));
            System.out.println();
        }
        System.out.print(repeat("x", 3*n/2));
        System.out.print("|");
        System.out.print(repeat("x", 3*n/2));
        System.out.println();

        for (int i = n/2; i >0 ; i--) {
            System.out.print(repeat(".", n/2+1-i));
            System.out.print(repeat("x", n+i-1));
            System.out.print("|");
            System.out.print(repeat("x", n+i-1));
            System.out.print(repeat(".", n/2+1-i));
            System.out.println();
        }



        System.out.print(repeat(".", 3*n/2-1));
        System.out.print("/");
        System.out.print("x");
        System.out.print("\\");
        System.out.print(repeat(".", 3*n/2-1));
        System.out.println();

        System.out.print(repeat(".", 3*n/2-1));
        System.out.print("\\");
        System.out.print("x");
        System.out.print("/");
        System.out.print(repeat(".", 3*n/2-1));
        System.out.println();


        for (int i = 0; i <n/2 ; i++) {
            System.out.print(repeat(".", n/2-i));
            System.out.print(repeat("x", n+i));
            System.out.print("|");
            System.out.print(repeat("x", n+i));
            System.out.print(repeat(".", n/2-i));
            System.out.println();
        }
        System.out.print(repeat("x", 3*n/2));
        System.out.print("|");
        System.out.print(repeat("x", 3*n/2));
        System.out.println();

        for (int i = n/2; i >0 ; i--) {
            System.out.print(repeat(".", n/2+1-i));
            System.out.print(repeat("x", n+i-1));
            System.out.print("|");
            System.out.print(repeat("x", n+i-1));
            System.out.print(repeat(".", n/2+1-i));
            System.out.println();
        }
        System.out.print(repeat(".", 3*n/2-1));
        System.out.print("x");
        System.out.print("|");
        System.out.print("x");
        System.out.print(repeat(".", 3*n/2-1));
        System.out.println();

        System.out.print(repeat(".", 3*n/2-1));
        System.out.print("\\");
        System.out.print("x");
        System.out.print("/");
        System.out.print(repeat(".", 3*n/2-1));
        System.out.println();


        System.out.print(repeat(".", 3*n/2));
        System.out.print("x");
        System.out.print(repeat(".", 3*n/2));
        System.out.println();
        }
    }


