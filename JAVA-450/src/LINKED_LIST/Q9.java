package LINKED_LIST;

public class Q9 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(9);
        list.addLast(9);
        list.addLast(9);
        list.addLast(9);
        list.addLast(9);
        list.addLast(9);

        Node head = list.getHead();

        list.setHead(AddOne(head));

        list.display();



    }

    static Node reverse(Node head)
    {
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

    public static  Node AddOne(Node head){
        head = reverse(head);
        head =AddOneUtil(head);
        head = reverse(head);

        return head;
    }



    public static Node AddOneUtil(Node head){
        Node curr = head;
        Node prev = head;
        int carry = 1;

        while (curr != null){
            int data = curr.data + carry;
            carry = data >=10 ? 1 : 0;
            data = data % 10;
            curr.data = data;
            curr = curr.next;
        }

        while(prev.next != null){
            prev = prev.next;
        }

        System.out.println(prev.data);

        System.out.println(prev.next);


        if(carry == 1){

            prev.next = new Node(carry);
            System.out.println(prev.next.data);
        }
        return head;
    }
}
