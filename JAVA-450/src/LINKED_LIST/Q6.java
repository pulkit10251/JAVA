package LINKED_LIST;

public class Q6 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(10);
        list.addLast(30);
        list.addLast(40);
        list.addLast(60);
        list.addLast(60);

        Node head = list.getHead();

        head = removeDuplicates(head);

        list.display();


    }


    public static Node removeDuplicates(Node head) {
                Node temp = head;

                while (temp != null) {
                    if (temp.next != null)
                        if (temp.data == temp.next.data) {
                            Node t = temp.next;
                            if (t.next != null)
                                temp.next = t.next;
                            else
                                temp.next = null;
                        }
                    temp = temp.next;
                }

                return head;
    }
}
