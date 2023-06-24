package LearningRecursion;

public class funcPassing {
    public static void main(String[] args) {
        System.out.println(fun1(5));
    }

    private static int fun1(int n) {
        if (n == 0) return 0;
        System.out.println(n);
        return fun1(--n);
    }
}

//n-- --> pass the value and then substract
//--m --> sunstract first and then pass