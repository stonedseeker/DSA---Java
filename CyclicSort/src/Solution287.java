import java.util.Arrays;

class Solution287 {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }

        System.out.println(Arrays.toString(nums));

        if (nums[nums.length-1] < nums[nums.length-2]) return nums[nums.length-1];
        return -1;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}