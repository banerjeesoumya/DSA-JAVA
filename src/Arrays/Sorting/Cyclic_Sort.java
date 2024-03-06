package Arrays.Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 6, 4, 1, 2, 5};
        sort_Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort_Cyclic (int[] arr){
        //index = value - 1
        //i = arr[i] - 1
        int i = 0;
        while (i < arr.length){
            if (i != (arr[i] - 1)){
                swap(arr, i, (arr[i] - 1));
            } else {
                i ++;
            }
        }
    }

    public static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
