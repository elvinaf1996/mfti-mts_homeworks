package hw_lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double[] createRandomArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for(int i = 0; i < n; i ++){
            arr[i] = Math.random();
        }
        return arr;
    }
    public static void main(String[] args) {
        double[] arr = createRandomArray();
        System.out.println(Arrays.toString(arr));
    }
}