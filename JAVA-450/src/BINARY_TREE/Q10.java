package BINARY_TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q10 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        ArrayList<Integer> list = rightView(root);
        System.out.println(list);
    }

    public static ArrayList<Integer> rightView(Node root){
        ArrayList<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();

            for(int i = 0; i< n;i++){
                Node temp = queue.poll();
                if(i == n-1){
                    result.add(temp.data);
                }
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
        return result;
    }
}
