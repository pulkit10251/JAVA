package IMPLEMENTATIONS;

public class heapCl {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(5);
        heap.display();
        heap.add(10);
        heap.display();
        heap.add(7);
        heap.display();
        heap.add(15);
        heap.display();
        heap.add(6);
        heap.display();
        heap.add(25);
        heap.display();
        heap.add(35);
        heap.display();
        heap.add(4);
        heap.display();

        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();

    }
}
