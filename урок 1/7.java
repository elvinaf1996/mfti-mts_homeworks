package hw_lesson1;

import java.util.Arrays;

public class Main {
    public static double[][] matrixMultiply(double[][] matrix1, double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix2[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix2[0].length; j ++){
                double sum = 0;
                for(int k = 0; k < matrix2[0].length; k++){
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                matrix3[i][j] = sum;

            }
        }
        return matrix3;
    }
    public static void main(String[] args) {
        double[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        double[][] matrix2 = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};
        System.out.println(Arrays.deepToString(matrixMultiply(matrix1, matrix2)));
    }
}
