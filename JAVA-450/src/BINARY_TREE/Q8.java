package BINARY_TREE;

import java.util.Stack;

public class Q8 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();
        // Recursive
        tree.postOrder();

        PostOrderIterative(root);
    }

    public static void PostOrderIterative(Node root){
        if(root == null){
            return;
        }

        Stack<Node> stack  = new Stack<>();
        Stack<Node> output = new Stack<>();
        stack.push(root);

        while(!stack.empty()){
            Node curr = stack.pop();

            output.push(curr);

            if(curr.left != null){
                stack.push(curr.left);
            }
            if(curr.right != null){
                stack.push(curr.right);
            }
        }

        while (!output.empty()){

            System.out.print(output.pop().data+",  ");
        }
    }
}
