package Massives;
//Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви.
import java.util.Scanner;

/**
 * Created by tydimitrov on 24.7.2017 г..
 */
public class EqualMassives {
    public  static  void  main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedete broq na elementite na masivite");
        int n = scanner.nextInt();
        System.out.println( "vyvedete elementite na masiv 1");
        int [] massiv =new int[n];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i]=scanner.nextInt();
        }
        System.out.println( "vyvedete elementite na masiv 2");
        int [] massiv2 =new int[n];
        for (int i = 0; i < massiv2.length; i++) {
            massiv2[i]=scanner.nextInt();
        }
        for (int i = 0; i < massiv2.length; i++) {
            if (    massiv2[i]!=massiv[i]){
                System.out.println( "masivite sa razlichni");
                break;
            }
            else {
                System.out.println( "masivite sa ednakvi");
                break;
            }
        }

    }
}
