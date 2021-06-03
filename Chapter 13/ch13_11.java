/**
 * Program that implements Ackermann's Function as a recursive method
 * 
 * 03-29-2021
 */

public class ch13_11
{
    public static void main(String[] args)
    {
        System.out.println("Ackermann's function: " + A(2, 2));
    }

    private static int A(int m, int n)
    {
        if (m == 0)
            return n += 1;
        else if (n == 0)
            return A(m - 1, 1);
        else 
            return A(m - 1, A(m, n - 1));
    }
}