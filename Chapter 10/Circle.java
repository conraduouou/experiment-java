/**
 * Class file of Circle
 * 
 * 03-23-2021
 */

public class Circle extends Point
{
    private double radius;      // variable to store radius

    // Default constructor
    // Sets values to default, as well as its center since point is extended
    // Postcondition: x = 0; y = 0; radius = 0;
    public Circle()
    {
        super();
        setRadius(0);
    }

    // Constructor with parameters
    // Sets values accordingly
    // Postcondition: x = a; y = b; radius = rad;
    public Circle(int a, int b, double rad)
    {
        super(a, b);
        setRadius(rad);
    }

    // Copy constructor
    // Sets values according to otherCircle parameters
    // Postcondition: x = otherCircle.x; y = otherCircle.y; radius = otherCircle.radius;
    public Circle(Circle otherCircle)
    {
        super(otherCircle.getX(), otherCircle.getY());
        setRadius(otherCircle.radius);
    }

    // Mutator method to set radius according to parameter rad
    // Postcondition: radius = rad;
    public void setRadius(double rad)
    {
        radius = rad;
    }

    // Accessor method to return instance variable radius
    // Postcondition: value of radius is returned
    public double getRadius()
    {
        return radius;
    }

    // Method to return area according to radius
    // Postcondition: area according to radius is returned
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to return circumference according to radius
    // Postcondition: circumference according to radius is returned
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    // Method to print out on console the parameters that can be printed
    public void printCircle()
    {
        System.out.println(super.toString() + "\n" + "Radius = " + String.format("%.2f", radius));
    }

    // Method to return string containing parameters
    public String toString()
    {
        return super.toString() + "\n" + "Radius = " + String.format("%.2f", radius);
    }
}