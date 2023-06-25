package _02_ConditionalStatements._04_MoreAdvanced2;

import java.util.Scanner;

public class _05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accommodation;
        String location;
        double price = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.65;
            } else {
                location = "Morocco";
                price = budget * 0.45;
            }
        } else if (budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("Summer")) {
                location = "Alaska";
                price = budget * 0.80;
            } else {
                location = "Morocco";
                price = budget * 0.60;
            }
        } else {
            accommodation = "Hotel";
            price = budget * 0.90;
            if (season.equals("Summer")) {
                location = "Alaska";
            } else {
                location = "Morocco";
            }
        }

        System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}
