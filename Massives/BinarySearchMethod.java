package Massives;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMethod {
    public static int binarySearch(int[] arr,int x){
        Arrays.sort(arr);
      int l=0;
      int r=arr.length-1;
      while (l<=r){
          int index=(r+l)/2;
          if (arr[index]==x)
              return index;
          if (arr[index]>x){
              r=index-1;
          }
          else
              l = index + 1;
          }
       return -1;
    }
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedi broq na elementite na masava");
        int n=scanner.nextInt();
        System.out.println("Vyvedi X");
        int x=scanner.nextInt();
        int [] massiv=new int[n];
        System.out.println("Vyvedi elementite na masava");
        for (int i = 0; i <n ; i++) {
            massiv[i]=scanner.nextInt();
        }
        int result = binarySearch(massiv,x);
        if (result!=-1) {
            System.out.println("Element found at index " + result);
        }
        else
            System.out.println("Element not found");
    }
}
