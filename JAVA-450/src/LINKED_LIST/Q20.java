package LINKED_LIST;

public class Q20 {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.addNode(60);

        list.display();
        DNode head = list.head;
        list.head = reverseDLL(head);
        list.display();

    }

    public static DNode reverseDLL(DNode  head)
    {
        //Your code here

        DNode temp = null;
        DNode current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}
