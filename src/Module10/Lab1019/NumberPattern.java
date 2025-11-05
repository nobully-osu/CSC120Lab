package Module10.Lab1019;

import java.util.Scanner;

public class NumberPattern {
    public static void printNumPattern(int i, int j) {
        System.out.print(i + " ");

        if (i < 0) return;

        printNumPattern(i - j, j);

        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        printNumPattern(num1, num2);
    }
}
