package Arrays.Linear_Search;

import java.util.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 5;
        System.out.println(Arrays.toString(num));
        System.out.println(linearSearch(num, target));
    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1

    public static int linearSearch(int[] arr, int target)
    {
        if (arr.length == 0){
            return -1;
        }

        //iterating through the entire the array

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
