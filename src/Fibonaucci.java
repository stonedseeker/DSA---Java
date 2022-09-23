import java.util.Scanner;

public class Fibonaucci {
    public static void main(String[] args) {
        //System.out.println(Fibo(7));
        //System.out.println(numFind(455443,5));
        System.out.println(revNum(23597));
    }
    
    public static int Fibo(int n) {
        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= n) {
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        return i;
    }

    public static int numFind(int num, int n) {
       int count = 0;
       while (num > 0){
        if (num % 10 == n) {
            count++;
        }
        num /= 10;
       }
       return count;
    } 

    public static int revNum(int n) {
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem;
        }
        return ans;
    }
}
