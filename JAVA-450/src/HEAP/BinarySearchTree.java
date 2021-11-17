package HEAP;

public class BinarySearchTree {
    public class Node{
        Node left;
        Node right;
        int data;
    }

    private Node root;

    public BinarySearchTree(int[] arr){
        this.root = construct(arr, 0 , arr.length -1);
    }

    public Node construct(int[] arr, int lo, int hi){
        if (lo > hi ){
            return null;
        }
        int mid = (lo+hi)/2;
        Node nn = new Node();
        nn.data = arr[mid];
        nn.left = construct(arr, lo, mid-1);
        nn.right = construct(arr,mid+1, hi);
        return nn;
    }
}
