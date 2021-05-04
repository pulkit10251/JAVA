package LINKED_LIST;

class DNode{
    int data;
    DNode prev;
    DNode next;

    public DNode(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {

    DNode head, tail = null;
    int size;

    public void addNode(int data) {
        DNode newDNode = new DNode(data);
        this.size++;
        if (head == null) {
            head = tail = newDNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newDNode;
            newDNode.prev = tail;
            tail = newDNode;
            tail.next = null;
        }
    }

    public void display() {
        DNode current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Doubly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}