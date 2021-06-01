package BINARY_TREE;

import java.util.Stack;

public class Q6 {

    public static void main(String[] args) {
        //InOrder

        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();
        // Recursive
        tree.InOrder();

        InOrderIterative(root);
    }

    public static void InOrderIterative(Node root){
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(!stack.empty() || curr != null){
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }else{
                curr = stack.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }
    }
}
