/**
 * Class file of Point
 * 
 * 03-22-2021 update
 *      cannot add values higher than 9
 */

public class Point
{
    private int x;      // variable to hold x coordinate
    private int y;      // variabel to hold y coordinate
    
    // Default constructor
    // Postcondition: x = 0; y = 0;
    public Point()
    {
        x = 0;
        y = 0;
    }

    // Constructor with parameters
    // Cannot accept 2-digit values (currently, at least)
    // Postcondition: x = a; y = b; that is, if they are not 2-digit values,
    // otherwise, they are set to maximum
    public Point(int a, int b)
    {
        setX(a);
        setY(b);
    }

    // Method to print out a cartesian plane to show point
    // Postcondition: point on cartesian plane is shown
    public void showPoint()
    {
        char[][] plane;
        int planeX, planeY;

        if (Math.abs(y) < 5)
            planeY = 5;
        else
            planeY = Math.abs(y);

        if (Math.abs(x) < 5)
            planeX = 5;
        else
            planeX = Math.abs(x);

        plane = new char[planeY + 1][planeX + 1];

        for (int i = 0; i < plane.length; i++)
            for (int j = 0; j < plane[i].length; j++)
                plane[i][j] = ' ';


        for (int i = 0; i < plane.length; i++)
            plane[i][0] = (char) (i + 48);

        for (int i = 0; i < plane[0].length; i++)
            plane[0][i] = (char) (i + 48);

        plane[Math.abs(y)][Math.abs(x)] = '*';

        if (x >= 0 && y >= 0)
        {
            for (int i = plane.length - 1; i >= 0; i--)
            {
                for (int j = 0; j < plane[i].length; j++)
                {
                    System.out.print(plane[i][j] + " ");
                }

                System.out.println();
            }
        }
        else if (x > 0 && y < 0)
        {
            for (int i = 0; i < plane.length; i++)
            {
                for (int j = 0; j < plane[i].length; j++)
                {
                    System.out.print(plane[i][j] + " ");
                }

                System.out.println();
            }
        }
        else if (x < 0 && y > 0)
        {
            for (int i = plane.length - 1; i >= 0; i--)
            {
                for (int j = plane[i].length - 1; j >= 0; j--)
                {
                    System.out.print(plane[i][j] + " ");
                }

                System.out.println();
            }
        }
        else if (x < 0 && y < 0)
        {
            for (int i = 0; i < plane.length; i++)
            {
                for (int j = plane[i].length - 1; j >= 0; j--)
                {
                    System.out.print(plane[i][j] + " ");
                }

                System.out.println();
            }
        }
    }

    // Method to set the coordinates
    // Cannot accept 2-digit values (currently, at least)
    // Postcondition: x = a; y = b; that is, if they are not 2-digit values,
    // otherwise, they are set to maximum
    public void setPoint(int a, int b)
    {
        setX(a);
        setY(b);
    }

    // Method to set the x coordinate
    // Cannot accept 2-digit values (currently, at least)
    // Postcondition: x = a; that is, if x is not a 2-digit value,
    // otherwise, x is set to maximum
    public void setX(int a)
    {
        if (a > 9)
            a = 9;
        else if (a < -9)
            a = -9;

        x = a;
    }

    // Method to set the y coordinate
    // Cannot accept 2-digit values (currently, at least)
    // Postcondition: y = b; that is, if y is not a 2-digit value,
    // otherwise, y is set to maximum
    public void setY(int b)
    {
        if (b > 9)
            b = 9;
        else if (b < -9)
            b = -9;

        y = b;
    }

    // Accessor method to get the instance variable x
    // Postcondition: the value of x is returned
    public int getX()
    {
        return x;
    }

    // Accessor method to get the instance variable y
    // Postcondition: the value of y is returned
    public int getY()
    {
        return y;
    }

    // Method to print the point
    public void printPoint()
    {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Method to be used when called in a print function
    public String toString()
    {
        return ("(" + x + ", " + y + ")");
    }
}
