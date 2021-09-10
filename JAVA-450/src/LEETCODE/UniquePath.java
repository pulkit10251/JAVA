package LEETCODE;

import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        int[][] arr = {{1,0}};

        System.out.println(uniquePathsWithObstacles(arr));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1){
            return 0;
        }
        for(int i =m-1; i >=0; i--){
            for(int j = n-1; j >=0 ; j--){
                if(i == m-1 && j == n-1){
                    dp[i][j] = obstacleGrid[i][j] == 1?0 : 1;
                }else if(i == m-1){
                    dp[i][j] = obstacleGrid[i][j+1] == 1 ? 0 : dp[i][j+1];
                }else if(j == n-1){
                    dp[i][j] = obstacleGrid[i+1][j] == 1 ? 0 : dp[i+1][j];
                }else{
                    if(obstacleGrid[i][j] != 1){
                        dp[i][j] += obstacleGrid[i][j+1] == 1 ? 0 : dp[i][j+1];
                        dp[i][j] += obstacleGrid[i+1][j] == 1 ? 0 : dp[i+1][j];
                    }
                }
            }
        }

        for(int i = 0; i< m; i++){
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[0][0];
    }
}
