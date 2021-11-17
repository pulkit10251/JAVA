package GRAPHS;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int v = 0; v < n; v++){
            graph[v] = new ArrayList<>();
        }
        sc.nextLine();
        for (int e = 0; e < k; e++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        for(int v = 0; v < n; v++){
            if(!visited[v]){
                ArrayList<Integer> comp = new ArrayList<>();
                getConnectedComponents(graph, v, comp, visited);
                comps.add(comp);
            }
        }
        System.out.println(comps);

        int pairs = 0;

        for(int i = 0; i < comps.size(); i++){
            for(int j = i+1; j < comps.size(); j++){
                int count = comps.get(i).size() * comps.get(j).size();
                pairs += count;
            }
        }

        System.out.println(pairs);
    }

    public static void getConnectedComponents(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp, boolean[] visited){
        visited[src] = true;
        comp.add(src);

        for(Edge e : graph[src]){
            if(!visited[e.n]){
                getConnectedComponents(graph, e.n, comp, visited);
            }
        }
    }
}
