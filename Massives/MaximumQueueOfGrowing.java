package Massives;
import java.util.Scanner;
public class MaximumQueueOfGrowing {
    public  static  void  main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedete broq na elementite na masiva");
        int n = scanner.nextInt();
        System.out.println( "vyvedete elementite na masiv 1");
        int [] massiv =new int[n];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i]=scanner.nextInt();
        }
        int countOfGrowing=1;
        for (int i = 0; i < massiv.length-1; i++) {
            if (    massiv[i]==massiv[i+1]-1){
                countOfGrowing++;
            }
        }
        int[] massivOfGrowing=new int[countOfGrowing];
        for (int i = 0, j=0; i < massiv.length-1; i++) {
            if (    massiv[i]==massiv[i+1]-1){
                    massivOfGrowing[j]=massiv[i];
                massivOfGrowing[j+1]=massiv[i+1];
                    j++;
            }
        }
        System.out.println("Narastvashtata poredica e " );
        for (int i = 0; i < massivOfGrowing.length; i++) {
            System.out.print(massivOfGrowing[i]+" " );
        }
    }
}
