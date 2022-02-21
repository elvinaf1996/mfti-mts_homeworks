package hw_lesson1;

import java.util.Arrays;

public class Main {
    public static void removeElement(int[] array, int elem) {
        for(int i = 0; i < array.length; i ++){
            if(array[i] == elem) {
                if (elem != 0) {
                    array[i] = 0;
                }
                else{
                    array[i] = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] test_array = {1,2,3,4,5,6,7,8};
        removeElement(test_array, 3);

        System.out.println(Arrays.toString(test_array));
    }
}
