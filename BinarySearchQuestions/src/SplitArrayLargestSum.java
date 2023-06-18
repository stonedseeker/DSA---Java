package BinarySearchQuestions.src;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        System.out.println(splitArray(nums, 2));
    }

    public static int splitArray(int[] nums, int m) {
     int start = 0;
     int end = 0;
     int mid = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 0;

            for (int num : nums){
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    start += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return mid - 3;
    }
}
