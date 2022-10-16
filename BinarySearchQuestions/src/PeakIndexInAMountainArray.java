package BinarySearchQuestions.src;

public class PeakIndexInAMountainArray {
    // mountain array increases first and decreases after that
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndex(arr));
    }
    public static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // dec part of array
                //this may be the answer but look left

                end = mid;
            } else {
                start = mid + 1; // because mid + 1 ele > mid ele
            }
        }
        return start;

    }

}
