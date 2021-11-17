package GRAPHS;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            String parts = sc.nextLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0 && !visited[i][j]){
                    getConnectedComponents(arr,i, j, visited);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void getConnectedComponents(int[][] graph, int i, int j,  boolean[][] visited){

        if(i < 0 || i >= graph.length || j < 0 || j >= graph[0].length  || graph[i][j] == 1 || visited[i][j]){
            return;
        }

        visited[i][j] = true;
        getConnectedComponents(graph, i, j+1, visited);
        getConnectedComponents(graph, i+1, j, visited);
        getConnectedComponents(graph, i-1, j, visited);
        getConnectedComponents(graph, i, j-1, visited);
    }
}
