package GRAPHS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class IsGraphCyclic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vtces = sc.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for(int i = 0; i < vtces; i++){
            graph[i] = new ArrayList<>();
        }

        int edges = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < edges; i++){
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }
        boolean[] visited = new boolean[vtces];
        for(int v = 0; v < vtces; v++){
            if(!visited[v]) {
                boolean res = isCyclic(graph, v, visited);
                if (res) {
                    System.out.println(true);
                    return;
                }
            }
        }

        System.out.println(false);
    }

    public static boolean isCyclic(ArrayList<Edge>[] graph, int src, boolean[] visited){
        ArrayDeque<Integer> queue = new ArrayDeque<>();

//        visited[src] = true;
        queue.offer(src);
        while(queue.size() > 0){
            int size = queue.size();
            int rem = queue.poll();
            if(visited[rem]){
                return true;
            }
            visited[rem] = true;
            for(Edge e : graph[rem]){
                if(!visited[e.n]){
                    queue.offer(e.n);
                }
            }
        }
        return false;
    }
}
