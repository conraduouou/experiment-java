/**
 * Program that finds circle's parameters
 * 
 * 03-15-2021
 */

public class ch7_9
{
    static final double PI = 3.14159265;

    // gets distance from two points, namely point (a, b) and point (c, d)
    public static double distance(double a, double b, double c, double d)
    {
        return Math.sqrt(Math.pow((c - a), 2) + Math.pow((d - b), 2));
    }

    // gets radius from center and any point on the circle by calling the distance method
    // the point (a, b) represent the center, while point (c, d) represent any point on the circle
    public static double radius(double a, double b, double c, double d)
    {
        return distance(a, b, c, d);
    }

    // takes in as input the radius and returns the circumference
    public static double circumference(double radius)
    {
        return 2 * PI * radius;
    }

    // takes in as input the radius and returns the area
    public static double area(double radius)
    {
        return PI * Math.pow(radius, 2);
    }

    public static void main(String[] args)
    {
        // test out methods
        System.out.println("CIRCLE PARAMETERS?!?!?!");
        System.out.print(String.format("The center of the circle is (0.0, 0.0)\n") +
                         String.format("The point on the circle is (8.0, 6.0)\n") +
                         String.format("Let's find out its parameters!\n\n"));
        
        System.out.println("The radius is " + radius(0.0, 0.0, 8.0, 6.0));
        System.out.println("The circumference is " + circumference(radius(0.0, 0.0, 8.0, 6.0)));
        System.out.println("The area is " + area(radius(0.0, 0.0, 8.0, 6.0)));
    }
}
