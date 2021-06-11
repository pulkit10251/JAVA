package BINARY_TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q15 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        ArrayList<Integer> list = DiagnolTraversal(root);

        System.out.println(list);
    }

    public static ArrayList<Integer> DiagnolTraversal(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if( root == null){
            return result;
        }
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.poll();

            while(temp != null){
                if(temp.left !=null){
                    queue.add(temp.left);
                }
                result.add(temp.data);
                temp = temp.right;
            }
        }

        return result;
    }

}
