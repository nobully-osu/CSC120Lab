// a better way to do 726

package Module7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NameAgeChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputName;
        int age;

        inputName = scnr.next();
        try {
            while (!inputName.equals("-1")) {
                age = scnr.nextInt();
                System.out.println(inputName + " " + (age + 1));

                inputName = scnr.next();
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input type.");
        }
    }
}