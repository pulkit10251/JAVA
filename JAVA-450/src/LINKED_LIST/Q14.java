package LINKED_LIST;

public class Q14 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(8);
        l1.addLast(6);
        l1.addLast(5);

        Node head  = l1.getHead();

//        quickSort(head);
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

    public static  Node pivot(Node start, Node end){
        int pivot = end.data;

        Node curr = start;
        return null;
    }

    public static void quickSort(Node head){

    }


}
