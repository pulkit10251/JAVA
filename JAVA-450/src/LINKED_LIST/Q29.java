package LINKED_LIST;

public class Q29 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        list.addLast(0);
        list.addLast(0);
        list.addLast(2);
        list.addLast(1);

        Node head = list.getHead();

        list.setHead(segregate(head));

        list.display();

    }

    public static Node segregate(Node head){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                count0 ++;
            }else if(temp.data == 1){
                count1++;
            }else{
                count2++;
            }

            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(count0 != 0){
                temp.data = 0;
                count0 --;
            }else if(count1 != 0){
                temp.data = 1;
                count1--;
            }else{
                temp.data = 2;
                count2--;
            }

            temp = temp.next;
        }

        return head;

    }
}
