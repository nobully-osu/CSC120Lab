package Module6;

import java.util.Scanner;

public class LabProgram626 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] userValues = new int[10];
        int i;

        int curVal;
        int[] valCounts = new int[100];
        int maxCount;
        int maxCountIndex;

        for (i = 0; i < 10; ++i) {
            userValues[i] = scnr.nextInt();
        }

        for (i = 0; i < 10; ++i) {
            curVal = userValues[i];
            if (curVal < 0 || curVal > 99) {
                System.out.println("Invalid input: " + curVal + " is not in 0-99");
                return;
            }
            ++valCounts[curVal];
        }
        maxCount = valCounts[0];
        maxCountIndex = 0;
        for (i = 0; i < 100; i++) {
            if (valCounts[i] > maxCount) {
                maxCount = valCounts[i];
                maxCountIndex = i;
            }
        }
        System.out.println(maxCountIndex + " " + maxCount);
    }
}