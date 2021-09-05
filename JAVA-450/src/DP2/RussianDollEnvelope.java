package DP2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RussianDollEnvelope {
    public static  class Envelope{
        int w;
        int h;
        public Envelope(int w, int h){
            this.w = w;
            this.h = h;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Envelope[] envelopes = new Envelope[n];
        for (int i = 0; i < n ;i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            envelopes[i] = new Envelope(w,h);
        }

        Arrays.sort(envelopes, new Comparator<Envelope>() {
            @Override
            public int compare(Envelope o1, Envelope o2) {
                return  Integer.compare(o1.w, o2.w);
            }
        });

        int[] dp = new int[n];
        int ans = 0;
        for (int i = 0; i <  n; i++) {
            int max = 0;
            for (int j = 0; j < i ; j++) {
                if(envelopes[j].h < envelopes[i].h &&  envelopes[j].w < envelopes[i].h){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            ans = Math.max(dp[i], max);
        }

        System.out.println(ans);
    }
}
