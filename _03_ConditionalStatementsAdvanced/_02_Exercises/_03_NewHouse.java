package _03_ConditionalStatementsAdvanced._02_Exercises;

import java.util.Scanner;

public class _03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price;
        double bill;

        switch (flower) {
            case "Roses":
                price = 5.00;
                bill = n * price;
                if (n > 80) {
                    bill = bill * 0.90;
                }
                break;
            case "Dahlias":
                price = 3.80;
                bill = n * price;
                if (n > 90) {
                    bill = bill * 0.85;
                }
                break;
            case "Tulips":
                price = 2.80;
                bill = n * price;
                if (n > 80) {
                    bill = bill * 0.85;
                }
                break;
            case "Narcissus":
                price = 3.00;
                bill = n * price;
                if (n < 120) {
                    bill = bill * 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                bill = n * price;
                if (n < 80) {
                    bill = bill * 1.20;
                }
                break;
            default:
                price = 0;
                bill = 0;
                break;
        }
        //Total & Discount
//        if (n > 80 && flower.equals("Rose")) {
//            bill = n * price * 0.90;
//        } else if (n > 90 && flower.equals("Dahlias")) {
//            bill = n * price * 0.85;
//        } else if (n > 80 && flower.equals("Tulips")) {
//            bill = n * price * 0.85;
//        } else if (n < 120 && flower.equals("Narcissus")) {
//            bill = n * price * 1.15;
//        } else if (n < 80 && flower.equals("Gladiolus")) {
//            bill = n * price * 1.20;
//        } else {
//            bill = n * price;
//        }

        if (budget < bill) {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - bill));
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", n, flower, Math.abs(budget - bill));
        }
    }
}
