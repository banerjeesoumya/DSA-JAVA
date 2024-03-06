package Arrays.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 1};
        selection_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

     public static void selection_Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap (int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

