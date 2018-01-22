package Massives;

import java.util.Scanner;

public class FourMatrixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vyvedete razmera na matricite");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int firstmember = i + 1;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = firstmember + j * n;
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println();
        //        matrix b
        for (int i = 0; i < n; i++) {
            int firstmember = i + 1;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    matrix[i][j] = firstmember + j * n;
                    System.out.print(matrix[i][j] + ",");
                } else {
                    matrix[i][j] = (j + 1) * n - i;
                    System.out.print(matrix[i][j] + ",");
                }
            }
            System.out.println();
        }
        System.out.println();
//        matrix c
        int number = 1;
        for (int i = n - 1; i >= 0; i--) {
            int row = i;
            for (int j = 0; j < n - i; j++) {
                matrix[row][j] = number;
                row++;
                number++;
            }
        }
        for (int i = 1; i < n; i++) {
            int col = i;
            for (int j = 0; j < n - i; j++) {
                matrix[j][col] = number;
                col++;
                number++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println();
//        matrix d
        int value = 1;
        int minCol = 0;
        int minRow = 0;
        int maxRow = n - 1;
        int maxCol = n - 1;
        while (value <= n * n) {
            for (int i = minRow; i <= maxRow; i++) {
                matrix[i][minCol] = value;
                value++;
            }
            for (int i = minCol + 1; i <= maxCol; i++) {
                matrix[maxRow][i] = value;
                value++;
            }
            for (int i = maxRow - 1; i >= minRow; i--) {
                matrix[i][maxCol] = value;
                value++;
            }
            for (int i = maxCol - 1; i > minCol; i--) {
                matrix[minRow][i] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxRow--;
            maxCol--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
    }
}


