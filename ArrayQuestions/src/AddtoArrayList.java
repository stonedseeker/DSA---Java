

import javax.swing.*;
import java.util.*;

public class AddtoArrayList {
    public static void main(String[] args) {
            int[] arr = {1,2,0,0};
            System.out.println(addToArrayForm(arr, 34));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        int rem = 0;

        List<Integer> res = new ArrayList<>();

        int i = num.length - 1;
        while(i >= 0 || k > 0) {
            if(i >= 0){
                res.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            }else{
                res.add(k % 10);
                k /= 10;
            }
            i--;
        }
        Collections.reverse(res);
        return res;
    }
}

