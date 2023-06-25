package _02_ConditionalStatements._02_Exercises2;

import java.util.Scanner;

public class _05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;

        if (statist > 150)
        {
            clothesPrice = clothesPrice * 0.9;
        }
        double total = statist * clothesPrice + decor;
        double lefts = Math.abs(total - budget);

        if (total > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", lefts);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", lefts);
        }
    }
}
