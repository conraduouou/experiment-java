import javax.swing.*;   // JOptionPane integrate

public class Population
{
    public static void main(String[] args)
    {
        double popA, popB, growthA, growthB;
        int year = 0;

        JOptionPane.showMessageDialog(null, String.format("Population program!\nThere are two towns in which town A grows at a " +
            "faster rate than town B in a year. Input their respective populations and growth rates."), "Population!", JOptionPane.INFORMATION_MESSAGE);
        
        // take inputs
        popA = Float.parseFloat(JOptionPane.showInputDialog(null, "Input population of town A"));
        growthA = Float.parseFloat(JOptionPane.showInputDialog(null, "Input growth rate of town A in percent (% sign not included)"));
        popB = Float.parseFloat(JOptionPane.showInputDialog(null, "Input population of town b"));
        growthB = Float.parseFloat(JOptionPane.showInputDialog(null, "Input growth rate of town B in percent (% sign not included)"));

        if (popA > popB)
            JOptionPane.showMessageDialog(null, "Invalid input. Population A must be lower than Population B.", "Error", JOptionPane.ERROR_MESSAGE);
        else if (growthA < growthB)
            JOptionPane.showMessageDialog(null, "Invalid input. Growth rate of A must be higher than growth rate of B.", "Error", JOptionPane.ERROR_MESSAGE);
        else
        {
            // calculate growth
            while (popA < popB)
            {
                popA += popA * (growthA / 100);
                popB += popB * (growthB / 100);

                year++;
            }

            JOptionPane.showMessageDialog(null, String.format("Town A reaches Town B's population in %d years.", year), "Results", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
