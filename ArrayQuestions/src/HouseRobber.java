package ArrayQuestions.src;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1,3,1,3,100};
        System.out.println(money(arr));

    }

    static int money(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}
