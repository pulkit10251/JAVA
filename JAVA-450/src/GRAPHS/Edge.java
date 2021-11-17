package GRAPHS;

public class Edge {
    int v;
    int n;
    int wt;
    public Edge(int v , int n){
        this.v = v;
        this.n = n;
        this.wt = 0;
    }

    public Edge(int v , int n, int wt){
        this.v = v;
        this.n = n;
        this.wt = wt;
    }
}
