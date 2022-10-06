package ArrayQuestions.src;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {4,3,2,9};
        System.out.println(Arrays.toString(plus(arr)));

    }
    static int[] plus(int[] arr){
        if (arr[arr.length - 1] != 9){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += (int) (arr[i] * Math.pow(10, arr.length - 1 - i));
            }
            sum += 1;
            System.out.println(sum);
            int rem = 0;

            for(int i = arr.length - 1, j = sum % 10; i > 0 && j > 0; i--, j /= 10){
                arr[i] = j;
            }

            return arr;
        }else{
            int[] res = new int[arr.length + 1];
            res = arr;
            while (arr[arr.length - 1] == 9)
                res[res.length - 1] = 0;
            res[res.length - 2]++;
            return res;
        }
    }
}



