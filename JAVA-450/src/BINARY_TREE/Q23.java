package BINARY_TREE;

import java.util.ArrayList;

public class Q23 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
//        tree.levelOrder();
        Node root = tree.getRoot();
        boolean bool = check(root,0, -1);
        System.out.println(bool);
//        tree.levelOrder();
    }
    public static boolean check(Node root, int level, int val){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            if(val == -1){
                val = level;
                return true;
            }else{
                if(level == val){
                    return true;
                }else{
                    return false;
                }
            }
        }



        boolean checkLeft = check(root.left, level+1, val);
        boolean checkRight = check(root.right, level+1, val);

        return checkLeft && checkRight;
    }
}
