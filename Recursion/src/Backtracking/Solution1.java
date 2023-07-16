package Backtracking;

import java.util.Arrays;
import java.util.HashMap;

class Solution1 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum2(new int[]{3,5,6,2,4}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end){
            int sum = nums[start] + nums[end];
            if (sum == target) return new int[] {start, end};
        
            else if (sum < target ) start++;
            else end --;

        }
        return null;
        
    }
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (map.containsKey(k)) return new int[] {map.get(k),i};
            map.put(nums[i],i);
        }
        return null;
        }

    }


        // int length=nums.length;
        // for(int i=1;i<length;i++)
        // {
        //     for(int j=i;j<length;j++)
        //     {
        //         if(nums[j]+nums[j-i]==target)
        //         {
        //             return new int[]{j,j-i};
        //         }
                    
        //     }
        // }
        // return null;