package SEARCHING_AND_SORT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q27 {

    public static void main(String[] args) {
        int[] startTime = {3, 1, 6, 2};
        int[] endTime = {10, 2, 19, 100};
        int[] profit = {20, 50, 100, 200};

        System.out.println(Job_Scheduling(startTime, endTime, profit));
    }

    public static int Job_Scheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        ArrayList<int[]> val = new ArrayList<>();
        for (int i = 0; i < startTime.length; i++) {
            int[] array = new int[3];
            array[0] = startTime[i];
            array[1] = endTime[i];
            array[2] = profit[i];
            val.add(array);
        }

        val.sort(new Comparator<>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });


        for (int[] temp : val) {
            System.out.println(Arrays.toString(temp));
        }

        int[] dp = new int[n];

        dp[0] = val.get(0)[2];

        for (int i = 1; i < n; i++) {
            int inc = val.get(i)[2];
            int last = -1;
            int low = 0;
            int high = i - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (val.get(mid)[1] <= val.get(i)[0]) {
                    last = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (last != -1) {
                inc += dp[last];
            }
            int exc = dp[i - 1];
            dp[i] = Math.max(inc, exc);
        }


        for (int i = 0; i < n; i++) {
            System.out.print(dp[i]+"  ");
        }


        return dp[n-1];
    }
}
