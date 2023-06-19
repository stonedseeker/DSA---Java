package linkedLists.src;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
