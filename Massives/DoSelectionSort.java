package Massives;

import java.util.Scanner;
public class DoSelectionSort {
    public static int[] doSelectionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[i]){
                    int smallernumber=arr[j];
                    arr[j]=arr[i];
                    arr[i]=smallernumber;
                }
            }
        }
        return arr;
    }
    public  static  void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedi N");
        int n = scanner.nextInt();
        int[] arr1= new int[n];
        for (int i = 0; i <arr1.length ; i++) {
           arr1[i]=scanner.nextInt();
        }
        int [] arr2=doSelectionSort(arr1);
        for (int i = 0; i <arr2.length ; i++) {
            System.out.printf("%d ",arr2[i]);
        }
    }
}
