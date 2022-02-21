package hw_lesson1;

import java.util.Arrays;

public class Main {
    public static double[][] matrixAdd(double[][] matrix1,
                                       double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length; i ++){
            for(int j = 0; j < matrix1[0].length; j ++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix3;
    }
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        double[][] matrix2 = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};
        System.out.println(Arrays.deepToString(matrixAdd(matrix1, matrix2)));
    }
}
