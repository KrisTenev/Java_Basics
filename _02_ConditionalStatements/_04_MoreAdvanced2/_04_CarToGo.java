package _02_ConditionalStatements._04_MoreAdvanced2;

import java.util.Scanner;

public class _04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String carType;
        double price = 0;

        if (season.equals("Summer")) {
            carType = "Cabrio";
        } else {
            carType = "Jeep";
        }

        if (budget <= 100) {
            carClass = "Economy class";
        } else if (budget <= 500) {
            carClass = "Compact class";
        } else if (budget > 500) {
            carClass = "Luxury class";
            price = budget * 0.90;
            carType = "Jeep";
        }

        if (carType.equals("Cabrio") && carClass.equals("Economy class")) {
            price = budget * 0.35;
        } else if (carType.equals("Cabrio") && carClass.equals("Compact class")) {
            price = budget * 0.45;
        } else if (carType.equals("Jeep") && carClass.equals("Economy class")) {
            price = budget * 0.65;
        } else if (carType.equals("Jeep") && carClass.equals("Compact class")) {
            price = budget * 0.80;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, price);

    }
}
