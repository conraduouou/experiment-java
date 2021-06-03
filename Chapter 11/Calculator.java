import javax.swing.JFrame;

/**
 * Calculator GUI Program from my book
 * 
 * 03-25-2021
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
    private JTextField displayText = new JTextField(30);
    private JButton[] button = new JButton[20];

    private String[] keys = {"7", "8", "9", "/",
                             "4", "5", "6", "*",
                             "1", "2", "3", "-",
                             "0", "C", "=", "+",
                             "M", "R", ".", "E"};

    // text variables as well as memory variable                  
    private String numStr1 = "";
    private String numStr2 = "";
    private String memory  = "";

    // a char variable to store operation
    private char operation;

    // a boolean variable to determine whether current input is going to be evaluated
    // if not, continue on evaluating firstInput
    private boolean firstInput = true;

    // a boolean variable to determine whether the user has just pressed equals
    private boolean justEquals = false;

    // constructor of the class Calculator GUI program
    public Calculator()
    {
        setTitle("Calculator");
        setSize(400, 550);
        setResizable(false);
        Container pane = getContentPane();

        // to make the container entirely free to manipulate... I guess?
        pane.setLayout(null);

        // dimensions and location of displayText
        displayText.setSize(350, 125);
        displayText.setLocation(15, 25);
        pane.add(displayText);

        // adding each button
        int x = 15;
        int y = 160;

        for (int i = 0; i < 20; i++)
        {
            // instantiate each button
            button[i] = new JButton(keys[i]);

            // since our class implements ActionListener, our class is, in a way,
            // an ActionListener interface slash GUI Program
            button[i].addActionListener(this);

            // dimensions and location of each button
            button[i].setSize(350 / 4, 60);
            button[i].setLocation(x, y);
            pane.add(button[i]);

            x += 350 / 4;

            if ((i + 1) % 4 == 0)
            {
                x = 15;
                y += 60;
            }
        }

        // since this GUI is a window, adding a window listener with the keyword "this"
        // works, and the instantiation of a WindowAdapter object also makes sense since
        // you can declare new objects on the fly on a parameter
        this.addWindowListener(new WindowAdapter()
                {
                    public void windowClosing(WindowEvent e)
                    {
                        System.exit(0);
                    }
                }
        );

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
        String resultstr;

        char ch = String.valueOf(e.getActionCommand()).charAt(0); 
        switch (ch)
        {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                if (justEquals)
                {
                    reset();
                    numStr1 += ch;
                    displayText.setText(numStr1);
                }
                else if (firstInput)
                {
                    numStr1 += ch;
                    displayText.setText(numStr1);
                }
                else
                {
                    numStr2 += ch;
                    displayText.setText(numStr2);
                }

                break;
            case '+':
            case '-':
            case '/':
            case '*':
                operation = ch;

                if (justEquals == true)
                {
                    justEquals = false;   
                }
                else if (firstInput == false)
                {
                    resultstr = evaluate();
                    numStr1 = resultstr;
                    numStr2 = "";
                }
                else
                    firstInput = false;
                
                break;
            case '=':
                resultstr = evaluate();
                displayText.setText(resultstr);
                numStr1 = resultstr;
                numStr2 = "";
                justEquals = true;

                break;
            case 'C':
                reset();
                break;
            case 'M':
                memory = displayText.getText();
                break;
            case 'R':
                numStr1 = memory;
                firstInput = true;
                justEquals = false;
                displayText.setText(numStr1);
                break;
            case '.':
                if (displayText.getText().indexOf(".") != -1)
                    break;
                else if (justEquals)
                {
                    reset();
                    numStr1 += ch;
                    displayText.setText(numStr1);
                }
                else if (firstInput)
                {
                    numStr1 += ch;
                    displayText.setText(numStr1);
                }
                else
                {
                    numStr2 += ch;
                    displayText.setText(numStr2);
                }
                
                break;
            case 'E':
                System.exit(0);
        }
    }

    private String evaluate()
    {
        final char beep = '\u0007';

        try
        {
            double num1 = Double.parseDouble(numStr1);
            double num2 = Double.parseDouble(numStr2);
            double result = 0;

            switch (operation)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    if (num2 == 0.0)
                        throw new DivisionByZeroDouble();
                    result = num1 / num2;
                    break;
                case '*':
                    result = num1 * num2;
                
            }

            return String.valueOf(result);
        }
        catch (DivisionByZeroDouble dbzdRef)
        {
            System.out.print(beep);
            return "E R R O R: " + dbzdRef.getMessage();
        }
        catch (ArithmeticException aeRef)
        {
            System.out.print(beep);
            return "E R R O R: " + aeRef.getMessage();
        }
        catch (NumberFormatException nfRef)
        {
            System.out.print(beep);
            
            if (numStr1.equals(""))
                return "E R R O R: Invalid first number";
            else
                return "E R R O R: Invalid second number";
        }
        catch (Exception eRef)
        {
            System.out.print(beep);
            return "E R R O R";
        }
    }

    // reset method
    private void reset()
    {
        numStr1 = "";
        numStr2 = "";
        memory  = "";
        justEquals = false;
        firstInput = true;
        displayText.setText(numStr1);
    }

    public static void main(String[] args)
    {
        Calculator temp = new Calculator();
    }
}