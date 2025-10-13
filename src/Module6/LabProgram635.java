package Module6;

import java.util.Arrays;
import java.util.Scanner;

public class LabProgram635 {
    public static int[] reverseArray(int[] arr, int length){
        int[] reversedArray = new int[length];

        for (int i = length - 1; i >= 0; --i){
            reversedArray[i] = arr[length - i - 1];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[] userValues = new int[length];

        for (int i = 0; i < length; ++i) {
            userValues[i] = in.nextInt();
        }

        int[] userValuesReverse = reverseArray(userValues, length);

        if (Arrays.equals(userValues, userValuesReverse)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}