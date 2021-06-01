package BINARY_TREE;

public class Q5 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();
        tree.levelOrder();
        Node mirror = Mirror(root);
        System.out.println();
        tree.setRoot(mirror);
        tree.levelOrder();
    }

    public static Node Mirror(Node root){
        if(root == null){
            return null;
        }
        Node nn = new Node(root.data, null , null);

        nn.right = Mirror(root.left);
        nn.left = Mirror(root.right);

        return nn;
    }
}
