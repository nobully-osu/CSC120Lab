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

                // input column values and update counts, must skip 2 to start at correct index
                for (int i = 2; i < parts.length; i++){
                    try {
                        double value = Double.parseDouble(parts[i]);
                        colSums[i - 2] += value;
                        colCounts[i - 2]++;
                    } catch (NumberFormatException ignored) {}
                }
            }

            // append new line and output column averages line after
            StringBuilder averages = new StringBuilder("Averages:"); // start with string "Averages:" and append necessary info
            // we need to stop at "length - 2" because we want to skip the empty values
            for (int i = 0; i < colSums.length - 2; i++) {
                double avg = (colCounts[i] > 0) ? (colSums[i] / colCounts[i]) : 0.0;
                // same here, but offset by 3 instead of the typical 1
                if (i != colSums.length - 3) {
                    String midtermNumber = "Midterm" + (i + 1);
                    averages.append(" ").append(midtermNumber).append(" ").append(String.format("%.2f", avg)).append(",");
                } else {
                    averages.append(" ").append("Final ").append(String.format("%.2f", avg));
                }
            }

            // write to file
            bufferWrite.newLine();
            bufferWrite.write(String.valueOf(averages));
            bufferWrite.newLine();

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
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
}