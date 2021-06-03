/**
 * Programming example in Chapter 8 of Java Programming
 * 
 * A candy machine
 * 
 * 03-16-2021
 */
import java.util.*;


public class Candy_Machine
{
    static Scanner console = new Scanner(System.in);

    // method showSelection
    public static void showSelection()
    {
        System.out.println("*** Welcome to Louise's Candy Shop ***");
        System.out.println("To select an item, enter...");
        System.out.println("1 for Candy");
        System.out.println("2 for Chips");
        System.out.println("3 for Gum");
        System.out.println("4 for Cookies");
        System.out.println("9 to exit");
    }

    // method sellProduct
    public static void sellProduct(Dispenser a, CashRegister b)
    {
        int coinsRequired;           // variable to store how much more needed
        int coinsInserted = 0;       // variable to store coins user has inserted
        int price;                   // variable to store product price

        if (a.getCount() <= 0)
            System.out.println("Sorry, this product has been sold out!");
        else
        {
            price = a.getProductCost();
            coinsRequired = price;

            while (coinsRequired > 0)
            {
                System.out.println("Please deposit" + coinsRequired + " cents");
                coinsInserted += console.nextInt();
                
                coinsRequired = price - coinsInserted;
            }

            b.acceptAmount(coinsInserted);
            a.makeSale();

            System.out.println("Get your product below and enjoy!");
        }
    }

    public static void main(String[] args)
    {
        int choice;             // variable to store user choice

        // candy machine objects
        CashRegister cRegister = new CashRegister();
        Dispenser candy = new Dispenser(100, 50);
        Dispenser chips = new Dispenser(100, 50);
        Dispenser gum = new Dispenser(100, 50);
        Dispenser cookies = new Dispenser(100, 50);

        // show selection and get user input
        showSelection();
        choice = console.nextInt();

        while (choice != 9)
        {
            switch (choice)
            {
                case 1:
                    sellProduct(candy, cRegister);
                    break;
                case 2:
                    sellProduct(chips, cRegister);
                    break;
                case 3:
                    sellProduct(gum, cRegister);
                    break;
                case 4:
                    sellProduct(cookies, cRegister);
                    break;
                default:
                    System.out.println("Invalid selection, you swab!");
            }

        }
    }
}