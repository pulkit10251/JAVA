package HEAP;

import java.util.ArrayList;

class Heap {
    ArrayList<Integer> data = new ArrayList<>();

    public void add(int item) {
        data.add(item);
        upheapify(data.size() - 1);
    }

    private void upheapify(int ci) {
        int pi = (ci - 1) / 2;
        if (data.get(ci) < data.get(pi)) {
            swap(ci, pi);
            upheapify(pi);
        }

    }

    private void swap(int i, int j) {
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i, jth);
        data.set(j, ith);
    }

    public void display() {
        System.out.println(data);
    }

    public int size() {
        return this.data.size();
    }

    public boolean IsEmpty() {
        return this.data.isEmpty();
    }

    public int remove() {
        swap(0, this.data.size() - 1);
        int rv = this.data.remove(data.size() - 1);
        downheapify(0);
        return rv;
    }

    private void downheapify(int pi) {
        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;
        int mini = pi;

        if (lci < this.data.size() && data.get(lci) < data.get(mini)) {
            mini = lci;
        }
        if (rci < this.data.size() && data.get(rci) < data.get(mini)) {
            mini = rci;
        }
        if (mini != pi) {
            swap(pi, mini);
            downheapify(mini);
        }
    }
    public int get(){
        return this.data.get(0);
    }
}

public class heapImplimentation {
    public static void main(String[] args) {
        Heap heap=new Heap();
        heap.add(5);
        //heap.display();
        heap.add(1);
        //heap.display();
        heap.add(3);
        //heap.display();
        heap.add(5);
        // heap.display();
        heap.add(2);
        // heap.display();

        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
        System.out.println(heap.remove());
        heap.display();
    }
}
