package Arrays.Binary_Search;

public class Binary_Search {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binary_Search(arr, target);
        System.out.println(ans);
    }

    //return the index if target element found
    //else return -1 if target element not found

    public static int binary_Search (int[] arr, int target){
        int start = 0, end  = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1; // for the given array is in descending order then (start = mid + 1);
            } else if (target > arr[mid]) {
                start = mid + 1; // for the given array is in descending order then (end = mid -  1);
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
