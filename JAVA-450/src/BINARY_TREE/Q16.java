package BINARY_TREE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Q16 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        ArrayList<Integer> list = BoundryTraversal(root);

        System.out.println(list);
    }

    private static ArrayList<Integer> BoundryTraversal(Node root) {
        ArrayList<Integer> left = getLeftSide(root);
        ArrayList<Integer> right = getRightSide(root);
        ArrayList<Integer> leaf = new ArrayList<>();
        getLeafData(root, leaf);
        left.addAll(leaf);
        left.addAll(right);
        return left;
    }

    private static void getLeafData(Node root, ArrayList<Integer> list) {
        if(root ==null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root.data);
        }
        getLeafData(root.left, list);
        getLeafData(root.right, list);
    }

    private static ArrayList<Integer> getRightSide(Node root) {

        ArrayList<Integer> list = new ArrayList<>();
        Node temp = root.right;
        while(temp.right != null){
            list.add(temp.data);
            temp = temp.right;
        }
        Collections.reverse(list);

        return list;
    }

    private static ArrayList<Integer> getLeftSide(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = root;
        while (temp.left != null) {
            list.add(temp.data);
            temp = temp.left;
        }

        return list;
    }
}
