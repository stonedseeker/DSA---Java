//package ArrayQuestions.src;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class reverseInt {
//    public static void main(String[] args) {
//        System.out.println(reverse(Math.pow(2,31)));
//    }
//
//    static int reverse (int x){
//        int sum = 0;
//        List<Integer> reversed = new ArrayList<>();
//        if (x > 0) {
//            while (x > 0) {
//                int rem = x % 10;
//                reversed.add(rem);
//                x /= 10;
//            }
//
//            for (int i = 0; i < reversed.size(); i++) {
//                sum += reversed.get(i) * Math.pow(10, reversed.size() - 1 - i);
//            }
//        }else{
//            x = Math.abs(x);
//            while (x > 0) {
//                int rem = x % 10;
//                reversed.add(rem);
//                x /= 10;
//            }
//
//            for (int i = 0; i < reversed.size(); i++) {
//                sum += reversed.get(i) * Math.pow(10, reversed.size() - 1 - i);
//            }
//            sum *= -1;
//        }
//
//        return sum;
//    }
//}
//
