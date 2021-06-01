package BINARY_TREE;

import java.util.Stack;

public class Q7 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();
        // Recursive
        tree.preOrder();

        PreOrderIterative(root);
    }

    public static void PreOrderIterative(Node root){

        if(root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();

        stack.push(root);

        while(!stack.empty()){
            Node curr = stack.pop();
            System.out.print(curr.data + " ");

            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
        }
    }
}
