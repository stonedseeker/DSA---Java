package arrays;

class Solution50 {

    public static void main(String[] args) {
        System.out.println(myPow(0.00001,2147483647));
    }
    public static double myPow(double x, int n) {
        if (n >= 0) return helper1(x,n,x);
        else return helper2(x,n,x);
    }

    private static double helper2(double x, int n, double mul) {
        return 1/helper1(x,Math.abs(n),mul);
    }

    public static double helper1(double x, int n, double mul) {
        if (n == 1) return x;
        return helper1(x * mul, --n, mul);
    }
}