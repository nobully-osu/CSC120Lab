package Module7;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram724 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        int NUM_CHARACTERS = 26;      // Maximum number of letters
        int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter

        String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
        String[] words = new String[MAX_WORDS]; // The words of each input line

        String userInput = console.nextLine(); // get user input
        String[] inputs = userInput.split(" "); // split user inputs into array to work with later

        String targetChar = ""; // init necessary vars outside for loop scope to be used outside for loop later
        String targetWord = "";

        // set input variables
        for (String input : inputs) {
            if (input.length() == 1) {
                targetChar = input;
            } else {
                targetWord = input;
            }
        }

        // set up 2D array to that file input will write to by adding the corresponding letter of the alphabet to the first element of each row
        for (int i = 0; i < synonyms.length; i++){
            int letterCode = 97; // a
            synonyms[i][0] = String.valueOf((char) (letterCode + i));
        }

        // begin working with target file
        FileInputStream synonymFile = new FileInputStream(targetWord + ".txt");
        Scanner inFile = new Scanner(synonymFile);

        while (inFile.hasNextLine()) {
            // read next line in file
            String line = inFile.nextLine();

            // convert line to array to work with
            String[] wordsInLine = line.split(" ");

            // find numerical position of character in alphabet
            char firstCharInArray = wordsInLine[0].charAt(0);
            int rowIndex = firstCharInArray - 'a';

            // use numerical position to set synonyms[][] array to words corresponding to their starting letter
            for (int i = 0; i < wordsInLine.length && i + 1 < synonyms[rowIndex].length; i++) {
                synonyms[rowIndex][i + 1] = wordsInLine[i];
            }
        }
        // find correct row in array
        int rowIndex = targetChar.charAt(0) - 'a';

        // print row via for loop excluding first element in row and test for if there are any
        printSynonyms(synonyms, rowIndex, targetWord, targetChar);

        // close inputs and scanners when finished (b/c not using try-with-resources block, handled by `throws IOException` in main def
        console.close();
        synonymFile.close();
        inFile.close();
    }

    public static void printSynonyms(String[][] synonyms, int rowIndex, String targetWord, String targetChar) {
        boolean hasSynonyms = false;
        for (int i = 1; i < synonyms[rowIndex].length; i++) {
            if (synonyms[rowIndex][i] != null) {
                System.out.println(synonyms[rowIndex][i]);
                hasSynonyms = true;
            }
        }
        if (!hasSynonyms) System.out.printf("No synonyms for %s begin with %s.\n", targetWord, targetChar);
    }
}