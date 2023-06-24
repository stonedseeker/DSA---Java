package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class linearSearchRecur {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,2,2};
//        System.out.println(search(nums, 2, 0));
//        System.out.println(searchLast(nums, 2, nums.length-1));
//        searchAllIndex(nums, 2, 0);
//        System.out.println(ans);
//        ArrayList res = new ArrayList();
//        searchAllIndex2(nums, 2,0,res) ;
//        System.out.println(res);
//        System.out.println(searchAllIndex2(new int[]{1,4,5,23,65,2}, 5, 0, new ArrayList<>()));
          System.out.println(findAllIndex(nums, 2, 0));

//        System.out.println(ans);

    }

    private static int searchLast(int[] nums, int target, int index) {
        if (nums[index] == target) return index;
        else if ( index >= 0) return searchLast(nums,target,--index);
        return -1;
    }

    private static int search(int[] nums, int target, int index) {
        if (nums[index] == target) return index;
        else if (index < nums.length - 1) return search(nums, target,index + 1);
        return -1;
    }

    static ArrayList<Integer> ans = new ArrayList<>();
    private static void searchAllIndex(int[] nums, int target, int index) {
        if(index == nums.length) return;
        if (nums[index] == target) ans.add(index);
        searchAllIndex(nums, target,index + 1);
    }

    private static ArrayList searchAllIndex2(int[] nums, int target, int index, ArrayList<Integer> res) {
        if(index == nums.length) return res;

        if (nums[index] == target) res.add(index);

        return searchAllIndex2(nums, target,index + 1, res);
    }

    private static ArrayList findAllIndex(int[] nums, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (nums.length == index) return list;

        if (nums[index] == target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(nums, target, index + 1);
        System.out.println(ansFromBelowCalls);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
