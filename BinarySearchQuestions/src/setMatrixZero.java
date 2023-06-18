package BinarySearchQuestions.src;

import java.util.Arrays;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        setZeroes(mat);
    }
    public static void setZeroes(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    Arrays.fill(matrix[i], 0);
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
