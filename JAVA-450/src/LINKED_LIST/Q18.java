package LINKED_LIST;

public class Q18 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(8);
        l1.addLast(8);
        l1.addLast(1);
        l1.addLast(4);

        Node head = l1.getHead();

        System.out.println(isPalindrome(head));
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


    public static boolean isPalindrome(Node head) {

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            prev = slow;
            slow = slow.next;
        }

        Node newList = slow;
        prev.next = null;



        newList = reverse(newList);

        while (newList != null && head != null) {
            if(newList.data == head.data){
                newList = newList.next;
                head = head.next;
            }else{
                return false;
            }
        }

        return true;
    }
}
