package ArrayQuestions.src;

import java.util.Arrays;

public class twoSums {
    public static void main(String[] args) {
        int[] arr = {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(Twosums(arr, target)));
    }
    static int[] Twosums(int[] nums, int target){
        int[] ans = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
