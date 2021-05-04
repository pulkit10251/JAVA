package LINKED_LIST;

public class Q10 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(7);
        l1.addLast(7);
        l1.addLast(0);
        l1.addLast(5);


        LinkedList l2 = new LinkedList();
        l2.addLast(2);
        l2.addLast(3);
        l2.addLast(0);
        l2.addLast(1);

        Node first = l1.getHead();
        Node second = l2.getHead();

        Node nn = Add(first, second);

        display(nn);

    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node Add(Node first, Node second) {
        first = reverse(first);
        second = reverse(second);

        Node nn =  AddUtil(first, second);

        return reverse(nn);
    }

    public static Node AddUtil(Node first, Node second) {
        Node temp1 = first;
        Node temp2 = second;
        int carry = 0;
        Node nn = new Node(0);
        Node temp = nn;
        int count = 0 ;
        while (temp1 != null || temp2 != null) {
            int sum = 0;
            if (temp1 != null && temp2 != null)
                sum = temp1.data + temp2.data + carry;
            else if (temp1 == null && temp2 != null) {
                sum = temp2.data + carry;
            } else if (temp1 != null && temp2 == null) {
                sum = temp1.data + carry;
            }
            carry = sum >= 10 ? 1 : 0;
            sum = sum %10;
            if (count != 0) {
                temp.next = new Node(sum);
                temp = temp.next;
            }else{
                temp.data = sum;
            }

            if(carry == 1){
                temp.next = new Node(carry);
            }
            count++;
            if (temp1 != null)
                temp1 = temp1.next;
            if (temp2 != null)
                temp2 = temp2.next;
        }

        return nn;
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
}


