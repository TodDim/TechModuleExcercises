package Massives;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static  void main (String [] args){
        Scanner scanner=new Scanner(System.in);
        int [] massiv=new int[5];
        System.out.println("Vyvedi X");
        int x =scanner.nextInt();
        System.out.println("Vyvedi elemenite na masiva");
        for (int i = 0; i <5 ; i++) {
            massiv[i]=scanner.nextInt();
        }
        Arrays.sort(massiv);
        int l=0;
        int r=massiv.length-1;
        while (l<=r){
            int positionIndex=l+(r-l)/2;
            if (massiv[positionIndex]==x){
                System.out.println("the number "+x +"has a position index"+positionIndex);
                break;
            }
            if ((l==r)&&(massiv[positionIndex]!=x)){
                System.out.println("elementyt ne e v masiva");
                break;
            }
           else if (massiv[positionIndex]>x) {
                r=positionIndex-1;
            }
            else   {
                l=positionIndex+1;
            }
            }
        }
     }

