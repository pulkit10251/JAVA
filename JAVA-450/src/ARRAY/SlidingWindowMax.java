package ARRAY;

import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,0,5};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        int i = 0;
        int j = 0;

        while(j < nums.length){
            while(queue.size() > 0 && queue.getLast() < nums[j]){
                queue.removeLast();
            }

            queue.add(nums[j]);

            if(j - i+ 1 < k){
                j++;
                continue;
            }

            if(j - i + 1 == k){
                if(nums[i] == queue.peek()){
                    res.add(queue.poll());
                }else {
                    res.add(queue.peek());
                }
                i++;
                j++;
            }
            // System.out.println(queue.peek());
        }
        int[] res1 = new int[res.size()];
        for(int l= 0; l< res1.length; l++){
            res1[l] = res.get(l);
        }
        return res1;
    }
}
