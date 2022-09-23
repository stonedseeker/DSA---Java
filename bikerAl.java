import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bikerAl {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain){
        int max = 0;
        int n = gain.length;
        int[] al = new int[gain.length + 1];
        al[0] = 0;
        for (int i = 1; i <= n; i++) {
            al[i] = al[i - 1] + gain[i - 1];
            }

        System.out.println(Arrays.toString(al));
        max = al[0];
        for (int i : al) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
