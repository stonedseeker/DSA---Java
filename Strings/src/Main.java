import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String name1 = "Vaibhav";
        String name2 = new String ("Vaibhav");
        System.out.println(name1 == name2);

        String name3 = "Vaibhav";
        String name4 = "Vaibhav";
        System.out.println(name3 == name3);

        System.out.println(Arrays.toString(new int[] {1,2,4} ));
    }
}