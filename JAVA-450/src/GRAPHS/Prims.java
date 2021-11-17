package GRAPHS;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prims {

    public static class Pair implements Comparable<Pair>{
        int v;
        int av;
        int wsf;

        Pair(int v, int av, int wsf){
            this.v = v;
            this.av = av;
            this.wsf = wsf;
        }

        public int compareTo(Pair p1){
            return this.wsf - p1.wsf;
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
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>();
        queue.add(new Pair(0,-1,0));
        boolean[] visited = new boolean[vtces];

        while(queue.size() > 0){
            Pair rm = queue.remove();

            if(visited[rm.v]){
                continue;
            }
            visited[rm.v] = true;
            System.out.println(rm.v+" "+rm.av +" "+ rm.wsf);
            for(Edge e : graph[rm.v]){
                if(!visited[e.n]){
                    queue.add(new Pair(e.n, rm.v, e.wt));
                }
            }
        }
    }
}
