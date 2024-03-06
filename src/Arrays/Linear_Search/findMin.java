package Arrays.Linear_Search;

import java.util.Arrays;

public class findMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(Arrays.toString(arr));
        System.out.println(min(arr));
    }

    public static int min (int[] num){
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min){
                min = num[i];
            }
        }
        return min;
    }

}
