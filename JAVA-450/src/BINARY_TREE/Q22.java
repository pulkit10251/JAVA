package BINARY_TREE;

import java.util.ArrayList;

public class Q22 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
//         50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();



        System.out.println(isSumTree(root));
    }
    public static int sum(Node node){
        if (node == null){
            return 0;
        }
        return (sum(node.left) + node.data + sum(node.right));
    }

    public static boolean isSumTree(Node node){
        int ls, rs;
        if(node == null || (node.left == null && node.right == null)){
            return  true;
        }
        ls = sum(node.left);
        rs = sum(node.right);

        return node.data == (ls + rs) && isSumTree(node.left) && isSumTree(node.right);
    }
}
