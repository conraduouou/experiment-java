/**
 * GUI Program to demonstrate key and mouse events
 * 
 * 03-26-2021
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ch12_11 extends JFrame implements MouseListener, MouseMotionListener, KeyListener
{
    char input = '0';
    JLabel[] label = new JLabel[11];
    JTextField display = new JTextField(1);
    
    // GUI Program
    public ch12_11()
    {
        label[0] = new JLabel("Mouse Clicked", SwingConstants.CENTER);
        label[1] = new JLabel("Mouse Entered", SwingConstants.CENTER);
        label[2] = new JLabel("Mouse Exited", SwingConstants.CENTER);
        label[3] = new JLabel("Mouse Pressed", SwingConstants.CENTER);
        label[4] = new JLabel("Mouse Released", SwingConstants.CENTER);
        label[5] = new JLabel("Mouse Dragged", SwingConstants.CENTER);
        label[6] = new JLabel("Mouse Moved", SwingConstants.CENTER);
        label[7] = new JLabel("Key Pressed", SwingConstants.CENTER);
        label[8] = new JLabel("Key Typed", SwingConstants.CENTER);
        label[9] = new JLabel("Key Released", SwingConstants.CENTER);
        label[10] = new JLabel("" + input, SwingConstants.CENTER);

        setSize(300, 500);
        setTitle("Events");
        
        // content pane and layout management
        Container c = getContentPane();
        c.setLayout(new GridLayout(12, 1));

        for (int i = 0; i < label.length; i++)
        {
            label[i].setForeground(Color.gray);
            c.add(label[i]);
        }
        
        c.addMouseListener(this);
        c.addMouseMotionListener(this);
        c.add(display);
        display.addKeyListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 0)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }

    public void mouseEntered(MouseEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 1)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }

    public void mouseExited(MouseEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 2)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }

    public void mousePressed(MouseEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 3)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }

    public void mouseReleased(MouseEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 4)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }

    public void mouseDragged(MouseEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 5)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }

    public void mouseMoved(MouseEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 6)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }

        label[10].setText("[" + e.getX() + " : " + e.getY() + "]");
    }

    public void keyPressed(KeyEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 7)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }

    public void keyTyped(KeyEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 8)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }

    public void keyReleased(KeyEvent e)
    {
        for (int i = 0; i < label.length; i++)
        {
            if (i == 9)
                label[i].setForeground(Color.black);
            else
                label[i].setForeground(Color.gray);
        }
    }
}