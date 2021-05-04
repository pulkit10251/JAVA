package LINKED_LIST;

public class Q1 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        list.ReverseIterative();
        list.display();
        list.ReverseRecursive();
        list.display();

    }

}
