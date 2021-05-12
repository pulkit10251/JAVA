package LINKED_LIST;

public class Q24 {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        DNode head = list.head;

        head = RotateDList(head,4);
        display(head);
    }

    public static void display(DNode nn) {
        DNode temp = nn;
        System.out.println("--------------------------------");
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("--------------------------------");
    }
    public static DNode RotateDList(DNode head, int k){
        int count = 0;
        DNode temp = head;
        DNode prev = null;
        while(temp.next!= null){
            prev = temp;
            temp = temp.next;
        }
        while(count != k){
            temp.next = head;
            temp.prev = null;
            head.prev = temp;
            prev.next = null;
            head = temp;
            temp = prev;
            prev = temp.prev;
            count++;
        }

        return head;
    }
}
