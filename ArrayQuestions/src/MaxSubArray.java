package ArrayQuestions.src;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,2,3};
        System.out.println(max(arr));
    }

    static int max(int[] nums){
        int max = nums[0];
        int res = nums[0];
        for(int i = 1; i<nums.length; i++){
            max = Math.max(max+nums[i] , nums[i]);
            res = Math.max(max, res);
        }

        
        return res;
    }
}
