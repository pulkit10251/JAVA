package ARRAY;

public class Q12 {
    static int[] A1 = {5, 15, 25, 35, 45, 55, 65,};
    static int[] A2 = {10, 20, 30, 40};
    public static void main(String[] args) {

//        int[] res = mergedArray(A1, A2);
//
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i] + " ");
//        }

        mergeArrayNoSpace(A1, A2, A1.length, A2.length);
        for (int i = 0; i < A1.length; i++) {
            System.out.print(A1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < A2.length; i++) {
            System.out.print(A2[i]+" ");
        }
    }

    public static int[] mergedArray(int[] A1, int[] A2) {
        int[] merged = new int[A1.length + A2.length];
        int p1 = 0;
        int p2 = 0;
        int i;
        for (i = 0; i < merged.length; i++) {
            if (p1 == A1.length || p2 == A2.length) {
                break;
            }
            if (A1[p1] < A2[p2]) {
                merged[i] = A1[p1];
                p1++;
            } else {
                merged[i] = A2[p2];
                p2++;
            }
        }
        while (p1 != A1.length) {
            merged[i] = A1[p1];
            p1++;
            i++;
        }
        while (p2 != A2.length) {
            merged[i] = A2[p2];
            i++;
            p2++;
        }
        return merged;
    }

    public static void mergeArrayNoSpace(int[] arr1, int[] arr2, int m, int n) {
        for(int i = n-1; i>=0;i--){
            int last = arr1[m-1];
            int j;
            for(j=m-2 ; j >=0 && arr1[j] > arr2[i];j--){
                arr1[j+1] = arr1[j];
            }

            if(j!=m-1 || last > arr2[i] ){
                arr1[j+1]= arr2[i];
                arr2[i]=last;
            }
        }
    }
}
