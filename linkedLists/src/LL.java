//package linkedLists.src;
//
//public class LL {
//
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public LL() {
//        this.size = 0;
//    }
//
//    public void insertFirst(int val) {
//        Node node = new Node(val);
//        node.next = head;
//        head = node;
//
//        if (tail == null) {
//            tail = head;
//        }
//
//        size++;
//    }
//
//        Node temp = head;
//        while (temp != null) {
//            System.out.printq88(temp.value + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("End");
//    }
//     private class Node {
//         private int value;
//         private Node next;
//
//         public Node(int value) {
//             this.value = value;
//         }
//
//         public Node(int value, Node next) {
//             this.value = value;
//             this.next = next;
//         }
//     }
//}
//r