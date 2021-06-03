import java.util.*;     // import scanner class

public class Guess {
    
    static Scanner console = new Scanner(System.in);        // instantiate console as Scanner object

    public static void main(String[] args)
    {
        // declare variables
        boolean done = false;
        int num, guess, numOfGuesses = 0;

        // program title and num initialization
        System.out.println("GUESSING GAME!\nGuess the number!");       
        num = (int) (Math.random() * 100);

        // repeat until user gets it right
        while (numOfGuesses++ < 5 && !done)
        {
            System.out.print("Guess # " + numOfGuesses + "\nEnter number: ");
            guess = console.nextInt();

            int diff = Math.abs(num - guess);

            // conditions
            if (guess == num)
            {
                done = true;
                System.out.println("You guessed it! It's the number " + guess + "!");
                return;
            }
            else if (diff >= 50 && guess > num)
                System.out.println("Your guess is VERY HIGH mate.");
            else if (diff >= 50 && guess < num)
                System.out.println("Your guess is VERY LOW mate.");
            else if ((diff >= 30 && diff < 50) && guess > num)
                System.out.println("Your guess is HIGH mate.");
            else if ((diff >= 30 && diff < 50) && guess < num)
                System.out.println("Your guess is LOW mate.");
            else if ((diff >= 15 && diff < 30) && guess > num)
                System.out.println("Your guess is MODERATELY HIGH mate.");
            else if ((diff >= 15 && diff < 30) && guess < num)
                System.out.println("Your guess is MODERATELY LOW mate.");
            else if ((diff > 0 && diff < 15) && guess > num)
                System.out.println("Your guess is SOMEWHAT HIGH mate. You're getting there!");
            else if ((diff > 0 && diff < 15) && guess < num)
                System.out.println("Your guess is SOMEWHAT LOW mate. You're getting there!");
        }

        System.out.println("Such a shame, mate. Maybe next time.");
    }
}
