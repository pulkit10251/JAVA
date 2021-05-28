package LINKED_LIST;

public class Q32 {

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

        list.setHead(Segregate(head, list.size()));

        list.display();
    }

    public static Node Segregate(Node head, int N){
        Node temp = head;
        Node tail = head;
        while(tail.next !=  null){
            tail = tail.next;
        }
        Node prev = null;
        int count = 0;
        while (temp != null && count != N){
            System.out.println(1);
            if(temp.data % 2 != 0 ){
                Node nn = temp;
                if(prev == null){
                    temp = temp.next;
                    nn.next = null;
                    tail.next =  nn;
                    tail = tail.next;
                    head = temp;
                }else{
                    prev.next = temp.next;
                    temp = prev.next;
                    nn.next = null;
                    tail.next = nn;
                    tail = tail.next;
                }
            }else{
                prev = temp;
                temp = temp.next;
            }
            count++;
        }
        return  head;
    }
}
