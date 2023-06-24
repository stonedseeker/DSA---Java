package LearningRecursion;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigs(71342));
        System.out.println(productDigs(150515));
    }

    private static int productDigs(int n) {
        if (n == 0) return 1;
        return n % 10 * productDigs(n / 10);
    }

    private static int sumDigs(int n) {
        if (n == 0) return n;
        return n % 10 + sumDigs(n / 10);
    }
}
