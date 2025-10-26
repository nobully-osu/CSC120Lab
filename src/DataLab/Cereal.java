package DataLab;

/*
 * Class that represents a single Cereal object
 */
public class Cereal {
    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private double fiber;
    private double carbs;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;

    // constructor
    public Cereal(String initName, String initType, int initCal, int initProtein, int initFat, int initSodium,
                  double initFiber, double initCarbs, int initSugar, int initPotassium, int initVitamins,
                  int initShelf, double initWeight, double initCups, double initRating) {
        name = initName;
        type = initType;
        calories = initCal;
        protein = initProtein;
        fat = initFat;
        sodium = initSodium;
        fiber = initFiber;
        carbs = initCarbs;
        sugar = initSugar;
        potassium = initPotassium;
        vitamins = initVitamins;
        shelf = initShelf;
        weight = initWeight;
        cups = initCups;
        rating = initRating;
    }

    // getters
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getCalories() {
        return calories;
    }
    public int getProtein() {
        return protein;
    }
    public int getFat() {
        return fat;
    }
    public int getSodium() {
        return sodium;
    }
    public double getFiber() {
        return fiber;
    }
    public double getCarbs() {
        return carbs;
    }
    public int getSugar() {
        return sugar;
    }
    public int getPotassium() {
        return potassium;
    }
    public int getVitamins() {
        return vitamins;
    }
    public int getShelf() {
        return shelf;
    }
    public double getWeight() {
        return weight;
    }
    public double getCups() {
        return cups;
    }
    public double getRating() {
        return rating;
    }
    public int getSugarToProtein() {
        return (sugar / protein);
    }

    public String toString() {
        return "Cereal " + name + " Type: " + type + " Calories: " + calories + " Cups: " + cups
                + " Rating: " + rating;
    }
}