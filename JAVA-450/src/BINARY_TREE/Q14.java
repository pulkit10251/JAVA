package BINARY_TREE;

public class Q14 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        System.out.println(isBalanced(root));
    }



    private static boolean isBalanced(Node root) {
        if(root == null){
            return true;
        }

        boolean val = isBalanced(root.left) && isBalanced(root.right);


        int l_height = height(root.left);

        int r_height = height(root.right);

        int diff = Math.abs(l_height - r_height);

        if(diff <= 1){
            return val;
        }else{
            return false;
        }
    }

    private static int height(Node node) {
        if (node == null) {
            return -1;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        int height = Math.max(lheight, rheight) + 1;
        return height;

    }
}
