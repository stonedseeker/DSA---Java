import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Vaibhav Singh Chandel";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("    Vaibhav    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.toLowerCase());
        System.out.println(name.compareToIgnoreCase(""));
    }
}

