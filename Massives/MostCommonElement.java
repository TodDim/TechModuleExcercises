package Massives;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by TYDimitrov on 26.7.2017 г..
 */
public class MostCommonElement {
    public  static  void  main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedete broq na elementite na masiva");
        int n = scanner.nextInt();
        System.out.println( "vyvedete elementite na masiva");
        int [] massiv =new int[n];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i]=scanner.nextInt();
        }
//        Arrays.sort(massiv);
        System.out.println( );
        int mostCommon=0;
        int finalCount=0;
        for (int i = 0; i < massiv.length; i++) {
            int count=0;
            for (int j = 0; j <massiv.length ; j++) {
                if (massiv[i]==massiv[j]){
                    count++;
                }
            }
            if(count>finalCount){
                finalCount=count;
                mostCommon=massiv[i];
            }
        }
        System.out.println("The number "+mostCommon + " is repeated "+ finalCount+ " times.");
    }
}
