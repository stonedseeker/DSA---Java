import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    
    int max = a;

    if (b > a){
        max = b;
    }
    
    max = Math.max(c, max);
    System.out.println("The greatest number is: "+max);
}
}
