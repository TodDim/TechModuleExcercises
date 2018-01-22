package Massives;

import java.util.Scanner;
import  java.util.LinkedHashMap;

/**
 * Created by tydimitrov on 5.7.2017 г..
 */
public class Matrix {
    public static  void MatrixCreatAuto(String[] args){
        Scanner scanner=new Scanner(System.in);
        int [][] matrix= new int[3][5];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]=row + col;
            }
        }
        PrintMatrix(matrix);

    }

    public static void PrintMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+"|");
            }
            System.out.println( );
        }
    }

}
