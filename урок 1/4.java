package hw_lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double[] createRandomArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        for(int i = 0; i < n; i ++){
            arr[i] = Math.random() * 100;
        }
        return arr;
    }
    public static void getMixManAvg(double[] arr) {
        double maxNumber = arr[0];
        double minNumber = arr[0];
        double sumNumber = 0;
        for(int i = 1; i < arr.length; i ++){
            if(arr[i] < minNumber){
                minNumber = arr[i];
            }
            else if(arr[i] > maxNumber){
                maxNumber = arr[i];
            }
            sumNumber += arr[i];
        }
        System.out.println("Максимальное число массива " + maxNumber);
        System.out.println("Минимальное число массива " + minNumber);
        System.out.println("Среднее арифметическое массива " + sumNumber/arr.length);
    }
    public static void main(String[] args) {
        double[] arr = createRandomArray();
        System.out.println(Arrays.toString(arr));
        getMixManAvg(arr);

    }
}