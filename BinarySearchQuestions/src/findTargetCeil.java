//ceiling = smallest number in array greater or eqeual to target

public class findTargetCeil {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(biSearch(arr, 18));
    }
    public static int biSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        int mid = start + (end - start) / 2;

        if(arr[mid] >= target) {
            return arr[mid];
        }












        
        if(arr[mid] > target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }

        return start + 1;
    }
}
