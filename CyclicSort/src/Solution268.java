import java.util.Arrays;

class Solution268 {
    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            System.out.println(Arrays.toString(nums));
            if (nums[i] != nums[correct]) {
                swap(nums,i, correct);
            }else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(Arrays.toString(nums));
            if (nums[j] == j ) continue;
            else return j;

        }
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,5,6,4,3,7};
        System.out.println(missingNumber(arr));
        System.out.println(Arrays.toString(new int[]{missingNumber(arr)}));
    }
}