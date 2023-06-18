public class learningBinaryArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7,7,8,9,10};
        System.out.println(binarySearch(arr, 1));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while (start <= end) {

           int mid = start + (end - start) / 2;  //might be possible it may exeed the range of integer

           if (target < arr[mid]){
               end = mid - 1;
           }else if(target > arr[mid]){
               start = mid + 1;
           }else{
               return mid;
           }
        }
        return -1;
    }
}
