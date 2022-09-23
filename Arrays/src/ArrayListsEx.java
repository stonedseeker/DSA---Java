import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsEx {
    public static void main(String[] args) {
        //syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(69);
//        list.add(69);
//        list.add(69);
//        list.add(69);
//        list.add(69);list.add(69);
//        list.add(69);list.add(69);list.add(69);list.add(69);list.add(69);list.add(69);list.add(69);list.add(69);list.add(69);
//        list.set(0,99);
        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }







    }
}
