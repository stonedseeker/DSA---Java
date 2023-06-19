import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/974957711/
//Asked in google
//Asked in google
class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }

        List<Integer> res = new ArrayList();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) res.add(j+1);
        } 

        return res;
    }
    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}