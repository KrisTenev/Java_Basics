package _02_ConditionalStatements._02_Exercises2;

import java.util.Scanner;

public class _04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalSum = puzzle * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int count = puzzle + dolls + bears + minions + trucks;
        boolean isDiscount = count >= 50;

        if (isDiscount) {
            totalSum = totalSum - (totalSum * 0.25);
        }

        totalSum = totalSum - (totalSum * 0.10);

        if (totalSum >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", totalSum - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalSum - tripPrice));
        }
    }
}
