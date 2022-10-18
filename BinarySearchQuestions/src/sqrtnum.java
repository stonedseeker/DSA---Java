package BinarySearchQuestions.src;

public class sqrtnum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sqrt(n));
    }
    static int sqrt(int n){
        int mid = 0;
        int start = 0; int end = n;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == n) return mid;

            if (mid * mid > n) end = mid - 1;

            else start = mid + 1;
        }
        return sqrt(n - 1);
    }
}
