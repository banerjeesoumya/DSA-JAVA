package Arrays.Binary_Search;

import java.util.Scanner;

public class OrderAgnostic_binaryS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, target;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        ;
        //int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        //int [] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int [] arr = new int[n];

        System.out.println("Enter the target to be searched: ");
        target = sc.nextInt();
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    public static int orderAgnostic (int[] arr, int target){
        int start = 0, end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }

            //check for ascending order of the array
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            //check for descending of the array
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
