import java.util.Arrays;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
            series += ch;
        }
        System.out.println(series);
        System.out.println("a" + Arrays.toString(new int[]{1,2,3,4,5}));
    }
}
