package MISLANEOUS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Hike {
    public static void main(String[] args) {
        int d = 10;
        int n = 4;
        int[][] arr = {{3,5},{4,7},{5,9},{2,8}};
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            List<Integer> list = map.getOrDefault(arr[i][0], new ArrayList<>());
            list.add(i);
            map.put(arr[i][0], list);
        }
        System.out.println(map);
        int[] a = {800,1600,200,400};
        int k = 2;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int max = 0;
        int maxDay = 1;
        for(int day = 1; day <= d; day++){
            int knowledgeGain = 0;

            for(int index  : map.getOrDefault(day, new ArrayList<>())){
                queue.add(a[index]);
            }
            System.out.println(queue);
            int temp = k;
            if(k > queue.size()){
                temp = queue.size();
            }
            while(temp != 0){
                knowledgeGain += queue.poll();
                temp--;
            }
            if(knowledgeGain > max){
                max = knowledgeGain;
                maxDay = day;
            }
        }
        System.out.println(maxDay);
    }
}
