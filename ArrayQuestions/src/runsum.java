import java.util.Arrays;

public class runsum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(alternate(nums)));
    }
   static int[] runningSum(int[] nums) {

        int sum = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res[i] = sum;
        }return res;
   }

   static int[] alternate(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] + nums[i];
        }
        return  res;
   }
}

