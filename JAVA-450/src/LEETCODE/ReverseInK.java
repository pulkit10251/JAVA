package LEETCODE;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseInK {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
//        l4.next = l5;
        ListNode res = reverseKGroup(l1, 2);
        while(res!= null){
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        int i = 0;
        ListNode start = head;
        ListNode end = head;
        int count = 1;
        List<ListNode> list = new ArrayList<>();
        while(end != null){
            if(count % k == 0){
                ListNode temp = end.next;
                end.next = null;
                ListNode rev = reverse(start);
                list.add(rev);
                start = temp;
                end = temp;
                count++;
            }else {
                end = end.next;
                count++;
            }
        }
        list.add(start);
        System.out.println(list.size());
        for(int l = 0; l < list.size()-1; l++){
            ListNode temp = list.get(l);
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = list.get(l+1);
        }
        return list.get(0);
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null ;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
