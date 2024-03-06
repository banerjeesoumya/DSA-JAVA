package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println("Before Reversing :- ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Reversing :- ");
        /*swap(arr, 1, 3);*/
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse (int[] arr)
    {
        int start = 0, end = arr.length - 1;
        while (start < end)
        {
            swap(arr,start,end);
            start ++;
            end --;
        }
    }
    public static void swap (int[] a, int index1, int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
