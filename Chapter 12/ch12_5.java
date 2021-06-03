/**
 * GUI Program that draws ovals based on input of user
 * 
 * 03-27-2021
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ch12_5 extends JFrame implements ItemListener, ActionListener
{
    // constants
    private static final int WIDTH = 800;
    private static final int HEIGHT = 300;

    private static final int xSTART = 10;
    private static final int xEND   = 200;
    private static final int ySTART = 60;
    private static final int yEND   = 200;

    // no of figures to draw and as well as choice
    int noOfFigures = 30;
    int choice = 0;

    // Button group to ensure that radio buttons only have one that is pressed
    private ButtonGroup buttons = new ButtonGroup();

    // radio buttons
    private JRadioButton circleB = new JRadioButton("Circle");
    private JRadioButton ovalB = new JRadioButton("Oval");
    private JRadioButton squareB = new JRadioButton("Square");
    private JRadioButton rectB = new JRadioButton("Rectangle");

    // button to set the number of figures drawn
    private JButton commenceB = new JButton("Set");
    private JTextField displayTF = new JTextField(10);

    // GUI Program constructor
    public ch12_5()
    {
        // set dimensions of window
        setSize(WIDTH, HEIGHT);
        setTitle("Draw Figures");

        // setting the size of components
        circleB.setSize(100, 20);
        ovalB.setSize(100, 20);
        squareB.setSize(100, 20);
        rectB.setSize(100, 20);
        commenceB.setSize(80, 40);
        displayTF.setSize(150, 25);

        // setting the location of the components
        circleB.setLocation(WIDTH - 100, 80);
        ovalB.setLocation(WIDTH - 100, 100);
        squareB.setLocation(WIDTH - 100, 120);
        rectB.setLocation(WIDTH - 100, 140);
        commenceB.setLocation(WIDTH - 200, 130);
        displayTF.setLocation(WIDTH - 270, 90);

        // adding listeners to the buttons
        circleB.addItemListener(this);
        ovalB.addItemListener(this);
        squareB.addItemListener(this);
        rectB.addItemListener(this);
        commenceB.addActionListener(this);
        
        // set layout of container of window
        Container c = getContentPane();
        c.setLayout(null);
        
        // adding the buttons
        c.add(circleB);
        c.add(ovalB);
        c.add(squareB);
        c.add(rectB);
        c.add(commenceB);
        c.add(displayTF);
        
        // adding the radio buttons to the button group
        buttons.add(circleB);
        buttons.add(ovalB);
        buttons.add(squareB);
        buttons.add(rectB);

        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // to override paint method
    public void paint(Graphics g)
    {
        super.paint(g);

        int x = xSTART + ((xEND - xSTART) / noOfFigures);
        int y = ySTART + ((yEND - ySTART) / noOfFigures);
        int shapeWidth = 5;
        int shapeHeight = 15;

        // choose between what to draw
        switch (choice)
        {
            case 0:
                break;
            case 1:
                for (int i = 0; i < noOfFigures; i++)
                {
                    g.drawOval(x, y, shapeHeight, shapeHeight);
                    shapeHeight += 2;
                    x += ((xEND - xSTART) / noOfFigures);
                    y += ((yEND - ySTART) / noOfFigures);
                }
                break;
            
            case 2:
                for (int i = 0; i < noOfFigures; i++)
                {
                    g.drawOval(x, y, shapeHeight, shapeWidth);
                    shapeWidth += 2;
                    shapeHeight += 2;
                    x += ((xEND - xSTART) / noOfFigures);
                    y += ((yEND - ySTART) / noOfFigures);
                }
                break;
            
            case 3:
                for (int i = 0; i < noOfFigures; i++)
                {
                    g.drawRect(x, y, shapeHeight, shapeHeight);
                    shapeHeight += 2;
                    x += ((xEND - xSTART) / noOfFigures);
                    y += ((yEND - ySTART) / noOfFigures);
                }
                break;

            case 4:
                for (int i = 0; i < noOfFigures; i++)
                {
                    g.drawRect(x, y, shapeHeight, shapeWidth);
                    shapeWidth += 2;
                    shapeHeight += 2;
                    x += ((xEND - xSTART) / noOfFigures);
                    y += ((yEND - ySTART) / noOfFigures);
                }
                break;
        }
    }

    // for ItemListener method
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == circleB)
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
                choice = 1;
            else if (e.getStateChange() == ItemEvent.DESELECTED)
                choice = 0;
        }

        else if (e.getSource() == ovalB)
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
                choice = 2;
            else if (e.getStateChange() == ItemEvent.DESELECTED)
                choice = 0;
        }

        else if (e.getSource() == squareB)
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
                choice = 3;
            else if (e.getStateChange() == ItemEvent.DESELECTED)
                choice = 0;
        }

        else if (e.getSource() == rectB)
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
                choice = 4;
            else if (e.getStateChange() == ItemEvent.DESELECTED)
                choice = 0;
        }

        repaint();
    }

    // for ActionListener method
    public void actionPerformed(ActionEvent e)
    {
        noOfFigures = Integer.parseInt(displayTF.getText());
        repaint();
    }
    

    public static void main(String[] args)
    {
        ch12_5 temp = new ch12_5();
    }
}
