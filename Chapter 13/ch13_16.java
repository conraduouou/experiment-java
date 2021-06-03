import javax.swing.JFrame;

/**
 * Program that demonstrates Koch Fractal using recursion
 * 
 * 03-30-2021
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ch13_16 extends JFrame
{
    private final int WIDTH = 850;
    private final int HEIGHT = 900;

    public ch13_16()
    {
        setSize(WIDTH, HEIGHT);
        setTitle("Koch Fractal");



        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        int x1 = 100;
        int y1 = 700;
        int x5 = 400;
        int y5 = 100;

        koch(x1, y1, x5, y5, 5, g);
        koch(x5, y5, x1 + 2 * (x5 - x1), y1, 5, g);
        koch(x1 + 2 * (x5 - x1), y1, x1, y1, 5, g);
    }

    // makes each separate segment implement koch fractal
    public void koch(int x1, int y1, int x5, int y5, int num, Graphics g)
    {
        int deltaX = x5 - x1;
        int deltaY = y5 - y1;

        int x2 = x1 + (deltaX / 3);
        int y2 = y1 + (deltaY / 3);
        
        int x3 = (int) (((x1 + x5) / 2) + (Math.sqrt(3) * (y5 - y1)) / 6);
        int y3 = (int) (((y1 + y5) / 2) + (Math.sqrt(3) * (x1 - x5)) / 6);

        int x4 = x1 + 2 * (deltaX / 3);
        int y4 = y1 + 2 * (deltaY / 3);

        if (num > 0)
        {
            koch(x1, y1, x2, y2, num - 1, g);
            koch(x2, y2, x3, y3, num - 1, g);
            koch(x3, y3, x4, y4, num - 1, g);
            koch(x4, y4, x5, y5, num - 1, g);
        }
        else
            g.drawLine(x1, y1, x5, y5);
    }

    public static void main(String[] args)
    {
        ch13_16 temp = new ch13_16();
    }
}