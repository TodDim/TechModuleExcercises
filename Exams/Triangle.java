package Exams;

import java.util.Scanner;
public class Triangle {
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String smile="(@)";
        System.out.println("Enter N");
        byte n = scanner.nextByte();
        System.out.println(repeat("#", 4*n+1));
        for (int i = 0; i <n ; i++) {
            if (i==n/2){
                System.out.print(repeat(".", i+1));
                System.out.print(repeat("#", 2*n-1-2*i));
                System.out.print(repeat(" ",(1+2*i-smile.length())/2));
                System.out.print(smile);
                System.out.print(repeat(" ",(1+2*i-smile.length())/2));
                System.out.print(repeat("#", 2*n-1-2*i));
                System.out.print(repeat(".", i+1));
                System.out.println();
                continue;
            }
            System.out.print(repeat(".", i+1));
            System.out.print(repeat("#", 2*n-1-2*i));
            System.out.print(repeat(" ",(1+2*i)));
            System.out.print(repeat("#", 2*n-1-2*i));
            System.out.print(repeat(".", i+1));
            System.out.println();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(repeat(".", i+n+1));
            System.out.print(repeat("#", 2*n-1-2*i));
            System.out.print(repeat(".", i+n+1));
            System.out.println();
        }
    }
}
