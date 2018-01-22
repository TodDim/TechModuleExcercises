package Exams;

import java.util.Scanner;
public class ChampionCup {
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String dance="D^A^N^C^E^";
        System.out.println("Enter N");
        byte n = scanner.nextByte();
        for (int i = 0; i <n/2 ; i++) {
            System.out.print(repeat(".", n+i));
            System.out.print(repeat("#", 3*n-2*i));
            System.out.print(repeat(".", n+i));
            System.out.println();
        }
        for (int i = 0; i <n/2 ; i++) {
            System.out.print(repeat(".", n/2+n+i));
            System.out.print("#");
            System.out.print(repeat(".", n+n/2+1-2*i));
            System.out.print("#");
            System.out.print(repeat(".", n/2+n+i));
            System.out.println();
        }
        System.out.print(repeat(".", 2*n));
        System.out.print(repeat("#", n));
        System.out.print(repeat(".", 2*n));
        System.out.println();
        for (int i = 0; i <n+2 ; i++) {
            if (i==n/2){
                System.out.print(repeat(".", (5*n-dance.length())/2));
                System.out.print(dance);
                System.out.print(repeat(".", (5*n-dance.length())/2));
                System.out.println();
                continue;
            }
            System.out.print(repeat(".", 2*n-2));
            System.out.print(repeat("#", n+4));
            System.out.print(repeat(".", 2*n-2));
            System.out.println();
        }
    }
}
