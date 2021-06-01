package BINARY_TREE;

import java.util.*;

public class Q11 {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // 50 true 25 true 17 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        Node root = tree.getRoot();

        ArrayList<Integer> list = TopView(root);
        System.out.println(list);
    }


    private static ArrayList<Integer> TopView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        class QueueObj{
            int ht;
            Node node;
            QueueObj( Node node, int ht){
                this.ht = ht;
                this.node = node;
            }
        }
        Queue<QueueObj> q = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>();
        int ht = 0;
        q.add(new QueueObj(root, ht));

        while(!q.isEmpty()){
            QueueObj tmpNode = q.poll();
            if(!map.containsKey(tmpNode.ht)){
                map.put(tmpNode.ht, tmpNode.node);
            }
            if(tmpNode.node.left != null){
                q.add(new QueueObj(tmpNode.node.left, tmpNode.ht-1));
            }
            if(tmpNode.node.right != null){
                q.add(new QueueObj(tmpNode.node.right, tmpNode.ht+1));
            }
        }

        for(Map.Entry<Integer, Node> entry: map.entrySet()){
            result.add(entry.getValue().data);
        }

        return result;
    }
}
