package Module7;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class LabProgram722 {
    public static void main(String[] args) throws IOException {
        /* var and other declarations */
        Scanner console = new Scanner(System.in);
        
        double midterm1Avg;
        double midterm2Avg;

        // read tsv file from user input
        String inputFileName = console.nextLine();
        Scanner in = new Scanner(inputFileName);
        // set output file name. can be more dynamic if needed.
        String outputFileName = "report.txt";

        /* perform operations on .tsv */
        // read each line and create a new value in the ArrayList corresponding to each line
        try (
                BufferedReader bufferRead = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter bufferWrite = new BufferedWriter(new FileWriter(outputFileName))
        ) {
            // create variable to set the buffer to a single line
            String line;

            // begin reading .tsv file
            while ((line = bufferRead.readLine()) != null) {
                String newLine = getLine(line);

                // write to file
                bufferWrite.write(newLine);
                bufferWrite.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* TODO: Compute student grades and exam averages, then output results to a text file here. */
        // compute student grades and overall exam averages

        // output text file via PrintWriter

    }

    public static String getLine(String line) {
        String[] parts = line.split("\t");

        double sum = 0.0;
        int count = 0;

        // iterate through new array of the parts of each line
        for (String part : parts) {
            try {
                // set current value equal to the next double in the line
                double value = Double.parseDouble(part);

                // set up avg calculation
                sum += value;
                count++;

                // skip non-numbered values in line
            } catch (NumberFormatException ignored) {

            }
        }
        // compute average
        double avg = (count > 0) ? (sum / count) : 0.0;

        // find letter grade
        char letterGrade = avgToLetterGrade(avg);

        // append letter grade as new column
        String newLine = line + "\t" + letterGrade;
        return newLine;
    }

    public static char avgToLetterGrade(double avg) {
        char letterGrade;

        if (avg >= 90) letterGrade = 'A';
        else if (avg >= 80) letterGrade = 'B';
        else if (avg >= 70) letterGrade = 'D';
        else if (avg >= 60) letterGrade = 'C';
        else letterGrade = 'F';

        return letterGrade;
    }
}