package Module9.Lab929;

import java.util.Scanner;

public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet myPet = new Pet();
        Cat myCat = new Cat();

        String petName, catName, catBreed;
        int petAge, catAge;

        petName = scnr.nextLine();
        petAge = scnr.nextInt();
        scnr.nextLine();
        catName = scnr.nextLine();
        catAge = scnr.nextInt();
        scnr.nextLine();
        catBreed = scnr.nextLine();

        // TODO: Create generic pet (using petName, petAge) and then call printInfo
        Pet generic = new Pet();
        generic.setName(petName);
        generic.setAge(petAge);
        generic.printInfo();

        // TODO: Create cat pet (using catName, catAge, catBreed) and then call printInfo
        Cat cat = new Cat();
        cat.setName(catName);
        cat.setAge(catAge);
        cat.setBreed(catBreed);
        cat.printInfo();
        System.out.println("   Breed: " + cat.getBreed());

        // TODO: Use getBreed(), to output the breed of the cat

    }
}