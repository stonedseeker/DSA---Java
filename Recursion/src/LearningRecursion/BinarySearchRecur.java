package LearningRecursion;//there are two things happening
//1. division of the arrray into two arrays
//2. Searching in the array of length n/2.
//F(n) = O(1) + F(N/2)
//Types of recurrence relations
//Linear recurrence relations (fibonaucci numbers)
//

public class BinarySearchRecur{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(search(arr,4,0, 7));
    }

    static int search(int[] arr, int  target, int s, int e) {
        if (s > e) return -1;

        int m = s + (e - s) / 2;

        if (arr[m] == target) return m;
        else if (arr[m] < target) return search(arr, target, s, m - 1 );
        else return search(arr, target, m + 1, e);
    }
}
