package BINARY_TREE;

import java.util.HashSet;

public class Q24 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        System.out.println(dupSub(root));
    }

    public static int dupSub(Node root){
        HashSet<String> subtrees = new HashSet<>();
        String result = dupSubUtil(root,subtrees);

        if(result == ""){
            return 1;
        }else{
            return 0;
        }
    }

    public static String dupSubUtil(Node root, HashSet<String> subtrees){
        String s = "";

        if (root == null)
            return s + '$';

        String lStr = dupSubUtil(root.left,subtrees);
        if (lStr.equals(s))
            return s;

        String rStr = dupSubUtil(root.right,subtrees);
        if (rStr.equals(s))
            return s;

        s = s + root.data + lStr + rStr;

        if (s.length() > 3 && subtrees.contains(s))
            return "";

        subtrees.add(s);
        return s;
    }
}
