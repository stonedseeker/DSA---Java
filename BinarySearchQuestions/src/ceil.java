public class ceil {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceilArr(arr, 15));
    }
    static int ceilArr(int[] arr, int target) {
        int start = arr[0];
        int end = arr[arr.length - 1];

        int mid = start  + (end - start) / 2;

        while (end > start) {
            if (mid >= target) {
                return mid;
            }else if (mid < target) {
                end = mid + 1;
            }else start = mid - 1;
        }
        return start;
    }
}
