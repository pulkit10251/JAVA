package HEAP;

import java.util.HashMap;

public class Graph {
    public class Vertex{
        HashMap<String, Integer> neighbours = new HashMap<>();
    }

    HashMap<String, Vertex> vertices;

    public Graph(){
        this.vertices = new HashMap<>();
    }

    public void addNode(String name){
        Vertex vtx = new Vertex();
        vertices.put(name, vtx);
    }

    public void addEdge(String s1, String s2, int cost){
        Vertex v1 = vertices.get(s1);
        Vertex v2 = vertices.get(s2);
        if(v1 == null || v2 == null || v1.neighbours.containsKey(s2)){
            return;
        }
        v1.neighbours.put(s2, cost);
        v2.neighbours.put(s1, cost);
    }

}
