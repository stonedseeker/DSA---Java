import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        // array of primitives
//        arr[0] = 24;
//        arr[1] = 62;
//        arr[2] = 635;
//        arr[3] = 261;
//        arr[4] = 472;

        // input using for loops

//        for( int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        for( int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "stonedseeker";
        System.out.println(Arrays.toString((str)));
    }
}
