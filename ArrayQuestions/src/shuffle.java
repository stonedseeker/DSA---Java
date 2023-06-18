import java.util.Arrays;

public class shuffle {

//    Input: nums = [2,5,1,3,4,7], n = 3
//    Output: [2,3,5,4,1,7]
//    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7
//    then the answer is [2,3,5,4,1,7].

    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shufflearr(nums, 3)));
    }
    static int[] shufflearr(int[] nums, int n) {
        int[] res = new int[2 * n];
        res = new int[2 * n];

        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }
}
