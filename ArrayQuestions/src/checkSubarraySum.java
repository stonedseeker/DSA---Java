package ArrayQuestions.src;

public class checkSubarraySum {
    public static void main(String[] args) {
       int[] nums = {23,2,4,6,6};
       int k = 7;
       System.out.println(isSubarraySum(nums, k));
    }

    private static boolean isSubarraySum(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            while (sum % k != 0){
                sum += nums[i] + nums[i++];
            }
        }
        return false;
    }
}
