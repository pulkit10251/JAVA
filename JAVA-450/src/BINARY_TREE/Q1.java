package BINARY_TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q1 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        ArrayList<Integer> list= LevelOrder(root);
        System.out.println(list);

        System.out.println(height(root));
        printLevelOrder(root);
    }

    public static ArrayList<Integer> LevelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node nd = queue.remove();
            result.add(nd.data);
            if(nd.left != null){
                queue.add(nd.left);
            }
            if(nd.right != null){
                queue.add(nd.right);
            }
        }
        return result;
    }

    public static int height(Node root){
        if(root  == null){
            return 0;
        }
        int L_height = height(root.left);
        int R_height = height(root.right);

        return Math.max(L_height , R_height) + 1;
    }

    public static void nthLevel(Node root, int level){
        if(root == null)
            return;
        if(level == 1){
            System.out.print(root.data+" ");
        }else if(level > 1){
            nthLevel(root.left, level-1);
            nthLevel(root.right, level - 1);
        }
    }



    public static void printLevelOrder(Node root){
        int height = height(root);

        for(int i = 1; i <= height ; i++){
            nthLevel(root, i);
        }
    }
}
