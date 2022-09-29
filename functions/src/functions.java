//import java.util.List;
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class functions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //input two nums and return sum
//        //System.out.println(sumTwo());
//        //Swap(5,6);
//        int[] arr = new int[4];
//        arr[0] = 5; arr[1] = 2;arr[2] = 6;arr[3] = 1;
////        System.out.println(nextLessThan(arr));
////        nextLessThan(arr);
////        System.out.println(isPrime(9));
////        System.out.println(isArmstong(n));
////        for (int i = 100; i < 1000; i++){
////            if (isArmstong(i)) {
////                System.out.println(i);
////            }
////        }
//        System.out.println(Arrays.toString(nextLessThan(arr)));
//    }
//
//    static int sumTwo(){
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        return a + b;
//    }
//
//    static void Swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a +" "+ b);
//    }
//
//    static List<Integer> nextLessThan(int [] arr) {
//        for (int nums : arr){
//            System.out.println(nums);
//        }
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length; j++) {
//                if (arr[i] > arr[j] && j > i) {
//                    count++;
//                }
//            }
//            arr[i] = count;
//            count = 0;
//        }
//        System.out.println(Arrays.toString(arr));
//        return arr;
//    }
//
//    static boolean isPrime(int n){
//      if (n <= 1) {
//          return false;
//      }
//
//      int c = 2;
//      while (c * c <= n) {
//          if (n % c == 0) {
//              return false;
//          }
//          c++;
//      }
//      return c * c > n;
//    }
//
//    static boolean isArmstong(int n){
//        int original = n;
//        int sum = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            n /= 10;
//            sum += rem * rem * rem;
//        }
//        return  (sum == original);
//    }
//}
