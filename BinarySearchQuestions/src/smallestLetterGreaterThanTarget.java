package BinarySearchQuestions.src;

import java.lang.reflect.Array;

public class smallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','g'};
        char target = 'c';
        System.out.println(sollution(arr, target));
    }
    static char sollution(char[] letters,char target){
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){

            int mid = start + (end - start) / 2;
            if (target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
