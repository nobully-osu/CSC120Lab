package Module5;

import java.util.Scanner;
import java.util.Random;

public class LabProgram534 {

    public static String coinFlip(Random rand){
        String result = "";
        int r = rand.nextInt(2);
        if (r == 1){
            result = "Heads";
        } else {
            result = "Tails";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2); // Seed used in develop mode

        // get number of coin flips
        int userFlips = scnr.nextInt();

        // call coinFlip() and loop for the desired number of coin flips and print results
        for (int i = 0; i < userFlips; i++){
            System.out.println(coinFlip(rand));
        }
    }
}