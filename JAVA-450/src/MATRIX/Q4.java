package MATRIX;

public class Q4 {

    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int index = mat[0].length-1;
        while(index >= 0 && mat[0][index] ==1){
            index--;
        }
        int row_with_max_ele = 0;
        for(int i = 1; i< mat.length;i++){
            while ( index >=0 && mat[i][index]==1){
                index --;
                row_with_max_ele = i;
            }
        }
        row_with_max_ele = index == mat[0].length-1 ? -1 : row_with_max_ele;
        System.out.println(row_with_max_ele);
    }
}
