import java.util.Arrays;

public class largestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(largeTriangle(nums));
    }

    static int largeTriangle(int[] nums){
        Arrays.sort(nums);

        for (int i = nums.length - 3; i >= 0; i--) {
            if ( nums[i] + nums[i + 1] > nums[i + 2]) return nums[i] + nums[i + 2] + nums[i + 1];
            return 0;
        }

        return 0;
    }


}
