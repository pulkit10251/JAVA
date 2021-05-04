package LINKED_LIST;

public class Q15 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(8);
        l1.addLast(6);
        l1.addLast(5);

        Node head  = l1.getHead();

        System.out.println(middleNode(head).data);
    }

    public static Node middleNode(Node head){
        Node fast  = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
