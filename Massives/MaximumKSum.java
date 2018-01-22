package Massives;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tydimitrov on 25.7.2017 г..
 */
//Да се напише програма, която чете от конзолата две цели числа N и K, и масив от N елемента. Да се намерят тези K елемента, които имат максимална сума.
public class MaximumKSum {
    public  static  void  main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedete N");
        int n = scanner.nextInt();
        System.out.println("Vyvedete K");
        int k = scanner.nextInt();
        System.out.println( "vyvedete elementite na masiva");
        int [] massiv =new int[n];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i]=scanner.nextInt();
        }
        Arrays.sort(massiv);
        System.out.println("The numbers who have maximum sum are ");
        for (int i = 0; i <k ; i++) {
            System.out.print( massiv[n-1]+", ");
            n--;
        }
        }
        }


