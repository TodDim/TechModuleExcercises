package Massives;
import java.util.Scanner;
/**
 * Created by tydimitrov on 25.7.2017 г..
 */
public class MaximumEquals {
    public  static  void  main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedete broq na elementite na masiva");
        int n = scanner.nextInt();
        System.out.println( "vyvedete elementite na masiv 1");
        int [] massiv =new int[n];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i]=scanner.nextInt();
        }
int countOfEquals=1;
        int valueOfEquals=0;
        for (int i = 1; i < massiv.length; i++) {
            if (    massiv[i]==massiv[i-1]){
                countOfEquals++;
                valueOfEquals=massiv[i];
            }
        }
        System.out.println( );
        int massivOfEquals[]=new int[countOfEquals];
        for (int i = 0; i < massivOfEquals.length; i++) {
            massivOfEquals[i]=valueOfEquals;
            System.out.print(massivOfEquals[i]+" " );
        }
    }
}
