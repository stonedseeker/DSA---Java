package ArrayQuestions.src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(Arrays.toString(nums));
        rotate(nums, 5 );
    }

    public  static int kgreater(int k, int[] nums){
        while(k > nums.length){
            k = nums.length;
        }
        return k;
    }
    public static void rotate(int[] nums, int k){
        if (nums.length == 1) return;
        if (nums.length < k)  k = kgreater(k, nums);
        if(nums.length == 2) {
            if (k % 2 == 0) return;
            else {
                int temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }
        }
        for (int i = 0; i < nums.length / 2 ; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
            System.out.println(nums[i]);
        }
        System.out.println(Arrays.toString(nums));
        int i,j=0;
        for (i = 0;i < k/2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(nums));

        for (i = k;i < (nums.length+k)/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - j];
            nums[nums.length - 1 - j] = temp;
            j++;

        }
        System.out.println(Arrays.toString(nums));

    }

//    int[] res = new int[nums.length];
//    int[] pref = new int [k];
//    int i,j;
//        for (i = nums.length - 1, j = 0; i > k && j < pref.length; i--, j++) {
//        pref[j] = nums[i];
//    }
//        for (i = 0; i < pref.length; i++) {
//        res[i] = pref[i];
//    }
//
//        for (i = 0, j = k ; i < nums.length && j < res.length; i++, j++){
//        res[j] = nums[i];
//    }
//        return res;
}
