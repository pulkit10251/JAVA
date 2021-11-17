package IMPLEMENTATIONS;

public class BinaryTreeClient {
    public static void main(String[] args) {
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        BinaryTree tree = new BinaryTree();
        System.out.println();
        System.out.println(tree.height());
        tree.preOrder();
        tree.postOrder();
        tree.inOrder();
        tree.levelOrder();
        System.out.println(tree.serialize());
        tree.deserialize();
    }
}
