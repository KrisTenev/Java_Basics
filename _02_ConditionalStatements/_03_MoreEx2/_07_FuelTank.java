package _02_ConditionalStatements._03_MoreEx2;

import java.util.Scanner;

public class _07_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());

        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")){
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        }else {
            System.out.println("Invalid fuel!");
        }
    }
}
