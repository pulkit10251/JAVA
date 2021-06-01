package BINARY_TREE;

public class Q3 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        System.out.println(height(root));

    }

    public static int height(Node root){
        if(root == null)
            return 0;

        int L_tree = height(root.left);
        int R_tree = height(root.right);

        return Math.max(L_tree, R_tree) + 1;
    }
}
