/**
 * Practice program
 * Chapter 9 - 1
 * 
 * 03-21-2021
 */

public class ch9_1
{
    public static void main(String[] args)
    {
        double[][] alpha = new double[2][25];

        for (int i = 0; i < alpha[0].length; i++)
            alpha[0][i] = Math.pow(i, 2);

        for (int i = 0; i < alpha[1].length; i++)
            alpha[1][i] = (i + 25) * 3;
        
        System.out.println("These are the values of alpha");
        printArray(alpha);
    }

    public static void printArray(double[][] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list[i].length; j++)
            {
                System.out.print(" " + list[i][j]);
            }
            
            System.out.println();
        }
    }
}