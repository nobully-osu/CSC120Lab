import java.util.Scanner;

public class LabProgram522 {
    public static int costForMilesGas(int milesDriven){
        final int MILES_PER_GALLON = 30;
        final int CENTS_PER_GAL = 4 * 100;

        return (milesDriven * CENTS_PER_GAL) / MILES_PER_GALLON;
    }

    public static int costForMilesMaintenance(int milesDriven){
        // convert to cents
        final int TIRES_CENTS = 500 * 100;
        final int TIRES_MILES = 20000;
        final int SERVICE_CENTS = 300 * 100;
        final int SERVICE_MILES = 10000;

        return ((milesDriven * TIRES_CENTS) / TIRES_MILES) + ((milesDriven * SERVICE_CENTS) / SERVICE_MILES);
    }

    public static String costForMiles(int milesDriven){
        int priceInCents = costForMilesGas(milesDriven) + costForMilesMaintenance(milesDriven);

        return String.format("%d cents", priceInCents);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int milesDriven = scnr.nextInt();
        System.out.println(costForMiles(milesDriven));
    }
}
