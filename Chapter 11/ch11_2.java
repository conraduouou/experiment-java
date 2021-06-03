/**
 * Program that counts letter count in an excerpt
 * 
 * 03-25-2021
 */
import java.io.*;

public class ch11_2
{
    // method to copy read text to output file
    static int copyText(FileReader infile, PrintWriter outfile, int next, int[] letterC) throws IOException
    {
        try
        {
            while (next != (int) '\n' && next != -1)
            {
                if (next != 13)
                    outfile.print((char) next);
                chCount((char) next, letterC);

                next = infile.read();
            }

            outfile.println();

            return next;
        }
        catch (ArrayIndexOutOfBoundsException aiobRef)
        {
            throw aiobRef;
        }
    }

    // method to update letter count according to passed letter
    static void chCount(char letter, int[] letterC)
    {
        try
        {
            letter = Character.toUpperCase(letter);

            int index = (int) letter - 65;

            if (index >= 0 && index < 26)
                letterC[index]++;
        }
        catch (ArrayIndexOutOfBoundsException aiobRef)
        {
            throw aiobRef;
        }
    }

    // method to finalize the results
    static void writeTotal(PrintWriter outfile, int lines, int[] letters)
    {
        try
        {
            outfile.println();
            outfile.println("The number of lines is " + lines);

            for (int i = 0; i < 26; i++)
                outfile.println((char) (i + 65) + " count = " + letters[i]);
        }
        catch (ArrayIndexOutOfBoundsException aiobRef)
        {
            throw aiobRef;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        int lineCount = 0;
        int[] letters = new int[26];

        int next;

        FileReader inFile = new FileReader("sample1.txt");
        PrintWriter outFile = new PrintWriter("sample2.txt");

        try
        {
            next = inFile.read();

            while (next != -1)
            {
                next = copyText(inFile, outFile, next, letters);

                lineCount++;
                next = inFile.read();
            }

            writeTotal(outFile, lineCount, letters);

            outFile.close();
        }
        catch (ArrayIndexOutOfBoundsException aiobRef)
        {
            System.out.println("E R R O R: Index used in array is out of bounds.");
        }
        catch (Exception eRef)
        {
            System.out.println("E R R O R");
        }
    }
}