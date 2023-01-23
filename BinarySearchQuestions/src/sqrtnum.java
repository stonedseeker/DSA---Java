package BinarySearchQuestions.src;

import static java.lang.Math.sqrt;

public class sqrtnum {
    public static void main(String[] args) {
        int n = 9;   //2147395599;
        // ans = 46340
        System.out.println(sqrtSemiNoob(n));
    }

    private static int sqrtSemiNoob(int n) {
        int start = 1;
        int end = n/2;

        while ( start <= end) {
            int ans = start * start;
            if (ans == n) return start;
            if (ans < n) start *= 2;
            else end *= 2;
        }
        return sqrtSemiNoob(n - 1);
    }

    static int sqrtNOOB(int n){
        int mid = 0;
        int start = 0; int end = n;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == n) return mid;

            if (mid * mid > n) end = mid - 1;

            else start = mid + 1;
        }
        return sqrtNOOB(n  -  1);
    }


}
