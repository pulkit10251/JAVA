package GRAPHS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class SpreadInfection {

    static class Pair{
        int v;
        int time;

        Pair(int v, int time){
            this.v = v;
            this.time = time;
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
        int t = sc.nextInt();

        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src, 1));
        boolean[] visited = new boolean[graph.length];
        int count = 0;
        while(queue.size() > 0 ){
            Pair rm = queue.removeFirst();
            if(visited[rm.v]){
                continue;
            }
            visited[rm.v] = true;
            if(rm.time >  t){
                break;
            }
            count ++;
            for(Edge e : graph[rm.v]) {
                if(!visited[e.n]) {
                    queue.add(new Pair(e.n, rm.time + 1));
                }
            }
        }

        System.out.println(count);
    }
}
