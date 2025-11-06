package Module10.Lab1015;

import java.util.Scanner;

public class LabProgram {

    public static String reverseString(String stringToReverse) {
        if (stringToReverse.length() == 1) {
            return stringToReverse;
        } else {
            String substring = stringToReverse.substring(1);
            return (reverseString(substring)) + stringToReverse.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input, result;

        input = scnr.nextLine();
        result = reverseString(input);
        System.out.printf("Reverse of \"%s\" is \"%s\".", input, result);
    }
}
