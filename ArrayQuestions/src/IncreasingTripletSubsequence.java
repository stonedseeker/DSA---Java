import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3};
        System.out.println(increasingTriplet(arr));
        System.out.println(arr[arr.length - 2]);
    }
    public static boolean increasingTriplet(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k <  nums.length; k++){
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

