package _03_ConditionalStatementsAdvanced._02_Exercises;

import java.util.Scanner;

public class _04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        //       "Spring", "Summer", "Autumn", "Winter"
        int fisherMans = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }

        if (fisherMans <= 6) {
            boatPrice = boatPrice * 0.90;
        } else if (fisherMans <= 11) {
            boatPrice = boatPrice * 0.85;
        } else {
            boatPrice = boatPrice * 0.75;
        }

        if (fisherMans % 2 == 0 && !season.equals("Autumn")) {
            boatPrice = boatPrice * 0.95;
        }

        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
        }
    }
}
