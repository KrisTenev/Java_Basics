package _04_ForLoop._02_Exercises4;

import java.util.Scanner;

public class _04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        int brother = 0;

        double moneyBD = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyBD += 10.00 * i / 2;
                brother++;
            } else {
                toys++;
            }
        }

        double toysTotal = toys * toyPrice;
        double totalMoney = toysTotal + moneyBD - brother;

        if (washPrice <= totalMoney) {
            System.out.printf("Yes! %.2f", totalMoney - washPrice);
        } else {
            System.out.printf("No! %.2f", washPrice - totalMoney);
        }
    }
}
