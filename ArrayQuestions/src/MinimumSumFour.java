//package ArrayQuestions.src;
//
////https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
//
//import java.util.Arrays;
//
//public class MinimumSumFour {
//    //2932
//    //4009
//
//
//    public static void main(String[] args) {
//        int num = 4009;
//        System.out.println(minimumSum(num));
//    }
//
//    static int minimumSum(int num) {
//        int[] nums = new int[4];
//
//        for (int i = 0; i < 4; i++) {
//            int rem = num % 10;
//            nums[i] = rem;
//            num /= 10;
//        }
//
//        int min = Integer.MAX_VALUE;
//        int[] newArr = new int[4];
//
//        for  (int i = 0; i < nums.length; i++) {
//            for (int j = ; j < nums.length - i; j++) {
//            if (nums[i] < min) {
//                newArr[i] = nums[i];
//            }
//            }
//        }
//
//        System.out.println(Arrays.toString(newArr));
//        int num1 = nums[0] * 10 + nums[2];
//        int num2 = nums[1] * 10 + nums[3];
//
//    return num1 + num2;
//    }
//}
