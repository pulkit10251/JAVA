package IMPLEMENTATIONS;

import java.util.*;
import java.util.LinkedList;

public class BinaryTree {
    private class Node {
        private int data;
        private Node left;
        private Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    Node root = null;
    int size = 0;

    BinaryTree(){
        Scanner sc = new Scanner(System.in);
        this.root = takeInput(sc, null, false);
    }

    private Node takeInput(Scanner sc, Node parent, boolean isLOR){
        if(parent == null){
            System.out.println("Enter the data for root node");
        }else{
            if(isLOR){
                System.out.println("Enter the left child of " + parent.data);
            }else{
                System.out.println("Enter the right child of " + parent.data);
            }
        }

        int NodeData = sc.nextInt();
        Node node = new Node(NodeData, null, null);
        this.size++;

        boolean choice = false;

        System.out.println("Do you have left child of " + node.data);
        choice = sc.nextBoolean();
        if (choice) {
            node.left = takeInput(sc, node, true);
        }

        choice = false;
        System.out.println("Do you have right child of " + node.data);
        choice = sc.nextBoolean();
        if (choice) {
            node.right = takeInput(sc, node, false);
        }
        return node;
    }

    public int height(){
        return this.height(this.root);
    }

    private int height(Node node){
        if(node == null){
            return -1;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        return Math.max(lheight, rheight) + 1;
    }

    public void preOrder(){
        System.out.println();
        preOrder(this.root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        System.out.println();
        postOrder(this.root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + ", ");
    }

    public void inOrder(){
        System.out.println();
        inOrder(this.root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + ", ");
        inOrder(node.right);
    }


    public void levelOrder(){
        System.out.println();
        levelOrder(this.root);
    }

    private void levelOrder(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(q.size() > 0){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node rm = q.poll();
                System.out.print(rm.data + ", ");
                if(rm.left != null){
                    q.add(rm.left);
                }
                if(rm.right != null){
                    q.add(rm.right);
                }
            }
        }
    }

    public boolean isBST(){
        System.out.println( );
        return this.isBST(this.root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean isBST(Node node, int max, int min){
        if(node == null){
            return true;
        }

        if(node.data > max || node.data  < min){
            return false;
        }else if(!isBST(node.left, node.data, min)){
            return false;
        }else if(!isBST(node.right, max, node.data)){
            return false;
        }

        return true;
    }

    public String serialize(){
        System.out.println();
        return serialize(this.root);
    }

    private String serialize(Node node){
        if(node == null){
            return "null";
        }
        return node.data + "," + serialize(node.left) + "," + serialize(node.right);
    }

    public void deserialize(){
        String tree = serialize();
        Node temp = deserialize(tree);
        preOrder(temp);
        System.out.println();
        postOrder(temp);
        System.out.println();
        inOrder(temp);

    }

    private Node deserialize(String data){
        String[] tree = data.split(",");
        Queue<String> q = new LinkedList<>();
        q.addAll(Arrays.asList(tree));
        return helper(q);
    }

    private Node helper(Queue<String> q){
        String rm = q.poll();
        if(rm.equals("null")){
            return null;
        }

        int value = Integer.parseInt(rm);
        Node temp = new Node(value,null,null);
        temp.left = helper(q);
        temp.right = helper(q);
        return temp;
    }

}
