package ARRAY;

public class Q26 {

    public static void main(String[] args) {
        // Maximum profit by buying and selling a share atmost twice
        int[] A = {2, 30, 15, 10, 8, 25, 80, 35, 25, 68, 110};
        int profit = 0;
        int n = A.length;
        // we know that the profit = selling price - buying price
        int[] DPSell = new int[n];
        // DPSell keeps the maximum profit obtained if ith index is the
        // selling point or till ith index we can sell on anyday
        int[] DPBuy = new int[n];
        // DPSell keeps the maximum profit obtained if ith index is the
        // buying point or till ith index from right
        // we can sell on anyday

        int mi=A[0];
        for(int i =1; i<n; i++){
            mi = Math.min(mi, A[i]);
            DPSell[i] = Math.max(DPSell[i-1], A[i]- mi);
        }
        int mo = A[n-1];

        for(int i =n-2; i>=0; i--){
            mi = Math.max(mo, A[i]);
            DPBuy[i] = Math.max(DPBuy[i+1], mo-A[i]);
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(DPBuy[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i <n ; i++) {
            System.out.print(DPSell[i]+ " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            DPSell[i] = DPSell[i] + DPBuy[i];
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(DPSell[i]+ " ");
        }

    }
}
