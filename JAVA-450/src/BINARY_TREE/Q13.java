package BINARY_TREE;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Q13 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        ArrayList<Integer> list = ZigZagView(root);
        System.out.println(list);
    }

    private static ArrayList<Integer> ZigZagView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> q = new LinkedList<>();
        q.add(root);
        result.add(root.data);
        int l = 1;
        Node temp;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                if (l % 2 == 0) {
                    temp = q.peekLast();
                    q.removeLast();
                } else {
                    temp = q.peekFirst();
                    q.removeFirst();
                }

                if (l % 2 != 0) {
                    if (temp.right != null) {
                        q.addLast(temp.right);
                        result.add(temp.right.data);
                    }
                    if (temp.left != null) {
                        q.addLast(temp.left);
                        result.add(temp.left.data);
                    }
                } else {
                    if (temp.left != null) {
                        q.addFirst(temp.left);
                        result.add(temp.left.data);
                    }
                    if (temp.right != null) {
                        q.addFirst(temp.right);
                        result.add(temp.right.data);
                    }
                }

            }
            l++;
        }
        return result;
    }
}
