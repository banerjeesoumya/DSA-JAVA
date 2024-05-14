package Arrays.Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {24, 18, 38, 43, 14, 40, 1, 54};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
//        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
//            swapped = false;
            for (int j = 0; j < arr.length  - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
//                    swapped = true;
                }
            }
//            if (!swapped) {
//                break;
//            }
        }
    }
}
