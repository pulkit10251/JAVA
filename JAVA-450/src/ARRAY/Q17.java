package ARRAY;

import java.util.Arrays;

public class Q17 {

    public static void main(String[] args) {
        // QUES 17 : BEST time to buy and sell
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));

    }

    public static int maxProfit(int[] prices) {
        int min = 1000;
        int index = 0;
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] < prices[i]) {
                continue;
            }
            int max = -1;
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(prices[j], max);
            }
            profit = Math.max(max - prices[i], profit);

        }


        return profit;

    }

    public static int maxProfit2(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}