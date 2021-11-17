package IMPLEMENTATIONS;

public class LinkedListClient {
    public static void main(String[] args) throws Exception{
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addFirst(20);
        list.addLast(30);
        list.addFirst(40);
        list.addLast(50);
        list.addFirst(60);
        list.display();
        list.addAt(3, 90);
        list.display();
        list.removeFirst();
        list.display();
        list.removeLast();
        list.display();
        list.removeAt(3);
        list.display();
    }
}
