package LINKED_LIST;

import java.util.HashSet;

public class Q11 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(6);

        LinkedList l2 = new LinkedList();
        l2.addLast(2);
        l2.addLast(4);
        l2.addLast(4);
        l2.addLast(8);

        Node head1 = l1.getHead();
        Node head2 = l2.getHead();

        Node nn = findIntersection(head1, head2);

        display(nn);

    }

    public static void display(Node nn) {
        Node temp = nn;
        System.out.println("--------------------------------");
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

    public static Node findIntersection(Node head1, Node head2) {
        HashSet<Integer> set = new HashSet<>();

        Node temp = head1;

        while (temp != null) {
            set.add(temp.data);
            temp = temp.next;
        }

        Node temp1 = head2;
        Node nn = new Node();
        Node head = nn;
        int count = 0;

        HashSet<Integer> set1 = new HashSet<>();

        while (temp1 != null) {

            if (set.contains(temp1.data)) {
                if(count == 0){
                    nn.data = temp1.data;
                    set1.add(nn.data);
                    count = 1;
                }else{
                    if(!set1.contains(temp1.data)){
                        nn.next = new Node(temp1.data);
                        nn = nn.next;
                        set1.add(temp1.data);
                    }
                }
            }
            temp1 = temp1.next;


        }
        return head;
    }
}
