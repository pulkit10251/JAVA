package LINKED_LIST;

public class Q33 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(17);
        list.addLast(15);
        list.addLast(8);
        list.addLast(9);
        list.addLast(2);
        list.addLast(4);
        list.addLast(6);
//        list.addLast(3);
        Node head = list.getHead();
        System.out.println(getNthfromLast(head, 8));


        list.display();
    }

    public static int getNthfromLast(Node head, int n){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int count1 = 0;
        Node temp1 = head;
        if(count - n < 0){
            return -1;
        }

        while(count1 != count - n){
            count1++;
            temp1 = temp1.next;
        }
        return  temp1.data;
    }
}
