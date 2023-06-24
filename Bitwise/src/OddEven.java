

public class OddEven {
    public static void main(String[] args) {
        System.out.println(isEven(9));
        System.out.println(isOdd(5));
    }

    private static int isEven(int n) {
        n = n % 10;
        if ((n & 1) == 1) {
            System.out.println("ODD");
            return 1;
        } else {
            System.out.println("Even");
            return 0;
        }
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}


