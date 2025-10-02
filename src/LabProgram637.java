import java.util.Scanner;

public class LabProgram637 {
    public static int[] reverseFirstAndLastOfArray(int[] array, int length) {
        int t;

        t = array[0];
        array[0] = array[length - 1];
        array[length - 1] = t;

        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[] userValues = new int[length];   // List of integers from input

        for (int i = 0; i < length; i++) {
            userValues[i] = in.nextInt();
        }

        int[] modifiedUserValues = reverseFirstAndLastOfArray(userValues, length);

        for (int modifiedUserValue : modifiedUserValues) {
            System.out.print(modifiedUserValue + " ");
        }
        System.out.println();
    }
}