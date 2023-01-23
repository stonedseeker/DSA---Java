import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ans  = 0;
        
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        char op = in.next().trim().charAt(0);

        switch(op){
            case '+': ans = num1 + num2; break;
            case '-': ans = num1 - num2; break;
            case '*': ans = num1 * num2; break;
            case '/': ans = num1 / num2; break;

        }
       
                // if (op == '+') {
                //     ans = num1 + num2;
                // }

                // if (op == '-') {
                //     ans = num1 - num2;
                // }

                // if (op == '*') {
                //     ans = num1 * num2;
                // }

                // if (op == '/') {
                //     ans = num1 / num2;
                // }

                // if (op == '%') {
                //     ans = num1 % num2;
        
                // }
                System.out.println("The answer of " + " " + num1 + " " + op + " " +  num2+ " is: "+ ans);
            }

            
}
