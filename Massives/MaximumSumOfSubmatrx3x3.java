package Massives;

import java.util.Arrays;
import java.util.Scanner;
public class MaximumSumOfSubmatrx3x3
{
    public  static  void  main (String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vyvedete N");
        int n = scanner.nextInt();
        System.out.println("Vyvedete M");
        int m = scanner.nextInt();
        System.out.println( "vyvedete elementite na masiva");
        int [][] matrix =new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <m ; j++) {
                matrix[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int maxSumofSubmatrix= Integer.MIN_VALUE;
        int [][] subMatrix=new int[3][3];
        int indexMaxRow=0;
        int indexMaxCol=0;
        int sumOfSubmatrix=0;
        int indexRow=0;
        int indexCol=0;
        for (int startRow = 0; startRow <=n-3 ; startRow++) {
            indexRow=startRow;
            for (int startCol = 0; startCol <=m-3 ; startCol++) {
                indexCol=startCol;
                for (int i = 0; i <3 ; i++) {
                    for (int j = 0; j <3 ; j++) {
                        subMatrix[i][j]=matrix[indexRow][indexCol];
                        sumOfSubmatrix=sumOfSubmatrix+subMatrix[i][j];
                        indexCol++;
                    }
                    indexCol=0;
                    indexRow++;
                }
                indexRow=0;
                if (sumOfSubmatrix>maxSumofSubmatrix){
                    maxSumofSubmatrix=sumOfSubmatrix;
                    indexMaxRow=startRow;
                    indexMaxCol=startCol;
                }
            }
        }
        int oldMaxCol=indexMaxCol;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                subMatrix[i][j]=matrix[indexMaxRow][indexMaxCol];
                indexMaxCol++;
                System.out.print(subMatrix[i][j]+",");
            }
            indexMaxCol=oldMaxCol;
            indexMaxRow++;
            System.out.println();
        }
        System.out.println("maxSumofSubmatrix is "+maxSumofSubmatrix);
    }
}
