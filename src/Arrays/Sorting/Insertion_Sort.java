package Arrays.Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 13, 6};
        System.out.println(arr.length);
        insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion_Sort (int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]){
                    break;
                }
                swap(arr, j, j - 1);
            }

        }
    }

    public static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
