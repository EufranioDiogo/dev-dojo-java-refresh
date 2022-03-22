package org.eufranio.javaoneforall.introduction;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        short counter = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter++;
            }
        }

        for(int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }
}
