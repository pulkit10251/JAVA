package GRAPHS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class BredthFirstTraversal {
    static class Pair{
        int src;
        String psf;
        Pair(int src, String psf){
            this.src = src;
            this.psf = psf;
        }
    }
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
            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        int src = sc.nextInt();
        bfs(graph, src);
    }

    public static void bfs(ArrayList<Edge>[] graph, int src){
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, "" + src));
        boolean[] visited = new boolean[graph.length];
        visited[src] = true;
        while(queue.size() > 0){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                Pair rem = queue.poll();
                System.out.println(rem.src+ "@" + rem.psf);
                for(Edge e : graph[rem.src]){
                    if(!visited[e.n]){
                        queue.offer(new Pair(e.n, rem.psf + e.n));
                        visited[e.n] = true;
                    }
                }
            }
        }
    }
}
