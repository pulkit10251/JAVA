package DP;

public class MinCost {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        int[][] cost = {{0, 1, 4 ,2, 8, 2}, {4, 3, 6, 5, 0, 4},{1, 2, 4, 1, 4, 6}, {2, 0, 7, 3, 2, 2}, {2, 7, 0, 8, 5, 1}};
        int[][] dp = new int[5][5];
        int ans = getMinCost(row, col, dp, cost);
        System.out.println(ans);
    }

    public static  int getMinCost(int row, int col, int[][] dp, int[][] cost){
        // mem -> dp[i][j] represents minimum cost from i,j to destination
        // reverse
        dp[row-1][col-1 ] = cost[row-1][col-1];
        for (int i = dp.length-1; i >=0 ; i--) {
            for (int j = dp[0].length-2; j >=0 ; j--) {
                if(i == dp.length -1){
                    dp[i][j] = dp[i][j+1]+ cost[i][j];
                }else if(j  == dp.length -1){
                    dp[i][j] = dp[i+1][j] + cost[i][j];
                }else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + cost[i][j];
                }
            }
        }

        return dp[0][0];
    }
}
