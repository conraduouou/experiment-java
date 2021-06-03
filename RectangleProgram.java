/**
 * Review of what I've learned today 
 * 
 * 03-08-2021
 */

// import needed libraries 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// make rectangle program class "on top" of JFrame library, essentially inheriting
public class RectangleProgram extends JFrame
{
    // constants for window dimensions
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    // initialize labels, text fields, and buttons
    private JLabel lengthL, widthL, areaL, perimeterL;
    private JTextField lengthTF, widthTF, areaTF, perimeterTF;
    private JButton calculateB, exitB;
    private CalculateButtonHandler cbhandler;
    private ExitButtonHandler exitbhandler;

    // make application window
    public RectangleProgram()
    {
        // set the title
        setTitle("Rectangle Program One");

        // instantiate labels
        lengthL = new JLabel("     Enter length: ", SwingConstants.LEFT);
        widthL = new JLabel("     Enter width: ", SwingConstants.LEFT);
        areaL = new JLabel("     Area: ", SwingConstants.LEFT);
        perimeterL = new JLabel("     Perimeter: ", SwingConstants.LEFT);

        // instantiate textfields
        lengthTF = new JTextField(10);
        widthTF = new JTextField(10);
        areaTF = new JTextField(10);
        perimeterTF = new JTextField(10);
        
        // set area and perimeter text fields uneditable
        areaTF.setEditable(false);
        perimeterTF.setEditable(false);

        // make buttons and listeners
        calculateB = new JButton("Calculate");
        cbhandler = new CalculateButtonHandler();
        calculateB.addActionListener(cbhandler);

        exitB = new JButton("Exit");
        exitbhandler = new ExitButtonHandler();
        exitB.addActionListener(exitbhandler);

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5, 2));

        pane.add(lengthL);
        pane.add(lengthTF);
        pane.add(widthL);
        pane.add(widthTF);
        pane.add(areaL);
        pane.add(areaTF);
        pane.add(perimeterL);
        pane.add(perimeterTF);
        pane.add(calculateB);
        pane.add(exitB);

        setVisible(true);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class CalculateButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            double length, width, perimeter, area;

            length = Double.parseDouble(lengthTF.getText());
            width = Double.parseDouble(widthTF.getText());
            perimeter = 2 * (length + width);
            area = length * width;

            areaTF.setText("" + area);
            perimeterTF.setText("" + perimeter);
        }
    }

    private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        RectangleProgram rectProg = new RectangleProgram();
    }
    
}
