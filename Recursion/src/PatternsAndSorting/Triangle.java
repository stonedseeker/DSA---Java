package PatternsAndSorting;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        pattern1(4,0 );
//        pattern2(4, 0);
        int[] nums = {1,4,5,2,1,5,5,1};
        SelectionSort(nums,nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    public static void pattern2(int r, int c) {
        if (r == 0) return;

        if (c < r){
            pattern2(r,c+1);
            System.out.print("*");
        } else {
            pattern2(r-1,0);
            System.out.println();
        }
    }

    private static void bubble(int[] arr, int r, int c) {
        if (r == 0) return;

        if (c < r) {
            if (arr[c] > arr[c+1]) {
            //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r,c+1);
        } else {
            bubble(arr, r-1,0);
        }
    }

    public static void SelectionSort(int[] nums, int r, int c, int max) {
        if (r == 0) return;

        if (c < r){
            if (nums[c] > nums[max])
                SelectionSort(nums, r, c + 1, c);
            else
                SelectionSort(nums, r,c+1,max);
        }

        else {
            int temp = nums[max];
            nums[max] = nums[r - 1];
            nums[r - 1] = temp;
            SelectionSort(nums, r - 1, 0, 0);
        }
    }
}
