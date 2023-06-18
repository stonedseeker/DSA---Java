package ArrayQuestions.src;


import java.util.Arrays;

public class AddtoArrayFormInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};

        System.out.println(Arrays.toString(addToArrayForm(arr, 34)));
    }
    public static int[] addToArrayForm(int[] num, int k) {
        int sum = 0;
        int rem = 0;
        for(int i = 0 ; i < num.length ; i++) {
            int n = num.length - 1 - i;
            sum = (int) (sum + num[i] * Math.pow(10,n));
        }

        int[] res = new int[num.length];

        sum += k;

        while(sum > 0) {
            for(int i = 0; i < res.length; i++) {
                rem = sum % 10;
                res[res.length - 1 - i] = rem;
                sum /= 10;
                System.out.println(sum);
            }
        }
        return res;
    }
}

