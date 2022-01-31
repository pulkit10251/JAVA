package MISLANEOUS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesForce {
    public static void main(String[] args) {
        int[] wt = {5,5,5,5,5};
        int k = 6;
        System.out.println(findNumberOfWagons(wt, k));
    }

    private static int findNumberOfWagons(int[] wt, int k) {
        Arrays.sort(wt);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int val : wt){
            queue.add(val);
        }
        int countWagons = 0;
        while(!queue.isEmpty()){
            int last = queue.removeLast();
            if(queue.size() == 0){
                return countWagons + 1;
            }
            int first = queue.getFirst();
            int secondLast = queue.getLast();
            if(last + secondLast <= k){
                countWagons += (queue.size() + 1)/ 2 + (queue.size() + 1) % 2;
                return countWagons;
            }

            if(first + last <= k){
                countWagons += 1;
                queue.removeFirst();
            }else{
                countWagons += 1;
            }
        }
        return countWagons;
    }
}
