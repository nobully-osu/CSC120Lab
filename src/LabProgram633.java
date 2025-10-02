import java.util.Scanner;

public class LabProgram633 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int numberOfWords =  in.nextInt();
        String[] words = new String[numberOfWords];
        int[] frequency = new int[numberOfWords];

        for (int i = 0; i < numberOfWords; i++) {
            words[i] = in.next();
        }

        for (int i = 0; i < numberOfWords; i++) {
            String currentWord = words[i];
            for (String word : words) {
                if (currentWord.equals(word)) {
                    frequency[i]++;
                }
            }
        }

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i] + " - " + frequency[i]);
        }
    }
}
