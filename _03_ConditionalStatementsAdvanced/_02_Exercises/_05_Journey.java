package _03_ConditionalStatementsAdvanced._02_Exercises;

import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String country = "";
        String type = "";
        double spend = 0;

        if (budget <= 100) {
            country = "Bulgaria";
            if (season.equals("summer")) {
                type = "Camp";
                spend = budget * 0.30;
            } else if (season.equals("winter")) {
                type = "Hotel";
                spend = budget * 0.70;
            }
        } else if (100 < budget && budget <= 1000) {
            country = "Balkans";
            if (season.equals("summer")) {
                type = "Camp";
                spend = budget * 0.40;
            } else if (season.equals("winter")) {
                type = "Hotel";
                spend = budget * 0.80;
            }
        }else if (budget > 1000) {
            country = "Europe";
            type = "Hotel";
            spend = budget * 0.90;
        }

        System.out.printf("Somewhere in %s\n", country);
        System.out.printf("%s - %.2f", type, spend);
    }
}
