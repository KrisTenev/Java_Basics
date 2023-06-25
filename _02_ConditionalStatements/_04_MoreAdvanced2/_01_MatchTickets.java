package _02_ConditionalStatements._04_MoreAdvanced2;

import java.util.Scanner;

public class _01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        if (group <= 4) {
            budget = budget * 0.25;
        } else if (group <= 9) {
            budget = budget * 0.40;
        } else if (group <= 24) {
            budget = budget * 0.50;
        } else if (group <= 49) {
            budget = budget * 0.60;
        } else {
            budget = budget * 0.75;
        }

        if (category.equals("VIP")) {
            ticketPrice = 499.99;
        } else if (category.equals("Normal")) {
            ticketPrice = 249.99;
        }

        double totalPrice = group * ticketPrice;
        double moneyLeft = Math.abs(budget - totalPrice);

        if (budget < totalPrice) {
            System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        }
    }
}
