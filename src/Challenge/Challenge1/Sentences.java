package Challenge.Challenge1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Sentences {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.nextLine();
        Scanner in = new Scanner(new File(inputFileName)); //Line 1
        PrintStream out = new PrintStream("sentences.txt"); //Line 2
        while (in.hasNextLine()) //Line 3
        {
            String word = in.next();
            char last = word.charAt(word.length() - 1); //Line 4
            if (last == '.' || last == '!' || last == '?') //Line 5
            {
                out.printf(word + "\n");
            }
            else
            {
                out.printf(word + " ");
            }
        }
        in.close();
    }
}
