package BINARY_TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q2 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        ArrayList<Integer> list = reverseLevelOrder(root); //O(n)
        System.out.println(list);
        printLevelOrderReverse(root);  //O(n^2)

    }

    public static ArrayList<Integer> reverseLevelOrder(Node root){
        Stack<Node> S = new Stack<>();
        Queue<Node> Q = new LinkedList<>();

        ArrayList<Integer> result = new ArrayList<>();

        Q.add(root);

        while(!Q.isEmpty()){
            Node nd = Q.remove();
            S.push(nd);

            if(nd.right !=null ){
                Q.add(nd.right);
            }
            if(nd.left != null){
                Q.add((nd.left));
            }
        }

        while(!S.isEmpty()){
            result.add(S.pop().data);
        }

        return  result;
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



    public static void printLevelOrderReverse(Node root){
        int height = height(root);


        for(int i = height; i >=1 ; i--){
            nthLevel(root, i);
        }
    }
}
