package Module5;

import java.util.Scanner;

public class LabProgram519 {

    public static double activityCalories(String userActivity, int userMinutes) {
        double caloriesBurned = 0.0;
        final double SIT_CAL_PER_MIN = 1.4;
        final double WALK_CAL_PER_MIN = 5.4;
        final double RUN_CAL_PER_MIN = 13.0;
        final double BIKE_CAL_PER_MIN = 6.8;
        final double SWIM_CAL_PER_MIN = 8.7;

        caloriesBurned = switch (userActivity) {
            case "sit", "stand" -> SIT_CAL_PER_MIN * userMinutes;
            case "walk" -> WALK_CAL_PER_MIN * userMinutes;
            case "run" -> RUN_CAL_PER_MIN * userMinutes;
            case "bike" -> BIKE_CAL_PER_MIN * userMinutes;
            case "swim" -> SWIM_CAL_PER_MIN * userMinutes;
            default -> caloriesBurned;
        };
        return caloriesBurned;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userMinutes;
        String userActivity;

        userActivity = scnr.next();
        userMinutes = scnr.nextInt();

        System.out.println(activityCalories(userActivity, userMinutes));
    }
}