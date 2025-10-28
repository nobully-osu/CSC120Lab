package Module9.Lab932;

import java.util.Scanner;
import java.util.ArrayList;

public class PlantArrayListExample {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = "";
        // declare plant arraylist
        ArrayList<Plant> myGarden = new ArrayList<>();

        // user input loop
        // get user input, split at every " ", store in a temporary array and add to the ArrayList
        // check for type by checking first array value string
        while (true) {
            // get user input from console
            input = console.nextLine().trim();

            // break at sentinel value
            if (input.equals("-1")) break;

            String[] parts = input.split(" ");
            if (parts[0].equals("plant")) {
                String plantName = parts[1];
                String plantCost = parts[2];

                Plant plant = new Plant();
                plant.setPlantName(plantName);
                plant.setPlantCost(plantCost);

                myGarden.add(plant);
            } else {
                String flowerName = parts[1];
                String flowerCost = parts[2];
                boolean isAnnualBoolean = parts[3].equals("true");
                String colorOfFlowers = parts[4];

                Flower flower = new Flower();
                flower.setPlantName(flowerName);
                flower.setPlantCost(flowerCost);
                flower.setPlantType(isAnnualBoolean);
                flower.setColorOfFlowers(colorOfFlowers);

                myGarden.add(flower);
            }
        }

        // print ArrayList
        printArrayList(myGarden);

    }

    public static void printArrayList(ArrayList<Plant> inputArrayList) {
        for (int i = 0; i < inputArrayList.size(); i++) {
            Plant plant = inputArrayList.get(i);
            int n = i + 1;

            System.out.printf("Plant %d Information: \n", n);
            plant.printInfo();
            System.out.print("\n");
        }
    }
}
