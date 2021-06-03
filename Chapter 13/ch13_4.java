/**
 * Program that returns sum of squares using a recursive method
 * 
 * 03-29-2021
 */

public class ch13_4
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += Math.pow(i, 2);

        int temp = sumSquares(0, 10);

        System.out.println("The sum of squares using for loop: " + sum);
        System.out.println("The sum of squares using method  : " + temp);
    }

    // returns sum of squares between two integers num1 and num2
    // num 1 must be lower than num2
    private static int sumSquares(int num1, int num2)
    {
        int sum = 0;

        if (num1 > num2)
            return 0;
        else if (num1 <= num2)
            sum += Math.pow(num1, 2) + sumSquares(num1 + 1, num2);

        return sum;
    }
}
