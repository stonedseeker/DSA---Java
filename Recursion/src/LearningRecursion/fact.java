package LearningRecursion;

public class fact {
    public static void main(String[] args) {
        System.out.println(fact(6));
        System.out.println(sumNums(5));
    }

    private static int sumNums(int n) {
        if(n == 0) return 0;
        return sumNums(n-1) + n;
    }

    public static int fact(int n) {
        if (n <= 1) return 1;
        return fact(n-1) * n;
    }


}
