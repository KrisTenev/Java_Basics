package _02_ConditionalStatements._03_MoreEx2;

import java.util.Scanner;

public class _04_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String tariff = scanner.nextLine();
        double price = 0;

        if (n < 20) {
            if (tariff.equals("day")) {
                price = 0.70 + 0.79 * n;
            } else if (tariff.equals("night")) {
                price = 0.70 + 0.90 * n;
            }
        } else if (n >= 100) {
            price = 0.06 * n;
        } else {
            price = 0.09 * n;
        }
        System.out.printf("%.2f", price);
    }
}
