package LearningRecursion;

public class fibonaucci {
    public static void main(String[] args) {
//        System.out.println(fibo(6))
//        for (int i = 0; i < 11; i++) {
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));
    }

    private static int fiboFormula(int n) {
       return (int) ((Math.pow((1 + Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }

    private static int fibo(int n) {
        if (n < 2) return n;
        return fibo(n-1) + fibo(n - 2);
    }
}
