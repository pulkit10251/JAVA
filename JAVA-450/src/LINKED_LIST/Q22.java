package LINKED_LIST;

public class Q22 {

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
        System.out.println(tripletSum(head, 17));
    }


    public static  int countPairs(DNode first, DNode last, int curr,int value){
        int count = 0;

        while(first != null && last != null && first!=last && last.next != first){
            if(curr + first.data + last.data  == value){
                System.out.println("( "+curr+", "+first.data + ", "+last.data +" )");
                count++;
                first = first.next;
                last = last.prev;
            }else if(curr + first.data + last.data < value) {
                first = first.next;
            }else{
                last= last.prev;
            }
        }
        return count;
    }


    public static int tripletSum(DNode head, int x){

        if(head == null)
            return 0;

        DNode current, first, last;

        int count = 0;

        last = head;

        while(last.next != null)
            last = last.next;

        for(current = head ; current != null; current = current.next){
            first = current.next;


            count += countPairs(first, last, current.data ,x);


        }

        return  count;
    }
}
