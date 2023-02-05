package BinarySearchQuestions.src;

import java.util.Arrays;

public class twoSumTwo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    private static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int ans = arr[start] + arr[end];
            if ( ans == target) return new int[] {start + 1, end + 1};

            else if (ans < target) {
                start++;
            } else{
                end --;
            }
        }

        return new int[] {-1,-1};
    }

    private static int[] twoSumNOOB(int[] arr, int target) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] + arr[j] == target) return new int[] {i + 1, j + 1};
            }
        }
        return new int[] {-1,-1};
    }


}
