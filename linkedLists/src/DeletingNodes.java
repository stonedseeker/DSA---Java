package linkedLists.src;//237
// bad way to do this

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class DeletingNodes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.println(deleteNode(arr, 3));
    }

    static int linearSearch(int[] arr, int n){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == n ){
                return i;
            }
        }
        return -1;
    }
    static List<Integer> deleteNode(int[] nums, int n) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < linearSearch(nums, n); i++){
            ans.add(nums[i]);
        }

        for(int i = linearSearch(nums, n) + 1; i < nums.length; i++) {
            ans.add(nums[i]);
        }

        return ans;
    }
}
