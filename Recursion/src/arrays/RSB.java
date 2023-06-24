package arrays;

public class RSB {
    public static void main(String[] args) {
        int[] nums = {7,8,9,1,2,3,4,5,6};
        System.out.println(SearchRSB(nums, 2, 0, nums.length-1));
    }

    private static int SearchRSB(int[] nums, int target, int s, int e) {
        if (s > e) return -1;

        int mid = s + (e - s) / 2;
        if (nums[mid] == target) return mid;

        if (nums[s] <= mid) {
            if (target >= nums[s] && target <= nums[mid] ) return SearchRSB(nums, target, s, mid - 1);
        } else return SearchRSB(nums, target, mid + 1, e);

        if (target >= nums[mid] && target <= nums[e]) {
            return SearchRSB(nums, target, mid+1, e);
        }
        return SearchRSB(nums, target, s, mid - 1);


    }
}
