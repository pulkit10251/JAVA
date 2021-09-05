package DP2;

import java.util.*;

public class MaximumNonOverLappingBridges {
    public static  class  Bridge{
        int n;
        int s;
        public Bridge(int n, int s){
            this.n = n;
            this.s = s;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        ArrayList<Bridge> bridges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            bridges.add(new Bridge(n,s));
        }

        Collections.sort(bridges, new Comparator<Bridge>() {
            @Override
            public int compare(Bridge o1, Bridge o2) {
                if(o1.n != o2.n){
                    return  Integer.compare(o1.n ,o2.n);
                }else {
                    return Integer.compare(o1.s, o2.s);
                }
            }
        });


        int[] dp = new int[m];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int j = 0; j < i ; j++) {
                if(bridges.get(j).s <= bridges.get(i).s){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            if(dp[i] > ans){
                ans = dp[i];
            }
        }
        System.out.println(ans);
    }
}
