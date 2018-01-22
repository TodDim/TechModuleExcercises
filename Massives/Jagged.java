package Massives;

import java.util.Arrays;
public class Jagged {
    public static  void main(String[] args){
        int[] arr={0,1,4,113,55,3,1,2,66,557,124};
        int[] sizes=new int[3];
        for (int i = 0; i < arr.length; i++) {
            int remainder = arr[i]%3;
            switch ( remainder){
                case 0: sizes[0]++;break;
                case 1: sizes[1]++;break;
                case 2: sizes[2]++;break;
            }
        }
        //System.out.println(Arrays.toString(sizes));
        int[][] results=new int[3][];
        for (int i = 0; i < sizes.length; i++) {
            results[i]= new int [sizes[i]];
        }
        for (int i = 0, j=0, k=0, l=0; i < arr.length; i++) {
           int remainder= arr[i]%3;
           switch ( remainder){
               case 0:results[0][j]=arr[i];j++; break;
               case 1:results[1][k]=arr[i];k++; break;
               case 2:results[2][l]=arr[i];l++; break;
           }
        }
        PrintMatrix(results);
    }
    private static void PrintMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("|" );
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+"|");
            }
            System.out.println( );
        }
    }
}
