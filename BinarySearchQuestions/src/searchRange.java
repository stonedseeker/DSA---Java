//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package BinarySearchQuestions.src;

import java.util.Arrays;
import java.util.Scanner;

public class searchRange {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cmp()));

    }
    static int[] cmp(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        int[] solve = {a,b};
        return solve;
    }
}
