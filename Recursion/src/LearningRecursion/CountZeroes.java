package LearningRecursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(3020006));
    }

    private static int countZ(int n) {
        //without helper function
        if (n == 0 ) return n;
        if(n % 10 == 0) return 1 + countZ(n/10);
        else return countZ(n/10);
    }

    static int count(int n) {
        //with helper
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if (n == 0) return c;
        int rem = n % 10;
        if (rem == 0) return helper(n/10, c+1);
        else return helper(n/10,c);

    }


}

