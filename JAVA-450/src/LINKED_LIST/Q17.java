package LINKED_LIST;

public class Q17 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(8);
        l1.addLast(6);
        l1.addLast(5);

        Node head  = l1.getHead();
        Node tail = l1.getTail();
        tail.next = head;

        Node head1=null, head2=null;

        circularHalf(head,head1, head2);


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

    public static void circularHalf(Node head,Node head1 ,Node head2){


        if(head == null){
            return;
        }
        Node slow = head;

        Node fast = head;

        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next.next == head){
            fast = fast.next;
        }
        head1 = head;

        if(head.next != head){
            head2 = slow.next;
        }
        fast.next = slow.next;

        slow.next = head1;

        display(head1);
        display(head2);
    }


}
