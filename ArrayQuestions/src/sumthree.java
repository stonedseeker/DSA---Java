import java.util.Arrays;

public class sumthree {
    public static void main(String[] args) {
    long num = 4;
        System.out.println(Arrays.toString(sumOfThree(num)));
    }

    static long[] sumOfThree(long num) {
        long mid = num / 3;
        if( mid - 1 + mid + 1 + mid == num) return new long[] {mid -1, mid, mid + 1};
        else return new long[] {};
    }
}
