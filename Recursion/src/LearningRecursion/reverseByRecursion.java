package LearningRecursion;

public class reverseByRecursion {
    static int sum = 0;
    private static int Rev1(int n) {
        if (n == 0) return 0;
        int rem = n % 10;
        sum = sum * 10 + rem;
        Rev1(n/10);
        return -1;
    }

    private static int rev(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits-1) + helper(n/10,digits-1);
    }

    public static void main(String[] args) {
//        System.out.println(rev(124456, 0));
        rev(1456);
        System.out.println(rev(1234));
    }
}

//        if (i > 6) return 1;
//                int ans =  (int) ((n % 10) * Math.pow(10, i))  + rev(n, i + 1);
//                System.out.println(ans);
//                return ans;