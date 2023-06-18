package BinarySearchQuestions.src;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};

        int target = 10;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range

        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value

            end += (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

//    public int[] searchRange(int[] nums, int target) {
//       int[] ans = {-1, -1};
//
//       ans[0] = search(nums, target, true);
//
//       if (ans[0] != -1) {
//           ans[1] = search(nums, target, false);
//       }
//       return ans;
//    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            //find middle element

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
