package LINKED_LIST;

public class GRAPH {


    public static void main(String[] args) {
        int n= 4;
        int[][] adjMatrix = {{0,1,1,0},{1,0,0,1},{1,0,1,1},{0,0,1,0}};

        for(int i = 0; i < n; i++){
            for(int j= 0 ;j< n ;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
