/**
 * Another problem to test out my GUI skills
 * 
 * 03-10-2021
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LargerString extends JFrame
{
    // dimensions
    private static final int WIDTH = 400;
    private static final int HEIGHT = 200;

    // labels, textfields, and buttons
    private JLabel string1L, string2L, answerL;
    private JTextField string1TF, string2TF, answerTF;
    private JButton commenceB, exitB;
    private CommenceHandler cBhandler;
    private ExitHandler exitBhandler;

    // make window
    public LargerString()
    {
        // initialize labels, textfields, and buttons
        string1L = new JLabel("     Enter 1st string:", SwingConstants.LEFT);
        string2L = new JLabel("     Enter 2nd string:", SwingConstants.LEFT);
        answerL = new JLabel("     Answer:", SwingConstants.LEFT);

        string1TF = new JTextField(10);
        string2TF = new JTextField(10);
        answerTF = new JTextField(10);
        answerTF.setEditable(false);

        commenceB = new JButton("Commence");
        cBhandler = new CommenceHandler();
        commenceB.addActionListener(cBhandler);

        exitB = new JButton("Exit");
        exitBhandler = new ExitHandler();
        exitB.addActionListener(exitBhandler);

        // make container
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 2));

        pane.add(string1L);
        pane.add(string1TF);
        pane.add(string2L);
        pane.add(string2TF);
        pane.add(answerL);
        pane.add(answerTF);
        pane.add(commenceB);
        pane.add(exitB);

        // window config
        setTitle("Which is Larger?");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // make commence handler
    private class CommenceHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // compare two strings
            String string1, string2;

            // get strings
            string1 = string1TF.getText();
            string2 = string2TF.getText();

            if (string1.compareTo(string2) > 0)
                answerTF.setText("1st string is larger than 2nd string.");
            else if (string1.compareTo(string2) < 0)
                answerTF.setText("2nd string is larger than 1st string.");
            else
                answerTF.setText("They are equal.");
        }
    }

    private class ExitHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    
    public static void main(String[] args)
    {
        LargerString program = new LargerString();
    }
}
