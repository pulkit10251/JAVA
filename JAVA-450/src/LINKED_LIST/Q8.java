package LINKED_LIST;

public class Q8 {


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        Node head = list.getHead();

        list.setHead(moveLast(head));

        list.display();

    }

    public static Node moveLast(Node head){
        Node tail =  head;

        while (tail.next.next!=null){
            tail = tail.next;
        }


        Node temp = tail.next;


        tail.next = null;

        temp.next = head;

        head = temp;

        return head;
    }
}
