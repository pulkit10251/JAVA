package LINKED_LIST;

public class Q12 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(8);
        l1.addLast(12);
        l1.addLast(5);


        Node head2 = new Node();
        head2.data = 10;


        Node first = l1.getHead();


        head2.next = first.next.next;

        System.out.println(findIntersection(first, head2));

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

    public static  int findIntersection(Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;

        if(curr1 == null || curr2 == null){
            return -1;
        }

        while(curr1!=null && curr2!= null && curr1 != curr2){
            curr1 = curr1.next;
            curr2 = curr2.next;


            if(curr1 == curr2){
                return curr1.data;
            }

            if(curr1 == null){
                curr1 = head2;
            }

            if(curr2 == null){
                curr2 = head1;
            }
        }

        return curr1.data;
    }
}
