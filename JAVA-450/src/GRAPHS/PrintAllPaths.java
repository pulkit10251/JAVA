package GRAPHS;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllPaths {
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

        int src = sc.nextInt();
        int dest = sc.nextInt();

        boolean[] visited = new boolean[vtces];
        ArrayList<String> list = new ArrayList<>();
        StringBuilder ssf = new StringBuilder();
        ssf.append(src);
        printPath(graph, src, dest, visited,list, ssf);
        System.out.println(list);

    }

    public static void printPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, ArrayList<String> list, StringBuilder ssf){
        if(src == dest){
            list.add(ssf.toString());
            return;
        }
        visited[src] = true;

        for(Edge e : graph[src]){
            if(!visited[e.n]) {
                ssf.append(e.n);
                printPath(graph, e.n, dest, visited, list, ssf);
                ssf.deleteCharAt(ssf.length() - 1);
            }
        }
        visited[src] = false;
    }
}
