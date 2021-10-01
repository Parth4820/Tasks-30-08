package com.company;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows in a matrix.");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in a matrix.");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        int[][] transposeMatrix = new int[rows][columns];
        System.out.println("Enter the elements row wise.");
        for (int i = 0; i < rows; i++){                                  // To store the elements in matrix.
            for (int j = 0; j < columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++){                                    // To display the elements stored in matrix
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println(" \n");
        }
        for (int i = 0; i < rows; i++){                                   // To transpose the matrix
            for (int j = 0; j < columns; j++){
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < rows; i++){                                     // To display the elements stored in transpose matrix.
            for (int j = 0; j < columns; j++){
                System.out.print(transposeMatrix[i][j]+"\t");
            }
            System.out.println(" \n");
        }

    }
}
