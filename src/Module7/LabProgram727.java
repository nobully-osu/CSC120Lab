package Module7;

import java.util.Scanner;

public class LabProgram727 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
        int index;

        index = scnr.nextInt();

        try {
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (index < 0) {
                System.out.printf("""
                        Exception! Index %d out of bounds for length %d
                        The closest name is: %s
                        """, index, names.length, names[0]);
            } else if (index > 9) {
                System.out.printf("""
                        Exception! Index %d out of bounds for length %d
                        The closest name is: %s
                        """, index, names.length, names[9]);
            }
        }
    }
}