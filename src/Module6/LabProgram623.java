package Module6;

import java.util.Scanner;

public class LabProgram623 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] yearlyValues = new int[12];
        int i;

        // Get array values
        for (i = 0; i < 12; ++i) {
            yearlyValues[i] = scnr.nextInt();
        }

        for (i = 0; i < 12; i += 4) {
            System.out.print(yearlyValues[i] + " ");
            System.out.print(yearlyValues[i + 1] + " ");
            System.out.print(yearlyValues[i + 2] + " ");
            System.out.println(yearlyValues[i + 3]);
        }
    }
}
