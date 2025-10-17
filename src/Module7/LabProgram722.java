package Module7;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class LabProgram722 {
    public static void main(String[] args) throws IOException {
        /* var and other declarations */
        Scanner console = new Scanner(System.in);

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
            double[] colSums = new double[0];
            int[] colCounts = new int[0];

            // begin reading .tsv file
            while ((line = bufferRead.readLine()) != null) {
                // calculate average for each student and append letter grade to end
                String newLine = appendLetterGrade(line);

                // update tsv output with appended letter grades
                bufferWrite.write(newLine);
                bufferWrite.newLine();

                // track column sums/counts and grow as needed
                String[] parts = line.split("\t");
                if (parts.length > colSums.length) {
                    colSums = Arrays.copyOf(colSums, parts.length);
                    colCounts = Arrays.copyOf(colCounts, parts.length);
                }

                for (int i = 0; i < parts.length; i++){
                    try {
                        double value = Double.parseDouble(line);
                        colSums[i] += value;
                        colCounts[i]++;
                    } catch (NumberFormatException ignored) {}
                }

                StringBuilder averages = new StringBuilder("Averages:");
                for (int i = 0; i < colSums.length; i++) {
                    double avg = (colCounts[i] > 0) ? (colSums[i] / colCounts[i]) : 0.0;
                    averages.append(" ").append(String.format("%.2f", avg));
                }
            }
            // append new line and output column averages line after
            bufferWrite.newLine();
            bufferWrite.write(String.valueOf(averages));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String appendLetterGrade(String line) {
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
            } catch (NumberFormatException ignored) {}
        }
        // compute average
        double avg = (count > 0) ? (sum / count) : 0.0;

        // find letter grade
        char letterGrade = avgToLetterGrade(avg);

        // append letter grade as new column
        return line + "\t" + letterGrade;
    }

    public static char avgToLetterGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'D';
        else if (avg >= 60) return 'C';
        else return 'F';
    }
}