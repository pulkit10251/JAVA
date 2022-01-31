package IMPLEMENTATIONS;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public void add(int val){
        this.heap.add(val);
        upheapify(heap.size() - 1);
    }
    public void display(){
        System.out.println(this.heap);
    }
    private void upheapify(int childIndex) {
        int parentIndex = (childIndex - 1)/2;
        if(this.heap.get(childIndex) < this.heap.get(parentIndex)){
            swap(childIndex, parentIndex);
            upheapify(parentIndex);
        }

    }

    public void swap(int i, int j){
        int temp1 = this.heap.get(i);
        int temp2 = this.heap.get(j);
        this.heap.set(i, temp2);
        this.heap.set(j, temp1);
    }
    public int size(){
        return this.heap.size();
    }

    public int remove(){
        swap(0, this.heap.size()-1);
        int rem = this.heap.remove(this.heap.size()-1);
        downheapify(0);
        return rem;
    }

    public void downheapify(int pi){
        int lci = 2*pi + 1;
        int rci = 2*pi + 2;
        int mini = pi;
        if(lci < this.heap.size() && this.heap.get(mini) > this.heap.get(lci)){
            mini = lci;
        }

        if(rci < this.heap.size() && this.heap.get(mini) > this.heap.get(rci)){
            mini = rci;
        }

        if (mini != pi) {
            swap(pi, mini);
            downheapify(mini);
        }
    }
}
