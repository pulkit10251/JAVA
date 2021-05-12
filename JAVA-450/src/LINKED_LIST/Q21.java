package LINKED_LIST;

public class Q21 {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(8);
        list.addNode(9);


        list.display();
        DNode head = list.head;

        pairSum(head, 7);
    }

    public static void pairSum(DNode head, int x){
        DNode first = head;
        DNode second = head;

        while(second.next != null){
            second = second.next;
        }
        boolean found = false;

        while(first != null && second != null && first != second && second.next != first){
            if(first.data + second.data  == x){
                System.out.println("( "+first.data+" ,"+second.data+" )" );
                found = true;
                first = first.next;
                second  = second.prev;
            }else if(first.data + second.data < x) {
                first = first.next;
            }else{
                second = second.prev;
            }
        }

        if(!found){
            System.out.println("No Pair found");
        }

    }
}
