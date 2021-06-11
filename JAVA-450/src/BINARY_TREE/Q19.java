package BINARY_TREE;

public class Q19 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        tree.levelOrder();
        Node root = tree.getRoot();
        sumTree(root);
        System.out.println();
        tree.levelOrder();
    }

    public static void sumTree(Node root){
        if(root == null){
            return;
        }
        if(root.right == null && root.left == null){
            root.data = 0;
        }else{
            int left = 0;
            int right = 0;
            if(root.left != null){
                left = root.left.data;
                sumTree(root.left);
                left += root.left.data;
            }
            if(root.right != null){
                right = root.right.data;
                sumTree(root.right);
                right += root.right.data;
            }
            root.data = left + right;
        }

    }
}
