package BinarySearchQuestions.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>  nums3 = new ArrayList<>(nums1.length + nums2.length);

        for (int j : nums1)
            nums3.add(j);

        for (int j : nums2)
            nums3.add(j);


        System.out.println(nums3);


        Collections.sort(nums3);

        System.out.println(nums3);
        System.out.println(nums3.size());
        // {1,2,3,4}
        if (nums3.size() % 2 == 0) {
            float prev =  nums3.get((nums3.size() - 1) / 2) ;
            float next = nums3.get((nums3.size()) / 2);
            float ans = prev + next;
            float ans1 = ans / 2;
            return ans1;
        }else {
            float ans =  nums3.get(nums3.size() / 2);
            return ans;
        }

    }

}
