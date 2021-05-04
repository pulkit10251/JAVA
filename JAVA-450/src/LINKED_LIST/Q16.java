package LINKED_LIST;

public class Q16 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(8);
        l1.addLast(6);
        l1.addLast(5);

        Node head  = l1.getHead();
        Node tail  = l1.getTail();

//        tail.next = head;

        System.out.println(isCircular(head));


    }

    public static boolean isCircular(Node head){
            Node temp = head.next;

            while(temp != null){
                if(temp == head){
                    return true;
                }
                temp = temp.next;
            }

            return false;
    }
}
