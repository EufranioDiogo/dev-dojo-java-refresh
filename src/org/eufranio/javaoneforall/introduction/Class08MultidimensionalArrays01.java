package org.eufranio.javaoneforall.introduction;

import java.util.Arrays;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][];
        short counter = 1;

        matrix[0] = new int[6];
        matrix[1] = new int[3];
        matrix[2] = new int[4];
        matrix[3] = new int[1];



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter++;
            }
        }

        matrix[3] = new int[]{counter++, counter++, counter++, counter++};

        printMatrix(matrix);

        System.out.println();

        printMatrix(new int[][]{{1,2,3}, {4, 5, 3, 6}});
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
