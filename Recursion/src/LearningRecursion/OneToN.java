package LearningRecursion;

public class OneToN {
    public static void main(String[] args) {
        fun(5);
        System.out.printf("\n\n\n");
        revFun(5);
    }

    private static void revFun(int n) {
        if (n == 0) return;
        revFun(n-1);
        System.out.println(n);
    }
    private static void fun(int n) {
        if (n == 0) return;
        System.out.println(n);
        fun(n-1);
    }
}

