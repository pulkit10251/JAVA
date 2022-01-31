package Uber;

public class q5 {
    static int getOccurence(int n, int d)
    {

        // Initialize result
        int result = 0;

        // Count appearances in numbers
        // starting from d.
        int itr = d;

        while (itr <= n)
        {

            // When the last digit is
            // equal to d
            if (itr % 10 == d)
                result++;

            // When the first digit is
            // equal to d then
            if (itr != 0 && itr/10 == d)
            {

                // increment result as
                // well as number
                result++;
                itr++;
            }

            // In case of reverse of number
            // such as 12 and 21
            else if (itr/10 == d-1)
                itr = itr + (10 - d);
            else
                itr = itr + 10;
        }

        return result;
    }


    // Driver code
    public static void main (String[] args)
    {
        int n = 100, d = 9;

        System.out.println(getOccurence(n, d) );
    }

}
