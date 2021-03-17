package MATRIX;

import java.util.Stack;

public class Q6 {


    public static void main(String[] args) {
        int R = 4;
        int C = 4;

        int arr[] = {1,2,2,3};
        System.out.println(maxHist( C, arr));

        int A[][] = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 },
        };
        System.out.print("Area of maximum rectangle is "
                + maxRectangle(R, C, A));
    }

    public  static  int maxHist(int C, int row[]){

        Stack<Integer> s = new Stack<>();

        int max_area = 0; // Initialize max area
        int tp;  // To store top of stack
        int area_with_top; // To store area with top bar as the smallest bar

        // Run through all bars of given histogram
        int i = 0;
        while (i < C)
        {
            // If this bar is higher than the bar on top stack, push it to stack
            if (s.empty() || row[s.peek()] <= row[i])
                s.push(i++);

                // If this bar is lower than top of stack, then calculate area of rectangle
                // with stack top as the smallest (or minimum height) bar. 'i' is
                // 'right index' for the top and element before top in stack is 'left index'
            else
            {
                tp = s.peek();  // store the top index
                s.pop();  // pop the top

                // Calculate the area with hist[tp] stack as smallest bar
                area_with_top = row[tp] * (s.empty() ? i : i - s.peek() - 1);

                // update max area, if needed
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        // Now pop the remaining bars from stack and calculate area with every
        // popped bar as the smallest bar
        while (s.empty() == false)
        {
            tp = s.peek();
            s.pop();
            area_with_top = row[tp] * (s.empty() ? i : i - s.peek() - 1);

            if (max_area < area_with_top)
                max_area = area_with_top;
        }

        return max_area;


    }




    public static int maxRectangle(int R, int C, int A[][])
    {
        // Calculate area for first row and initialize it as
        // result
        int result = maxHist(C, A[0]);

        for (int i = 1; i < R; i++) {

            for (int j = 0; j < C; j++)
                if (A[i][j] == 1)
                    A[i][j] += A[i - 1][j];

            result = Math.max(result, maxHist(C, A[i]));
        }

        return result;
    }
}
