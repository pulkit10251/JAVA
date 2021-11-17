package GRAPHS;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {
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

        boolean[] visited = new boolean[vtces];
        Stack<Integer> st = new Stack<>();

        for(int v = 0; v < vtces; v++){
            if(!visited[v]){
                topologicalSort(graph, v, visited, st);
            }
        }

        while(!st.empty()){
            System.out.println(st.pop());
        }
    }

    public static void topologicalSort(ArrayList<Edge>[] graph,int src, boolean[] visited, Stack<Integer> st){
        visited[src] = true;

        for(Edge e : graph[src]){
            if(!visited[e.n]){
                topologicalSort(graph, e.n, visited, st);
            }
        }

        st.push(src);
    }
}
