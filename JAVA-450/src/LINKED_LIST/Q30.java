package LINKED_LIST;

public class Q30 {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(9);
        l1.addLast(4);
        l1.addLast(6);
        l1.addLast(6);
        l1.addLast(5);

        Node h1 = l1.getHead();

        LinkedList l2 = new LinkedList();
        l2.addLast(8);
        l2.addLast(4);

        Node h2 = l2.getHead();


        System.out.println(Multiply(h1, h2));
    }

    public static long Multiply(Node h1, Node h2) {

        long num1 = 0;
        long num2 = 0;

        while (h1 != null || h2 != null) {
            if (h1 != null) {
                num1 = num1 * 10 + h1.data;
                h1 = h1.next;
            }
            if (h2 != null) {
                num2 = num2 * 10 + h2.data;
                h2 = h2.next;
            }
        }

        System.out.println(num1 + "   " + num2);
        return num1 * num2;
    }
}
