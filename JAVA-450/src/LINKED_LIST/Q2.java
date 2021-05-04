package LINKED_LIST;

public class Q2 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);

        list.display();
        int k = 4;
        Node head = list.getHead();

        head = ReverseK(head, k);

        list.setHead(head);

        list.display();

    }

    public static Node ReverseK(Node node, int k) {

        if (node == null) {
            return null;
        }
        Node curr = node;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if (next != null) {
            node.next = ReverseK(next, k);
        }

        return prev;

    }
}
