package LINKED_LIST;

public class Q5 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        Node head = list.getHead();
        Node tail = list.getTail();
        tail.next = head.next.next;
        System.out.println(getStart(head).data);
    }

    public static Node getStart(Node head){
        Node slow = head;
        Node fast = head;

        while(slow != null && fast.next!= null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        if(slow == fast){
            slow = head;

            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        }

        return fast;
    }
}
