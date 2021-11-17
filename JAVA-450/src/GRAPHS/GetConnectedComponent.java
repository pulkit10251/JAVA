package GRAPHS;

import java.util.ArrayList;
import java.util.Scanner;

public class GetConnectedComponent {
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

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        // write your code here
        boolean[] visited = new boolean[vtces];

        for(int v = 0; v < vtces; v++){
            if(!visited[v]){
                ArrayList<Integer> comp = new ArrayList<>();
                getConnectedCompponent(graph, v, comp, visited);
                comps.add(comp);
            }
        }

        System.out.println(comps);
    }

    public static  void getConnectedCompponent(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp, boolean[] visited){
        visited[src] = true;
        comp.add(src);
        for(Edge e : graph[src]){
            if(!visited[e.n]){
                getConnectedCompponent(graph, e.n, comp, visited);
            }
        }
    }
}
