package GRAPHS;

import java.util.ArrayList;

public class Graph {
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<Edge>[] graphs = new ArrayList[vertices];

        for(int i = 0; i < vertices; i++){
            graphs[i] = new ArrayList<Edge>();
        }

        graphs[0].add(new Edge(0,3));
        graphs[0].add(new Edge(0,1));
        graphs[1].add(new Edge(1,0));
        graphs[1].add(new Edge(1,2));
        graphs[2].add(new Edge(2,3));
        graphs[2].add(new Edge(2,1));
        graphs[3].add(new Edge(3,0));
        graphs[3].add(new Edge(3,2));
        graphs[3].add(new Edge(3,4));

        for(Edge e: graphs[2]){
            System.out.println(e.n + "   " + e.v);
        }
    }
}
