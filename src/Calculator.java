import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans  = 0;

        while (true) {
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
        
                }

                if (op == '-') {
                    ans = num1 - num2;
        
                }

                if (op == '*') {
                    ans = num1 * num2;
        
                }

                if (op == '/') {
                    ans = num1 / num2;
        
                }

                if (op == '%') {
                    ans = num1 % num2;
        
                }
                System.out.println("The answer of " +num1 + op + num2+" is: "+ans);
            }

            
        }
    }
}
