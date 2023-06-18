import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class goodPairs {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        //System.out.println(numIdenticalPairs(nums));
        System.out.println(Arrays.toString(nextLessThan(nums)));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }return count;
    }

    public static int[] nextLessThan(int[] nums){
        int count = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            count = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[i] > nums[j]) {
                    count++;
                }
                res[i] = count;
            }
        }
        return res;
    }
}
