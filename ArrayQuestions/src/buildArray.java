
import java.util.Arrays;
public class buildArray {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(arrayBuilder(nums)));
        arrayBuilder(nums);
    }
    public static int[] arrayBuilder(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
