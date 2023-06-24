package arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,6};
        System.out.println(checkSort(arr, 0));
    }

    static boolean checkSort(int[] nums, int index){
        if (index == nums.length-1) return true;
        return nums[index] <= nums[index+1] && checkSort(nums, index + 1);
    }

}
