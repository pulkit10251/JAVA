package BINARY_TREE;

public class Q20 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        int[] inorder = {10, 1, 30, 40, 20};
        int[] preorder = {1, 10, 20, 30, 40};
        Node node = buildTree(inorder, preorder, 0, 0, inorder.length - 1);
        tree.setRoot(node);
        tree.levelOrder();
        System.out.println();
        tree.postOrder();

    }
    static int x = 0;
    public static Node buildTree(int[] inorder, int[] preorder, int n, int start, int end) {
        if (start > end) {
            return null;
        }
        Node new_node = new Node(preorder[x++], null, null);
        if (start == end) {
            System.out.println("new  :" + new_node.data);
            return new_node;
        }
        int index = search(inorder, start, end, new_node.data);
        System.out.println(index);
        new_node.left = buildTree(inorder, preorder, n, start, index - 1);
        new_node.right = buildTree(inorder, preorder, n, index + 1, end);

        return new_node;
    }

    public static int search(int[] arr, int start, int end, int value) {
        int i;
        for (i = start; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

}
