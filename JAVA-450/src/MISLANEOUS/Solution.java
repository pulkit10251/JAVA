package MISLANEOUS;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    class Node implements Comparable<Node>{
        int row;
        int col;
        int price;
        int distance;
        public Node(int row, int col, int price, int distance){
            this.row = row;
            this.col = col;
            this.price = price;
            this.distance = distance;
        }
        
        public int compareTo(Node n1){
            if(this.distance != n1.distance){
                return Integer.compare(this.distance, n1.distance);
            }else if(this.price != n1.price){
                return Integer.compare(this.price, n1.price);
            }else if(this.row != n1.row){
                return Integer.compare(this.row, n1.row);
            }else{
                return Integer.compare(this.col, n1.col);
            }
        }
    }
    int[][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start[0], start[1], grid[start[0]][start[1]], 0));
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[start[0]][start[1]] = true;
        List<List<Integer>> res = new ArrayList<>();
        while(queue.size() != 0){
            int size= queue.size();
            
            for(int i = 0; i < size; i++){
                List<Integer> list = new ArrayList<>();
                Node nn = queue.poll();
                if(grid[nn.row][nn.col] >= pricing[0] && grid[nn.row][nn.col] <= pricing[1]){
                    list.add(nn.row);
                    list.add(nn.col);
                    System.out.println(list);
                }
                if(list.size() !=  0)
                    res.add(list);
                if(res.size() == k){
                    return res;
                }

                int ri = nn.row;
                int cj = nn.col;
                for(int[] dir: dirs){
                    int ni = ri + dir[0];
                    int nj = cj + dir[1];

                    if(ni < 0 || ni >= grid.length || nj < 0 || nj >= grid[0].length|| grid[ni][nj] == 0  ||  visited[ni][nj]){
                        continue;
                    }
                    queue.add(new Node(ni, nj, grid[ni][nj], nn.distance + 1));
                    visited[ni][nj] = true;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][]grid = {{1,2,0,1},{1,3,0,1},{0,2,5,1}};
        int[] pricing = {2,5};
        int[] start = {0,0};
        int k = 3;
        Solution sol = new Solution();
        List<List<Integer>> li = sol.highestRankedKItems(grid, pricing, start, k);
        System.out.println();
        for(List<Integer> list : li){
            System.out.println(list);
        }
    }
}