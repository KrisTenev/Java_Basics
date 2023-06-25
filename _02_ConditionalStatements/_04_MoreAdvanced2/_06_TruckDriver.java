package _02_ConditionalStatements._04_MoreAdvanced2;

import java.util.Scanner;

public class _06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());
        double priceKm = 0;

        if (distance <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                priceKm = 0.75;
            } else if (season.equals("Summer")) {
                priceKm = 0.90;
            } else if (season.equals("Winter")) {
                priceKm = 1.05;
            }
        } else if (distance <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                priceKm = 0.95;
            } else if (season.equals("Summer")) {
                priceKm = 1.10;
            } else if (season.equals("Winter")) {
                priceKm = 1.25;
            }
        } else if (distance <= 20000) {
            priceKm = 1.45;
        }
        double salary = (4 * priceKm * distance)*0.90;
        System.out.printf("%.2f",salary);
    }
}
