package IMPLEMENTATIONS;

import java.util.Scanner;

public class BinaryTreePrac {
    private class Node{
        int val;
        Node left;
        Node right;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int size;
    Node root;

    public BinaryTreePrac() {
        Scanner sc = new Scanner(System.in);
        this.root = constructTree(sc, null, true);
    }

    public Node constructTree(Scanner sc, Node parent, boolean isLOR){
        if(parent == null){
            System.out.println("Enter the value for a root node : ");
        }else{
            if(isLOR){
                System.out.println("Enter the value for left child of Parent " + parent.val + " :");
            }else{
                System.out.println("Enter the value for right child of Parent " + parent.val + " :");
            }
        }
        int val = sc.nextInt();
        Node temp = new Node(val, null, null);
        this.size ++;
        boolean choice = false;
        System.out.println("Do " + val + " has a left child : ");
        choice = sc.nextBoolean();
        if(choice){
            temp.left = constructTree(sc, temp, true);
        }

        choice = false;
        System.out.println("Do " + val + " has a right child : ");
        choice = sc.nextBoolean();
        if(choice){
            temp.right = constructTree(sc, temp, false);
        }

        return  temp;
    }
    public void display(){
        display(this.root);
    }
    public void display(Node node){
        String str = "";
        if (node.left != null) {
            str = str + node.left.val + "=>";
        } else {
            str = str + "End=>";
        }
        str = str + node.val;
        if (node.right != null) {
            str = str + "<=" + node.right.val;
        } else {
            str = str + "<=End";
        }
        System.out.println(str);
        if (node.left != null) {
            this.display(node.left);
        }
        if (node.right != null) {
            this.display(node.right);
        }
    }
}
