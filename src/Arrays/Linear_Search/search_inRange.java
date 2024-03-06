package Arrays.Linear_Search;

import java.util.Arrays;

public class search_inRange {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, -69, 6, -10};
        int target = -69;
        System.out.println(Arrays.toString(num));
        System.out.println(linearSearch(num, target, 2, 6));
    }

    public static int linearSearch (int[] num, int target, int start, int end){
        if (num.length == 0){
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = num[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
