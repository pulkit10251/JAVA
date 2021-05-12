package LINKED_LIST;

public class Q19 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(8);
        l1.addLast(6);
        l1.addLast(5);

        Node head = l1.getHead();
        Node tail = l1.getTail();
        tail.next = head;

        System.out.println(DeleteNode(head, 4).data);

//        display(head);
    }

    public static void display(Node nn) {
        System.out.println("--------------------------------");
        Node temp = nn;
        if (nn != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != nn);
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

    public static Node DeleteNode(Node head, int key) {
        if (head == null)
            return null;
        Node curr = head;
        Node prev = null;
        while (curr.data != key) {
            if (curr.next == head) {
                System.out.println("Not found");
            }
            prev = curr;
            curr = curr.next;
        }

        if (curr == head && curr.next == head) {
            head = null;
            return head;
        }

        if (curr == head) {
            prev = head;
            while (prev.next != head)
                prev = prev.next;
            head = curr.next;
            prev.next = head;
        }else if (curr.next == head) {
            prev.next = head;
        }
        else {
            prev.next = curr.next;
        }

        display(head);
        return curr;
    }
}
