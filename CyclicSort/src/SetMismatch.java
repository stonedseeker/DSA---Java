import java.util.Arrays;

public class SetMismatch {

    public static int[] findErrorNums(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+ 1) {
                System.out.println(j);
                return new int [] {nums[j], j + 1};
            }
        }
        return new int [-1];
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,4,2,6,5};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
