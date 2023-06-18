package Arrays;

import java.util.*;
public class removeElements27 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(arr));
        System.out.println((removeElement(arr, 2)));
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0, e = nums.length;
        for(int i = 0; i < e; i++) {
            if(nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
