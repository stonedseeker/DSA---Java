import java.util.Arrays;

public class numbersSmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] N) {
        int[] count = new int[101];
        int sum = 0;

        for (int j : N) {
            count[j]++;
        }

        for (int i = 0; i < 101; i++) {
            sum += count[i];
            count[i] = sum - count[i];
        }

        for (int i = 0; i < N.length; i++) {
            N[i] = count[N[i]];
        }

        return N;
    }
}
