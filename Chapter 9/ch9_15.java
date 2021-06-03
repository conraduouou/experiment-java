/**
 * Menu-driven program that assigns seats for a commercial airplane
 * 
 * 03-21-2021
 */
import java.util.*;

public class ch9_15
{
    public static Scanner console = new Scanner(System.in);
    
    // method that prints out menu
    public static int showMenu()
    {
        System.out.println("Seat ARRANGER?!?!?!!?");
        System.out.println("Navigate the menu through the following: ");
        System.out.println("1 - show current seats");
        System.out.println("2 - avail for a seat");
        System.out.println("3 - quit and leave because you're poor");

        System.out.print("Input: ");

        return console.nextInt();
    }

    // method that prints out the current seat arrangement of the plane
    public static void showSeats(char[][] array)
    {
        System.out.println();
        System.out.println();

        int availableCount = 0;
        int takenCount = 0;
        int firstClassCount = 0;
        int businessClassCount = 0;
        int economyClassCount = 0;

        System.out.println("        A B C  D E F");
        
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Row " + String.format("%-2d", (i + 1)));

            for (int j = 0; j < array[i].length; j++)
            {
                if ((i == 0 || i == 1) && array[i][j] == '*')
                {
                    firstClassCount++;
                    availableCount++;
                }
                else if ((i > 1 && i < 7) && array[i][j] == '*')
                {
                    businessClassCount++;
                    availableCount++;
                }
                else if ((i > 6 && i < 13) && array[i][j] == '*')
                {
                    economyClassCount++;
                    availableCount++;
                }
                else
                {
                    takenCount++;
                }

                if (j == 3 || j == 0)
                    System.out.print("  " + array[i][j]);
                else
                    System.out.print(" " + array[i][j]);
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("There are currently...");
        System.out.println(firstClassCount + " seat(s) available on first class (Row 1 to Row 2)");
        System.out.println(businessClassCount + " seat(s) available on business class (Row 3 to Row 7)");
        System.out.println(economyClassCount + " seat(s) available on economy class (Row 8 to Row 13)");
        System.out.println(availableCount + " seat(s) all-in-all are available for assignment");
        System.out.println(takenCount + " seat(s) taken");

        System.out.println();
        System.out.println();
    }

    // private method to only print seats according to ticket type
    private static void printSeats(char[][] array, char ticket)
    {
        System.out.println();
        System.out.println();

        System.out.println("        A B C  D E F");

        if (Character.toLowerCase(ticket) == 'f')
        {
            for (int i = 0; i < 2; i++)
            {
                System.out.print("Row " + String.format("%-2d", (i + 1)));

                for (int j = 0; j < array[i].length; j++)
                {
                    if (j == 3 || j == 0)
                        System.out.print("  " + array[i][j]);
                    else
                        System.out.print(" " + array[i][j]);
                }

                System.out.println();
            }
        }
        else if (Character.toLowerCase(ticket) == 'b')
        {
            for (int i = 2; i < 7; i++) 
            {
                System.out.print("Row " + String.format("%-2d", (i + 1)));

                for (int j = 0; j < array[i].length; j++)
                {
                    if (j == 3 || j == 0)
                        System.out.print("  " + array[i][j]);
                    else
                        System.out.print(" " + array[i][j]);
                }

                System.out.println();
            }
        }
        else if (Character.toLowerCase(ticket) == 'e')
        {
            for (int i = 7; i < array.length; i++) 
            {
                System.out.print("Row " + String.format("%-2d", (i + 1)));

                for (int j = 0; j < array[i].length; j++)
                {
                    if (j == 3 || j == 0)
                        System.out.print("  " + array[i][j]);
                    else
                        System.out.print(" " + array[i][j]);
                }

                System.out.println();
            }
        }
    }

    // method to avail to a seat
    public static void availSeat(char[][] array)
    {
        // variables for the user's preferred seat
        char ticketType;
        int chairRow = 0, chair = 0;

        System.out.println();
        System.out.println();

        System.out.println("What is your ticket type?");
        System.out.println("F - First Class (Row 1 to Row 2)");
        System.out.println("B - Business Class (Row 3 to Row 7)");
        System.out.println("E - Economy Class (Row 8 to Row 13)");
        System.out.print("Input: ");

        // put switch statement here

        ticketType = console.next().charAt(0);

        do
        {
            printSeats(array, ticketType);

            System.out.println("Choose your desired available seat: ");

            System.out.println();

            switch (Character.toLowerCase(ticketType))
            {
                case 'f':
                    do
                    {
                        System.out.print("Row number: ");
                        chairRow = console.nextInt();

                        System.out.print("Seat letter: ");
                        chair = Character.toUpperCase(console.next().charAt(0)) - 64;
                    }
                    while (chairRow > 2 || chairRow < 1 || chair < 1 || chair > 6);

                    break;
                case 'b':
                    do
                    {
                        System.out.print("Row number: ");
                        chairRow = console.nextInt();

                        System.out.print("Seat letter: ");
                        chair = Character.toUpperCase(console.next().charAt(0)) - 64;
                    }
                    while (chairRow > 7 || chairRow < 3 || chair < 1 || chair > 6);

                    break;
                case 'e':
                    do
                    {
                        System.out.print("Row number: ");
                        chairRow = console.nextInt();

                        System.out.print("Seat letter: ");
                        chair = Character.toUpperCase(console.next().charAt(0)) - 64;
                    }
                    while (chairRow > 13 || chairRow < 8 || chair < 1 || chair > 6);

                    break;
                default:
                    break;
            }

            System.out.println("Thank you for using the SEAT ARRANGER!?!?!?");

            System.out.println();
            System.out.println();

            break;
        }
        while (Character.toLowerCase(ticketType) == 'f' ||
               Character.toLowerCase(ticketType) == 'b' ||
               Character.toLowerCase(ticketType) == 'e');

        array[chairRow - 1][chair - 1] = 'X';
    }

    // method to reset seat arrangement
    public static void resetSeats(char[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = '*';
            }
        }
    }


    public static void main(String[] args)
    {
        // variable for seats, ticketType, and desired seat
        char[][] seats = new char[13][6];

        resetSeats(seats);

        int choice;

        while ((choice = showMenu()) < 3)
        {
            switch (choice)
            {
                case 1:
                    showSeats(seats);
                    continue;
                case 2:
                    availSeat(seats);
                    continue;
                default:
                    break;
            }
        }
    }
}
