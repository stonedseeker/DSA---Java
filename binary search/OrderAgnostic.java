public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {56,43,23,12,43,12,41};
        System.out.println(orderAgnosticBS(arr, 56));
    }
    static int  orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find where the array is sorted in accending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;  //might be possible it may exeed the range of integer

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
            }
        }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }

        }
        return  -1;
    }

}
