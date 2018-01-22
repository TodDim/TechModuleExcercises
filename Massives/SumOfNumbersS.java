package Massives;

import java.util.Scanner;

/**
 * Created by TYDimitrov on 26.7.2017 г..
 */
public class SumOfNumbersS {
    public  static  void  main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedete broq na elementite na masiva");
        int n = scanner.nextInt();
        System.out.println( "vyvedete elementite na masiva");
        int [] massiv =new int[n];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i]=scanner.nextInt();
        }
        System.out.println("Vyvedete S");
        int s = scanner.nextInt();
        int startElementIndex=0;
        int sum=0;
        int countOfElements=1;
        for (int i = 0; i < massiv.length-1; i++) {
            if (sum==s)
                break;
            startElementIndex=i;
            sum=massiv[i];
            countOfElements=1;
            for (int j = i+1; j <massiv.length ; j++) {
                    sum +=massiv[j];
                    countOfElements++;
                    if (sum == s)
                        break;
            }
        }
        for (int i = startElementIndex; i <startElementIndex+(countOfElements-1) ; i++) {
            System.out.print(massiv[i]+"+");
        }
            System.out.print(massiv[startElementIndex+countOfElements-1]+"");
        System.out.print("= "+s);
    }
}
