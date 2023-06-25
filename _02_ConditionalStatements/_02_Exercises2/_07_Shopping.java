package _02_ConditionalStatements._02_Exercises2;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoPrice = videoCards * 250.00;
        double procPrice = processors * videoPrice * 0.35;
        double ramPrice = ram * videoPrice * 0.10;
        double totalPrice = videoPrice + procPrice + ramPrice;

        if (videoCards > processors) {
            totalPrice = totalPrice * 0.85;
        }

        double lefts = Math.abs(budget - totalPrice);
        if (totalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", lefts);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", lefts);
        }
    }
}
