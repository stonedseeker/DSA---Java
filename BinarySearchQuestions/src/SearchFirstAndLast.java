package BinarySearchQuestions.src;

import java.util.Arrays;
import java.util.Objects;

public class SearchFirstAndLast {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(Arrays.toString(searchRange(nums, 0)));
    }

    static int[] searchRange(int[] nums, int target) {

        int [] ans = new int[2];
        for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0; i++, j--) {
            if (nums[i] == target) {
                ans[1] = i;
            }
            if (nums[j] == target) {
                ans[0] = j;
            }
        }
        if (nums.length != 1 ) {
            if (Arrays.equals(ans, new int[]{0, 0})) {
                return new int[] {-1,-1};
            }
        }

        return ans;
    }
}
