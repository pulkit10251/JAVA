package GRAPHS;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfSwaps {

    public static class Pair{
        int val;
        int idx;

        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(minSwaps(arr, n));
    }

    public static int minSwaps(int[] arr, int n){
        Pair[] arr2 = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = new Pair(arr[i], i);
        }
        Arrays.sort(arr2, (a,b)->{
            return Integer.compare(a.val, b.val);
        });

        boolean[] visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n ; i++) {
            if(visited[i] || arr2[i].idx == i){
                continue;
            }

            int len = 0;
            int j = i;
            while(!visited[j]){
                visited[j] = true;
                len++;
                j = arr2[j].idx;
            }

            ans += (len -1);

        }

        return ans;
    }
}
