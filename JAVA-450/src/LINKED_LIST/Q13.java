package LINKED_LIST;

public class Q13 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(8);
        l1.addLast(6);
        l1.addLast(5);

        Node head  = l1.getHead();

        Node sorted = MergeSort(head);

        display(sorted);
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

    public static Node MergeSort(Node head){
        if( head == null || head.next == null){
            return head;
        }

        Node middle = getMiddle(head);

        Node nextofMiddle = middle.next;

        middle.next = null;

        Node left = MergeSort(head);

        Node right = MergeSort(nextofMiddle);


        return SortedMerge(left, right);
    }

    public static Node SortedMerge(Node left, Node right) {
        Node result = null;
        if(left == null){
            return right;
        }
        if(right == null){
            return  left;
        }

        if(left.data <= right.data){
            result = left;
            result.next = SortedMerge(left.next, right);
        }else{
            result = right;
            result.next = SortedMerge(left, right.next);
        }

        return result;
    }

    public static Node getMiddle(Node head)
    {
        if (head == null)
            return head;

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

