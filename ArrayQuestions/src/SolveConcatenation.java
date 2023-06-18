import java.util.Arrays;

public class SolveConcatenation {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
           res[i] = nums[i];
            res[i + nums.length] = res[i];
        }
        return res;
    }
}
