import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {
     // print numbers from 1 to 5

    //  for (int i = 1; i <= 5; ++i){
    //     System.out.println(i);
     
    Scanner in = new Scanner(System.in);
    int n  = in.nextInt();

    // for (int num = 1; num <= n; num++){
    //     System.out.println("Hello World");
    // }

    // int num = 0;
    // while (num <= n){
    //     System.out.println("hmmmmmm"+num);
    //     num++;
    // }

    //when u want to run the loop atleast one time

    int num = 1;
    do {
        System.out.println(num);
        num++;
    } while (num<=n);
    }
}
