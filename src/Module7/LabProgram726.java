package Module7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LabProgram726 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputName;
        int age;

        inputName = scnr.next();
        while (!inputName.equals("-1")) {
            try {
                age = scnr.nextInt();
                System.out.println(inputName + " " + (age + 1));
            } catch (Exception e){
                scnr.nextLine();
                age = 0;
                System.out.println(inputName + " " + age);
            }
            inputName = scnr.next();
        }
    }
}