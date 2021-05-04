package LINKED_LIST;

import java.util.HashSet;

public class Q7 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(2);
        list.addLast(4);
        list.addLast(2);
        list.addLast(4);
//        list.addLast(60);
//        list.addLast(60);

        Node head = list.getHead();

        head = removeDuplicate(head);

        list.display();
    }

    public static Node removeDuplicate(Node head) {
        HashSet<Integer> set = new HashSet<>();

        Node curr = head;
        Node prev = null;

        while (curr != null) {

            int curval = curr.data;

            if (set.contains(curval)) {
               prev.next = curr.next;
            } else {
                set.add(curval);
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}
