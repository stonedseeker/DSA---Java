package ArrayQuestions.src;

import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    private static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    if (nums[0] != 1) return new int[] {nums[j], 1};
                    return new int[] {nums[i], nums[i] + 1};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
