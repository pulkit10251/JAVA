package ARRAY;

public class Q16 {

    public static void main(String[] args) {
        // Ques 16 : Count inversions
        int[] A = {2, 3, 5, 1, 4};
        int count = 0;
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A.length; j++) {
//                if (A[i] > A[j] && i < j) {
//                    System.out.println(A[i] + " " + A[j]);
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
        int val = mergeSort(A, 0, A.length - 1);

        System.out.println(val);
    }

    public static int mergeSort(int[] A, int l, int r) {
        int count = 0;
        if (l < r) {

            int mid = (l + r - 1) / 2;
            count += mergeSort(A, l, mid);
            count += mergeSort(A, mid + 1, r);
            count += merge(A, l, mid, r);

        }
        return  count;
    }

    public static int merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;

        int swaps = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
                swaps +=(m+1) - (l+i);
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        return swaps;
    }
}
