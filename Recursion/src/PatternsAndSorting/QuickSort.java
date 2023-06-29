package PatternsAndSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        qsort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void qsort(int[] nums, int low, int hi) {
        if (low >= hi) return;
        int s = low, e = hi, mid =  s + (e - s) / 2, pivot = nums[mid];
        while (s <= e) {
            while(nums[s] < pivot) s++;
            while(nums[e] > pivot) e--;
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++; e--;
            }
        }
        //now pivot is at correct index now sort two halves
        qsort(nums, low,e);
        qsort(nums,s,hi);

    }
}
