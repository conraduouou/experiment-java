/**
 * Class file of Cylinder that extends Circle
 * 
 * 03-23-2021
 */

public class Cylinder extends Circle
{
    private double height;      // variable to store height

    // Default constructor
    // values are set to default
    // Postcondition: x = 0; y = 0; radius = 0; height = 0;
    public Cylinder()
    {
        super();
        setHeight(0);
    }

    // Constructor with parameters
    // values are set accordingly
    // Postcondition: x = a; y = b; radius = rad; height = num;
    public Cylinder(int a, int b, double rad, double num)
    {
        super(a, b, rad);
        setHeight(num);
    }

    // Mutator method that sets height according to parameter num
    // Postcondition: height = num;
    public void setHeight(double num)
    {
        height = num;
    }

    // Method that returns value of volume according to height
    // Postcondition: area of circle according to radius is used to calculate
    // volume and is returned
    public double getVolume()
    {
        return super.getArea() * height;
    }

    // Method that returns value of surface area according to height and area
    // Postcondition: surface area is returned
    public double getSurfaceArea()
    {
        return (2 * super.getArea()) + (super.getCircumference() * height);
    }

    // Method that prints out on console the parameters this object has
    public void printCylinder()
    {
        System.out.println(super.toString() + "\n" + "Height = " + String.format("%.2f", height));
    }

    // Method that returns string of parameters this object has
    public String toString()
    {
        return super.toString() + "\n" + "Height = " + String.format("%.2f", height);
    }
}
