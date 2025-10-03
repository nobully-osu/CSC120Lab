import java.util.Scanner;

public class LabProgram532 {
    public static String createAcronym(String userPhrase) {
        // start at first character
        // check if uppercase via ascii table (we also only need to check the first character)
        // if uppercase, take letter and add "."
        // else move on to next word
        // once finished with phrase, return acronym

        StringBuilder acronym = new StringBuilder();

        for (int i = 0; i < userPhrase.length(); i++) {
            if (i == 0 || userPhrase.charAt(i - 1) == ' ') {
                char c =  userPhrase.charAt(i);

                if (Character.isUpperCase(c)) {
                    acronym.append(c).append('.');
                }
            }
        }
        return acronym.toString();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userPhrase = scnr.nextLine();
        System.out.println(createAcronym(userPhrase));
    }
}