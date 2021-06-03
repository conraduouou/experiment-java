/**
 * Program that determines most economical path according
 * to river problem (TO SOLVE)
 * 
 * 03-15-2021
 */
import java.util.*;

public class ch7_18
{
    // constants that I think I'd be using
    static final double FOOT_PER_MILE = 5280;

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        // variables
        double riverWidth, factoryDistance, costLand, costWater, totalCost;

        // prompts
        System.out.println("River Problem!!");

        System.out.print("Enter width of the river (in miles): ");
        riverWidth = console.nextDouble();
        System.out.println();

        System.out.print("Enter the distance of the factory on the other side of the river (in miles): ");
        factoryDistance = console.nextDouble();
        System.out.println();

        System.out.print("Enter the cost of laying the power line underwater: ");
        costWater = console.nextDouble();
        System.out.println();

        System.out.print("Enter the cost of laying the power line on land: ");
        costLand = console.nextDouble();
        System.out.println();

        // calculate most economical way to lay power line
        double landWireLength = factoryDistance * FOOT_PER_MILE;
        double waterWireLength = riverWidth * FOOT_PER_MILE;

        // store in land wire length and water wire lengths that are most economical
        double finalLandLength = 0, finalWaterLength = 0;
        double min = 500000;

        while (landWireLength >= 0)
        {
            totalCost = (landWireLength * costLand) + (waterWireLength * costWater);

            if (totalCost < min)
            {
                min = totalCost;
                finalLandLength = landWireLength;
                finalWaterLength = waterWireLength;
            }

            landWireLength--;
            waterWireLength = getHypotenuse(riverWidth * FOOT_PER_MILE, (factoryDistance * FOOT_PER_MILE) - landWireLength);
        }

        System.out.println("The most economical way to construct power lines costs " + 
                           String.format("%.2f", min) + " dollars");
        System.out.println("The length of the power lines on land should be " + String.format("%.2f", finalLandLength) + 
                           " feet while " + String.format("%.2f", finalWaterLength) + " on water.");
    }

    // method to get water wire length
    public static double getHypotenuse(double riverWidth, double landWireOffset)
    {
        double hypotenuse = Math.sqrt(Math.pow(riverWidth, 2) + Math.pow(landWireOffset, 2));

        return hypotenuse;
    }
}
