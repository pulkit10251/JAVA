package LINKED_LIST;

public class Q31 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
//        list.addLast(2);
//        list.addLast(3);

        Node head = list.getHead();

        list.setHead(compute(head));

        list.display();
    }

    public static Node compute(Node head) {
        Node temp = head;

        Node prev = null;
        while (temp.next != null) {
            if (temp.next.data > temp.data) {
                if (prev == null) {
                    Node nn = temp.next;
                    temp.next = null;
                    temp = nn;
                    head = temp;
                }else{
                    prev.next = temp.next;
                    temp = prev.next;
                }
            }else {
                prev = temp;
                temp = temp.next;
            }


        }
        return head;
    }


}
