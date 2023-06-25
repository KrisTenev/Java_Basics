package _03_ConditionalStatementsAdvanced._01_Lab;

import java.util.Scanner;

public class _05_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double n = Double.parseDouble(scanner.nextLine());

        double productPrice = 0;

        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia":
                        productPrice = 0.50;
                        break;
                    case "Plovdiv":
                        productPrice = 0.40;
                        break;
                    case "Varna":
                        productPrice = 0.45;
                        break;
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    productPrice = 0.80;
                } else if (city.equals("Plovdiv") || city.equals("Varna")) {
                    productPrice = 0.70;
                }
                break;
            case "beer":
                if (city.equals("Sofia")) {
                    productPrice = 1.20;
                } else if (city.equals("Plovdiv")) {
                    productPrice = 1.15;
                } else if (city.equals("Varna")) {
                    productPrice = 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    productPrice = 1.45;
                } else if (city.equals("Plovdiv")) {
                    productPrice = 1.30;
                } else if (city.equals("Varna")) {
                    productPrice = 1.35;
                }
                break;
            case "peanuts":
                if (city.equals("Sofia")) {
                    productPrice = 1.60;
                } else if (city.equals("Plovdiv")) {
                    productPrice = 1.50;
                } else if (city.equals("Varna")) {
                    productPrice = 1.55;
                }
                break;
        }
        System.out.println(n * productPrice);
    }
}
