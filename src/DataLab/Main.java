package DataLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
        ArrayList<Cereal> allCereal = new ArrayList<Cereal>();
        
        String userCereal1 = "";
        String userCereal2 = "";
        Cereal c1 = null;
        Cereal c2 = null;
        boolean firstCereal = false;
        boolean secondCereal = false;

        // add all data from .csv into array list
        populateCerealList(allCereal);

        // get user input for first cereal to compare
        while(!firstCereal) {
            System.out.println("Which cereal would you like to start with?");
            userCereal1 = console.nextLine();
            for (Cereal cereal : allCereal) {
                if (userCereal1.equals(cereal.getName())) {
                    c1 = cereal;
                    System.out.println(c1);
                    firstCereal = true;
                    break;
                }
            }
        }

        // get user input for second cereal to compare
        while(!secondCereal) {
            System.out.println("Which cereal would you like to compare this to?");
            userCereal2 = console.nextLine();
            for (Cereal cereal : allCereal) {
                if (userCereal2.equals(cereal.getName())) {
                    c2 = cereal;
                    System.out.println(c2);
                    secondCereal = true;
                    break;
                }
            }
        }

        // perform comparison and print results
        healthiestCereal(c1, c2);
    }

    private static void populateCerealList(ArrayList<Cereal> allCereal) {
        // .csv file input
        // note: this file path is hard coded and not dynamic or grabbed from user input
        File inputFile = new File("C:\\Users\\Matthew\\IdeaProjects\\CSC120Lab\\src\\DataLab\\Cereal.csv");
        try (Scanner csvIn = new Scanner(inputFile)) {

            // skip header line
            if (csvIn.hasNextLine()) {
                csvIn.nextLine();
            }

            // read file and set variables accordingly
            while (csvIn.hasNextLine()) {
                String line = csvIn.nextLine();

                // skip blank lines
                if (line.isEmpty()) continue;

                String[] parts = line.split(",");

                // populate values for new cereal object
                String name = parts[0].trim();
                String type = parts[1].trim();
                int calories = Integer.parseInt(parts[2].trim());
                int protein = Integer.parseInt(parts[3].trim());
                int fat = Integer.parseInt(parts[4].trim());
                int sodium = Integer.parseInt(parts[5].trim());
                double fiber = Double.parseDouble(parts[6].trim());
                double carbs = Double.parseDouble(parts[7].trim());
                int sugar = Integer.parseInt(parts[8].trim());
                int potassium = Integer.parseInt(parts[9].trim());
                int vitamins = Integer.parseInt(parts[10].trim());
                int shelf = Integer.parseInt(parts[11].trim());
                double weight = Double.parseDouble(parts[12].trim());
                double cups = Double.parseDouble(parts[13].trim());
                double rating = Double.parseDouble(parts[14].trim());

                // new cereal object
                Cereal c = new Cereal(name, type, calories, protein, fat, sodium,
                        fiber, carbs, sugar, potassium, vitamins,
                        shelf, weight, cups, rating);

                // add to arraylist
                allCereal.add(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: .csv file not found.");
        }
    }

    public static void healthiestCereal(Cereal a, Cereal b) {
        if (a.getSugarToProtein() > b.getSugarToProtein()) System.out.println(b.getName() + " is the healthier cereal. ");
        else System.out.println(a.getName() + " is the healthier cereal. ");
    }
}