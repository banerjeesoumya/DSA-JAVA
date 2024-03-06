package Arrays.Binary_Search;

import java.util.Arrays;

public class Sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    //search in the row provided and in between the columns provided
    public static int[] binarySearch (int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }


        int rStart = 0, rEnd = rows - 1;
        int cMid = cols/2;

        //run the loop till 2 rows are remaining

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        //now we have got only two rows remaining
        //further we gonna check if the target is within the columns of the  two rows that are remaining
        
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        } else if (matrix[rStart + 1][cMid] == target) {
            return new int[] {rStart + 1, cMid};
        }

        //Searching in the 1st half of two remaining rows
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //Searching in the 2nd half of two remaining rows
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        //Searching in the 3rd half of two remaining rows
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        }
        //Searching in the 4th half of two remaining rows
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
