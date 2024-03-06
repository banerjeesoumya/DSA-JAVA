package Arrays.Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = merge_Sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] merge_Sort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int mid = low + (high - low) / 2;


            int[] left = merge_Sort(arr, low, mid);
            int[] right = merge_Sort(arr, mid + 1, high);

            return merge(left, right);
        }

        return arr;
    }

    public static int[] merge (int[] first, int[] second)
    {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mix[k] = first[i];
                i ++;
            }
            else
            {
                mix[k] = second[j];
                j ++;
            }
            k ++;

            while (i < first.length)
            {
                mix[k] = first[i];
                i ++;
                k ++;
            }

            while (j < second.length)
            {
                mix[k] = second[j];
                j ++;
                k ++;
            }
        }
        return mix;
    }
}
