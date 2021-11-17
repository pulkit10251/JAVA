//package BACKTRACKING;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class NQueens {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        List<List<String>> res = solveNQueens(n);
//
//        for(List<String> li  : res){
//            System.out.println(li);
//        }
//    }
//    public static List<List<String>> solveNQueens(int n) {
//        List<List<String>> res = new ArrayList<>();
//        List<String> ans = new ArrayList<>();
//        StringBuilder ssf = new StringBuilder();
//        compute(res, ans, ssf,0, n);
//        return res;
//    }
//
//    public static void compute(List<List<String>> res, List<String> ans, StringBuilder ssf, int row, int n){
//        if(row == n){
//            res.add(ans);
//            return;
//        }
//
//        for(int col = 0; col < n; col++){
////            {
////                ssf.append("Q");
////                compute(res, ans, ssf,row+1, n);
////                ans.remove(ans.size() -1);
////            }else{
////                ssf.append(".");
////            }
//        }
//
//        ans.add(ssf.toString());
//    }
//
//    public static boolean IsSafe(int curRow, int curCol, List<String> prevCols ){
//        for (int row = 0; row < prevCols.size(); row++) {
//            int col = prevCols.get(row);
//            if (curCol == col) return false;  // same column
//            if (curRow - row == Math.abs(curCol - col)) return false;  // diagonal
//        }
//        return true;
//    }
//}
